package petrinet.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import petrinet.Arc;
import petrinet.PetriNetwork;
import petrinet.Place;
import petrinet.Transition;
import petrinet.exceptions.ExistingObjectException;
import petrinet.exceptions.NegativeTokenInsertedException;
import petrinet.exceptions.NoExistingObjectException;

class ArcTest {

	@Test
	void ArcConstructorTest() {
		Arc arc = new Arc();
		
		assertEquals(1, arc.getWeight());
	}
	
	@Test
	void setStartPlaceExistingObjectExceptionTest() throws ExistingObjectException {
		
		Arc arc = new Arc();
		Place p1 = new Place();
		arc.setStart(p1);
		
		assertThrows(ExistingObjectException.class, () -> {arc.setStart(p1);});
	    
	}
	
	@Test
	void setStartTransitionExistingObjectExceptionTest() throws ExistingObjectException {
		
		Arc arc = new Arc();
		Transition t1 = new Transition();
		arc.setStart(t1);
		
		assertThrows(ExistingObjectException.class, () -> {arc.setStart(t1);});
	    
	}

	@Test
	void setEndtWithPlace() throws NoExistingObjectException, ExistingObjectException {
		
		Arc arc = new Arc();
		Place p1 = new Place();
		p1.setId("P_1");
		arc.setEnd(p1);
	}
	
	@Test
	void setEndWithTransition() throws NoExistingObjectException, ExistingObjectException {
		
		Arc arc = new Arc();
		Transition t1 = new Transition();
		t1.setId("T_1");
		arc.setEnd(t1);
	}	
	
	@Test
	void setEndPlaceExistingObjectExceptionTest() throws ExistingObjectException {
		
		Arc arc = new Arc();
		Place p1 = new Place();
		arc.setEnd(p1);
		
		assertThrows(ExistingObjectException.class, () -> {arc.setEnd(p1);});
	    
	}
	
	@Test
	void setEndTransitionExistingObjectExceptionTest() throws ExistingObjectException {
		
		Arc arc = new Arc();
		Transition t1 = new Transition();
		arc.setEnd(t1);
		
		assertThrows(ExistingObjectException.class, () -> {arc.setEnd(t1);});
	    
	}

	@Test
	void setEndWithPlace() throws NoExistingObjectException, ExistingObjectException {
		
		Arc arc = new Arc();
		Place p1 = new Place();
		p1.setId("P_1");
		arc.setStart(p1);
	}
	
	@Test
	void setStartWithTransition() throws NoExistingObjectException, ExistingObjectException {
		
		Arc arc = new Arc();
		Transition t1 = new Transition();
		t1.setId("T_1");
		arc.setStart(t1);
	}	
	
	@Test
	void updatePlaceTest() throws ExistingObjectException {
		
		Arc arc = new Arc();
		Place place = new Place();
		
		place.setNbTokens(2);
		
		arc.setStart(place);
		
		arc.updatePlace();
	
		assertEquals(place.getNbTokens(), 1);
		
		arc = new Arc();
		place = new Place();
		
		place.setNbTokens(2);
		
		arc.setEnd(place);
		
		arc.updatePlace();
	
		assertEquals(place.getNbTokens(), 3);
		
	}
	
	@Test
	void setWeightTest() throws NegativeTokenInsertedException {
		Arc arc = new Arc();
		
		arc.setWeight(2);
		
		assertEquals(arc.getWeight(), 2);
		
	    assertThrows(NegativeTokenInsertedException.class, () -> {arc.setWeight(-1);});
	}
	
	@Test
	void getId() {
		Arc arc = new Arc();
		
		arc.setId("A_1");
		
		assertEquals(arc.getId(), "A_1");
	}
	
	@Test
	void getStartNoExistingObjectExceptionTest() {
		Arc arc = new Arc();
		
	    assertThrows(NoExistingObjectException.class, () -> {arc.getStart();});

	}
	
	@Test
	void getEndNoExistingObjectExceptionTest() {
		Arc arc = new Arc();
		
	    assertThrows(NoExistingObjectException.class, () -> {arc.getEnd();});

	}
	
	@Test
	void getStartPlaceTest() throws ExistingObjectException, NoExistingObjectException {
		Arc arc = new Arc();
		Place place = new Place();
		
		arc.setStart(place);
		Place p = (Place) arc.getStart();
	}
	
	@Test
	void getStartTransitionTest() throws ExistingObjectException, NoExistingObjectException {
		Arc arc = new Arc();
		Transition place = new Transition();
		
		arc.setStart(place);
		Transition t = (Transition) arc.getStart();
	}
	
	@Test
	void getEndPlaceTest() throws ExistingObjectException, NoExistingObjectException {
		Arc arc = new Arc();
		Place place = new Place();
		
		arc.setEnd(place);
		Place p = (Place) arc.getEnd();
	}
	
	@Test
	void getEndTransitionTest() throws ExistingObjectException, NoExistingObjectException {
		Arc arc = new Arc();
		Transition place = new Transition();
		
		arc.setEnd(place);
		Transition t = (Transition) arc.getEnd();
	}
	
}


