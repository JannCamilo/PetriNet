package petrinet;

import java.util.List;

public class PetriNetwork implements IPetriNetwork{
	
	
	public PetriNetwork(List<Place> places, List<Transition> transitions, List<Arc> arcs) {}
	public PetriNetwork() {}

	@Override
	public void fireAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPlace(Place place) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addArc(Arc arc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTransition(Transition transition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePlace(Place place) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArc(Arc arc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleTransition(Transition transition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fireTransition(Transition transition) {
		// TODO Auto-generated method stub
		
	}
	
	
	public List<Place> getPlaces(){return null;}	
	public void setPlaces(List<Place> places) {}	
	public List<Transition> getTransitions(){return null;}	
	public void setTransiions(List<Transition> transitions) {}
	public List<Arc> getArcs(){return null;}
	public void setArcs() {}
	public String toString() {return null;}
}
