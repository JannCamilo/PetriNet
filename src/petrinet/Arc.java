package petrinet;

public class Arc {
	
	/**
	 * Constructor.
	 *
	 * @param place the Place
	 * @param transition the Transition
	 */
	public Arc(Place place, Transition transition) {}
	
	/**
	 * Retrieves information about a specific place in the Petri net.
	 *
	 * @param place the Place.
	 * @return Place object containing information about the specified place.
	 * @throws IllegalArgumentException if the place does not exist.
	 */
	public Place getPlace(Place place) {return place;}
	
	/**
	 * Sets the attributes of a specific place in the Petri net.
	 *
	 * @param place the Place.
	 * @throws IllegalArgumentException if the place does not exist.
	 */
	public void setPlace(Place place) {}
	
	/**
	 * Retrieves information about a specific transition in the Petri net.
	 *
	 * @return Transition object containing information about the specified transition.
	 * @throws IllegalArgumentException if the transition does not exist.
	 */
	public Transition getTransition() {return null;}
	
	public void setTransition(Transition transition) {}
	
	/**
	 * Is activate
	 * 
	 * Test if an arc [Place -> Transition] can be fired
	 * for the other case it is OK.
	 * @return true, if is enabled
	 */
	public boolean isActivate() {return false;}
	public boolean isOutgoing() {return false;}
	
	/**
	 * To string.
	 * 
	 * Returns a string representing the specified object.
	 * @return {string} a string representation of the object.
	 */
	public String toString() {return null;}
	
	
	public void updatePlace() {}	
	
}

