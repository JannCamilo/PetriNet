package petrinet;

import java.util.ArrayList;
import java.util.List;

/**
 * The 'PetriNetwork' class represents a Petri net with places, transitions, and arcs.
 * It implements the IPetriNetwork interface, providing methods to manipulate and analyze the network.
 */
public class PetriNetwork implements IPetriNetwork {
	
	private ArrayList<Place> places = new ArrayList<Place>();
	private ArrayList<Transition> transitions = new ArrayList<Transition>();
	private ArrayList<Arc> arcs = new ArrayList<Arc>();
	
	private int placePosition = 1;
	private int transitionPosition = 1;
	private int arcPosition = 1;
	
	protected String s = " -- ";
	
	/**
	 * Constructs a new PetriNetwork with specified lists of places, transitions, and arcs.
	 * @param places The list of places in the Petri network.
	 * @param transitions The list of transitions in the Petri network.
	 * @param arcs The list of arcs in the Petri network.
	 */
	public PetriNetwork(ArrayList<Place> places, ArrayList<Transition> transitions, ArrayList<Arc> arcs) {
		
		for (Place p : places) {
			  this.addPlace(p);
		}
		
		for (Transition t : transitions) {
			  this.addTransition(t);
		}
		
		for (Arc a : arcs) {
			  this.addArc(a);
		}
	}
	
	/**
	 * Constructs a new empty PetriNetwork.
	 */
	public PetriNetwork() {}

	@Override
	public void fireAll() {
		// TODO Auto-generated method stub
        for (Transition t : this.transitions) {
            t.fire();
        }		
	}

	@Override
	public void addPlace(Place place) {
		place.setId("P_"+this.placePosition);
		this.placePosition++;
		this.places.add(place);
	}

	@Override
	public void addArc(Arc arc) {
		arc.setId("A_"+this.arcPosition);
		this.arcPosition++;
		this.arcs.add(arc);
		
	}

	@Override
	public void addTransition(Transition transition) {
		transition.setId("T_"+this.transitionPosition);
		this.transitionPosition++;
		this.transitions.add(transition);
		
	}

	@Override
	public void deletePlace(Place place) {
		// TODO Auto-generated method stub
		this.places.remove(place);
		
	}

	@Override
	public void deleteArc(Arc arc) {
		// TODO Auto-generated method stub
		this.arcs.remove(arc);
		
	}

	@Override
	public void deleteTransition(Transition transition) {
		this.transitions.remove(transition);
		
	}

	@Override
	public void fireTransition(Transition transition) {
		// TODO Auto-generated method stub
		
		if (transition.fireable()){
			transition.fire();
		}
	}
	
	/**
	 * Retrieves the list of places in the Petri network.
	 * @return The list of places.
	 */
	public List<Place> getPlaces() {
		return this.places;	
	}
	
	/**
	 * Sets the list of places in the Petri network.
	 * @param places The list of places to be set.
	 */
	public void setPlaces(ArrayList<Place> places) {
		this.places = places;	
	}
	
	/**
	 * Retrieves the list of transitions in the Petri network.
	 * @return The list of transitions.
	 */
	public List<Transition> getTransitions() {
		return this.transitions;
	}	
	
	/**
	 * Sets the list of transitions in the Petri network.
	 * @param transitions The list of transitions to be set.
	 */
	public void setTransiions(ArrayList<Transition> transitions) {
		this.transitions = transitions;
	}	
	/**
	 * Retrieves the list of arcs in the Petri network.
	 * @return The list of arcs.
	 */
	public List<Arc> getArcs() {
		return this.arcs;
	}
	
	/**
	 * Sets the list of arcs in the Petri network.
	 * @param arcs set the arcs inside the Petri Network.
	 */
	public void setArcs(ArrayList<Arc> arcs) {
		this.arcs = arcs;
	}
	
	/**
	 * Returns a string representation of the Petri network.
	 * @return A string representing the Petri network.
	 */
	public String toString() {
		
		// Fazer isso aqui num while true rodando em tudo partindo do começo
		String res = "";
		
		res += "----------Places---------- \n";

		for (Place p : this.places) {
			
			Arc inArc = p.getInArc();
			Arc outArc = p.getOutArc();
			
			res += ((inArc != null ? inArc.toString() + this.s : "") + p.toString() + (outArc != null ? this.s + outArc.toString() : ""));
			res += "\n";
		}
		
		res += "--------Transitions------- \n";
		
		for (Transition t : this.transitions) {
			
			Arc inArc = t.getInArc();
			Arc outArc = t.getOutArc();
			
			res += ((inArc != null ? inArc.toString() + this.s : "") + t.toString() + (outArc != null ? this.s + outArc.toString() : ""));
			res += "\n";
		}
		
		res += "-----------Arcs----------- \n";
		
		for (Arc a : this.arcs) {
			
			System.out.println(a);
			
			Object start = a.getStart();
			Object end = a.getEnd();
			
			System.out.println(end);
			
			res += ((start != null ? start.toString() + this.s : "") + a.toString() + (end != null ? this.s + end.toString() : ""));
			res += "\n";
		}
		
		return res;
	}
	
	/**
	 * @return the placePosition
	 */
	public int getPlacePosition() {
		return placePosition;
	}

	/**
	 * @param placePosition the placePosition to set
	 */
	public void setPlacePosition(int placePosition) {
		this.placePosition = placePosition;
	}

	/**
	 * @return the transitionPosition
	 */
	public int getTransitionPosition() {
		return transitionPosition;
	}

	/**
	 * @param transitionPosition the transitionPosition to set
	 */
	public void setTransitionPosition(int transitionPosition) {
		this.transitionPosition = transitionPosition;
	}

	/**
	 * @return the arcPosition
	 */
	public int getArcPosition() {
		return arcPosition;
	}

	/**
	 * @param arcPosition the arcPosition to set
	 */
	public void setArcPosition(int arcPosition) {
		this.arcPosition = arcPosition;
	}
	
	public static void main(String[] args) {
		
		PetriNetwork pn1 = new PetriNetwork();
		
		Place p1 = new Place(2);
		Arc a1 = new Arc();
		Transition t1 = new Transition();
		Arc a2 = new Arc();
		Place p2 = new Place();
		
		p1.setOutArc(a1);
		a1.setStart(p1);
		a1.setEnd(t1);
		t1.setInArc(a1);
		t1.setOutArc(a2);
		a2.setStart(t1);
		a2.setEnd(p2);
		p2.setInArc(a2);
		
		Object b = a1.getEnd();
		
		
		pn1.addPlace(p1);
		pn1.addArc(a1);
		pn1.addTransition(t1);
		pn1.addArc(a2);		
		pn1.addPlace(p2);
		
//		System.out.println("Transitions: " + pn1.transitions);
//		System.out.println("Arcs: " + pn1.arcs);
//		System.out.println("Places: " + pn1.places);
		
		System.out.println(pn1.toString());

		
	}

}
	


	

