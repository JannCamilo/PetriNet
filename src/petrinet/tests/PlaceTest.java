package petrinet.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import petrinet.Arc;
import petrinet.PetriNetwork;
import petrinet.Place;
import petrinet.exceptions.ExistingObjectException;
import petrinet.exceptions.NegativeTokenInsertedException;

class PlaceTest {

	@Test
	void PlaceConstructorTest() throws NegativeTokenInsertedException {
		Place p = new Place();
		assertEquals(p.getNbTokens(), 0);
		
		p = new Place(4);
		assertEquals(p.getNbTokens(), 4);
		
		assertThrows(NegativeTokenInsertedException.class, () -> {new Place(-2);});

		Arc inArc = new Arc();
		Arc outArc = new Arc();
		
		assertThrows(NegativeTokenInsertedException.class, () -> {new Place(-2, inArc, outArc);});
		
		Place p2 = new Place(2, inArc, outArc);
	}
	
	@Test
	void setNbTokensTest() {
		Place p = new Place();
		p.setNbTokens(2);
		assertEquals(p.getNbTokens(), 2);
	}
	
	@Test
	void setArc() {
		Place p = new Place();
		Arc inArc = new Arc();
		Arc outArc = new Arc();
		
		p.setInArc(inArc);
		p.setOutArc(outArc);
		
		Arc inArc_ = p.getInArc();
		Arc outArc_ = p.getOutArc();
	}
	
	@Test
	void toStringTest() {
		PetriNetwork pn1 = new PetriNetwork();
		Place place = new Place();
		
		assertEquals(place.toString(), "");
		
		pn1.addPlace(place);
		
		assertEquals(place.toString(), "P_1");
	}
	
	@Test
	void getId() {
		Place place = new Place();
		
		place.setId("P_1");
		
		assertEquals(place.getId(), "P_1");
	}

}
