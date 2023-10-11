package petrinet;

public class ZeroArc extends Arc{

	public ZeroArc(Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isActive(){return false;}

}
