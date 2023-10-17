package petrinet;

import java.util.List;

/**
 * The 'PetriNetwork' class represents a Petri net with places, transitions, and arcs.
 * It implements the IPetriNetwork interface, providing methods to manipulate and analyze the network.
 */
public class PetriNetwork implements IPetriNetwork {
	
	private List<Place> places;
	private List<Transition> transitions;
	private List<Arc> arcs;
	
	/**
	 * Constructs a new PetriNetwork with specified lists of places, transitions, and arcs.
	 * @param places The list of places in the Petri network.
	 * @param transitions The list of transitions in the Petri network.
	 * @param arcs The list of arcs in the Petri network.
	 */
	public PetriNetwork(List<Place> places, List<Transition> transitions, List<Arc> arcs) {
		this.places.addAll(places);
		this.transitions.addAll(transitions);
		this.arcs.addAll(arcs);
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
		// TODO Auto-generated method stub
		this.places.add(place);
	}

	@Override
	public void addArc(Arc arc) {
		// TODO Auto-generated method stub
		this.arcs.add(arc);
		
	}

	@Override
	public void addTransition(Transition transition) {
		// TODO Auto-generated method stub
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
	public void setPlaces(List<Place> places) {
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
	public void setTransiions(List<Transition> transitions) {
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
	 */
	public void setArcs(List<Arc> arcs) {
		this.arcs = arcs;
	}
	
	/**
	 * Returns a string representation of the Petri network.
	 * @return A string representing the Petri network.
	 */
	public String toString() {return null;}
	
}
	


	

