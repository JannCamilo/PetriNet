package petrinet;

public interface IPetriNetwork {	
	
	public void fireAll();
	public void addPlace(Place place);
	public void addArc(Arc arc);
	public void addTransition(Transition transition);
	public void deletePlace(Place place);
	public void deleteArc(Arc arc);
	public void deleTransition(Transition transition);
	public void fireTransition(Transition transition);
}
