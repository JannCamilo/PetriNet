package petrinet;

/**
 * The 'ZeroArc' class represents a specialized type of Arc that does not contribute to token flow.
 * It extends the basic 'Arc' class and overrides specific methods to implement its behavior.
 */
public class ZeroArc extends Arc {
	
	/**
	 * Constructs a new ZeroArc with specified Place and Transition.
	 * @param place The Place connected to this ZeroArc.
	 * @param transition The Transition connected to this ZeroArc.
	 */
	public ZeroArc(Place place, Transition transition) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Determines if this ZeroArc is active (always returns false as it does not contribute to token flow).
	 * @return Always false.
	 */	
	public boolean isActive() {
		return false;
	}

}
