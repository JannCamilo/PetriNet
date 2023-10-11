package petrinet;

public class Arc {
	
	public Arc(Place place, Transition transition) {}
	
	
	public Place getPlace(Place place) {return place;}
	public void setPlace(Place place) {}
	public Transition getTransition() {return null;}
	public void setTransition(Transition transition) {}
	public boolean isActivate() {return false;}
	public boolean isOutgoing() {return false;}
	public String toString() {return null;}
	public void updatePlace() {}	
	
}
