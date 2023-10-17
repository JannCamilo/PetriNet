package petrinet;

import java.util.List;

public class PetriNetwork implements IPetriNetwork{
	
	private List<Place> places;
	private List<Transition> transitions;
	private List<Arc> arcs;
	
	public PetriNetwork(List<Place> places, List<Transition> transitions, List<Arc> arcs) {
		this.places.addAll(places);
		this.transitions.addAll(transitions);
		this.arcs.addAll(arcs);
	}
	public PetriNetwork() {}

	@Override
	public void fireAll() {
        for (Transition t : this.transitions) {
            t.fire();
        }		
	}

	@Override
	public void addPlace(Place place) {
		this.places.add(place);
	}

	@Override
	public void addArc(Arc arc) {
		this.arcs.add(arc);
		
	}

	@Override
	public void addTransition(Transition transition) {
		this.transitions.add(transition);
		
	}

	@Override
	public void deletePlace(Place place) {
		this.places.remove(place);
		
	}

	@Override
	public void deleteArc(Arc arc) {
		this.arcs.remove(arc);
		
	}

	@Override
	public void deleTransition(Transition transition) {
		this.transitions.remove(transition);
		
	}

	@Override
	public void fireTransition(Transition transition) {
		
		if (transition.fireable()){
			transition.fire();
		}
	}
	
	
	public List<Place> getPlaces(){
		return this.places;
	}
	
	public void setPlaces(List<Place> places) {
		this.places = places;
	}
	
	public List<Transition> getTransitions() { 
		return this.transitions;
	}
	
	public void setTransiions(List<Transition> transitions) {
		this.transitions = transitions;
	}
	
	public List<Arc> getArcs(){
		return this.arcs;
	}
	
	public void setArcs(List<Arc> arcs) {
		this.arcs = arcs;
	}

	public String toString() {
		return null;}
}
