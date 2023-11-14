package petrinet.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import petrinet.Arc;
import petrinet.PetriNetwork;
import petrinet.Place;
import petrinet.Transition;
import petrinet.exceptions.ExistingObjectException;
import petrinet.exceptions.NegativeTokenInsertedException;
import petrinet.exceptions.NoExistingObjectException;

class TransitionTest {

	@Test
	void TransitionConstructorNoExistingObjectExceptionTest() throws NoExistingObjectException {
		
		ArrayList<Arc> inArcs = new ArrayList<Arc>();
		ArrayList<Arc> outArcs = new ArrayList<Arc>();
		
		assertThrows(NoExistingObjectException.class, () -> {new Transition(inArcs, outArcs);});

	}
	
	@Test 
	void TransitionConstructorTest() throws NoExistingObjectException {
		
		// Simple Transition initiator
		Transition t_ = new Transition();
		
		ArrayList<Arc> inArcs = new ArrayList<Arc>();
		ArrayList<Arc> outArcs = new ArrayList<Arc>();
		
		Arc arc1 = new Arc();
		Arc arc2 = new Arc();
		
		inArcs.add(arc1);
		outArcs.add(arc2);
		
		Transition t = new Transition(inArcs, outArcs);
	}
	
	@Test 
	void fireableTest() {
		Transition t = new Transition();
		assertEquals(t.fireable(), true);
	}
	
	@Test
	void toStringTest() {
		
		ArrayList<Transition> transitions = new ArrayList<Transition>();
		Transition t = new Transition();
		transitions.add(t);
		
		PetriNetwork pn = new PetriNetwork(new ArrayList<Place>(), transitions, new ArrayList<Arc>());
		
		assertEquals(t.getId(), "T_1");
		assertEquals(t.toString(), "T_1");
	}
	
	@Test
	void InArcsTest() {
		Transition t = new Transition();
		
		ArrayList<Arc> inArcs = new ArrayList<Arc>();
		
		Arc arc1 = new Arc();
		Arc arc2 = new Arc();
		
		inArcs.add(arc1); 
		inArcs.add(arc2);
		
		t.setInArcs(inArcs);
		
		Arc arc3 = new Arc();
		
		t.addInArc(arc3);
		
		ArrayList<Arc> inArcs_ = t.getInArcs();

	}
	
	@Test
	void OutArcsTest() {
		Transition t = new Transition();
		
		ArrayList<Arc> outArcs = new ArrayList<Arc>();
		
		Arc arc1 = new Arc();
		Arc arc2 = new Arc();
		
		outArcs.add(arc1); 
		outArcs.add(arc2);
		
		t.setOutArcs(outArcs);
		
		Arc arc3 = new Arc();
		
		t.addOutArc(arc3);
		
		ArrayList<Arc> outArcs_ = t.getOutArcs();

	}
	
	
	@Test
	void fireNotPossibleTest() throws NegativeTokenInsertedException, NoExistingObjectException, ExistingObjectException {
		Transition t = new Transition();
		
		ArrayList<Arc> inArcs = new ArrayList<Arc>();
		ArrayList<Arc> outArcs = new ArrayList<Arc>();
		
		Place place = new Place(1);
		
		Arc inArc1 = new Arc();
		inArc1.setWeight(2);
		inArc1.setStart(place);
		
		Arc outArc1 = new Arc();
	
		
		t.addInArc(inArc1);
		t.addOutArc(outArc1);
		
		t.fire();
	}
	
	@Test
	void firePossibleTest() throws NegativeTokenInsertedException, NoExistingObjectException, ExistingObjectException {
		Transition t = new Transition();
		
		ArrayList<Arc> inArcs = new ArrayList<Arc>();
		ArrayList<Arc> outArcs = new ArrayList<Arc>();
		
		Place place = new Place(3);
		
		Arc inArc1 = new Arc();
		inArc1.setWeight(1);
		inArc1.setStart(place);
		
		Arc outArc1 = new Arc();
	
		
		t.addInArc(inArc1);
		t.addOutArc(outArc1);
		
		t.fire();
	}

}
