package petrinet.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import petrinet.Arc;
import petrinet.PetriNetwork;
import petrinet.Place;
import petrinet.Transition;
import petrinet.exceptions.ExistingObjectException;
import petrinet.exceptions.NegativeTokenInsertedException;
import petrinet.exceptions.NoExistingObjectException;

class PetriNetworkTest {
	
	private ArrayList<Place> places = new ArrayList<Place>();
	private ArrayList<Transition> transitions = new ArrayList<Transition>();
	private ArrayList<Arc> arcs = new ArrayList<Arc>(); 

	@BeforeEach
	void BeforeAll() throws NegativeTokenInsertedException, ExistingObjectException {
		Place p1 = new Place(2);
		Place p2 = new Place(1);
		
		Arc a1 = new Arc();
		Arc a2 = new Arc();

		Transition t1 = new Transition();
		
		Arc a3 = new Arc();
		
		Place p3 = new Place(3);
		
		p1.setOutArc(a1);
		p2.setOutArc(a2);
		
		a1.setStart(p1);
		a1.setEnd(t1);
		a1.setWeight(2);	

		a2.setStart(p2);
		a2.setEnd(t1);
		a2.setWeight(2);

		t1.addInArc(a1);
		t1.addInArc(a2);

		t1.addOutArc(a3);
		
		a3.setStart(t1);
		a3.setEnd(p2);
		
		p3.setInArc(a3);
		
		this.places.add(p1);
		this.places.add(p2);
		this.places.add(p3);
		
		this.transitions.add(t1);
		
		this.arcs.add(a1);
		this.arcs.add(a2);
		this.arcs.add(a3);
	}
	
	@Test
	void PetriNetworkConstructorTest() {
		PetriNetwork pn = new PetriNetwork(this.places, this.transitions, this.arcs);
	}
	
	@Test
	void deletePlaceTest() {
		PetriNetwork pn = new PetriNetwork(this.places, this.transitions, this.arcs);
		
		Place p4 = new Place();
		
		pn.addPlace(p4);
		
		assertEquals(pn.getPlaces().size(), 4);
				
		pn.deletePlace(p4);
				
		assertEquals(pn.getPlaces().size(), 3);
	}
	
	@Test
	void deleteArcTest() {
		PetriNetwork pn = new PetriNetwork(this.places, this.transitions, this.arcs);
		
		Arc arc4 = new Arc();
		
		pn.addArc(arc4);
		
		assertEquals(pn.getArcs().size(), 4);
				
		pn.deleteArc(arc4);
				
		assertEquals(pn.getArcs().size(), 3);
	}
	
	@Test
	void deleteTransitionTest() {
		PetriNetwork pn = new PetriNetwork(this.places, this.transitions, this.arcs);
		
		Transition t2 = new Transition();
		
		pn.addTransition(t2);
		
		assertEquals(pn.getTransitions().size(), 2);
				
		pn.deleteTransition(t2);
				
		assertEquals(pn.getTransitions().size(), 1);
	}
	
	@Test
	void fireTransitionTest() throws NoExistingObjectException {
		PetriNetwork pn = new PetriNetwork(this.places, this.transitions, this.arcs);
		Transition t1 = pn.getTransitions().get(0);
				
		pn.fireTransition(t1);
	}
	
	@Test
	void fireAllTransitionTest() throws NoExistingObjectException {
		PetriNetwork pn = new PetriNetwork(this.places, this.transitions, this.arcs);				
		pn.fireAll();
	}
	
	@Test
	void getPositionTest() {
		PetriNetwork pn = new PetriNetwork(this.places, this.transitions, this.arcs);				
		assertEquals(pn.getPlacePosition(), 4);
		assertEquals(pn.getArcPosition(), 4);
		assertEquals(pn.getTransitionPosition(), 2);
	}
	
	@Test
	void toStringTest() {
		PetriNetwork pn = new PetriNetwork(this.places, this.transitions, this.arcs);				
		
		String res = "----------Places---------- \n"
				+ "P_1 -- A_1\n"
				+ "P_2 -- A_2\n"
				+ "A_3 -- P_3\n"
				+ "--------Transitions------- \n"
				+ "A_1 -- T_1 -- A_3\n"
				+ "A_2 -- T_1 -- A_3\n"
				+ "-----------Arcs----------- \n"
				+ "P_1 -- A_1 -- T_1\n"
				+ "P_2 -- A_2 -- T_1\n"
				+ "T_1 -- A_3 -- P_2";
		
		System.out.println(pn);
	}

}
