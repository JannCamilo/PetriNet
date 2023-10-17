package petrinet;

/**
 * The 'Arc' class represents a connection between a Place and a Transition in a Petri net.
 * It defines methods for retrieving and setting associated elements, as well as activation status.
 */
public class Arc {
	
	protected boolean isActive;
	protected boolean isOutgoing;
	private Place place;
	private Transition transition;
	
	/**
	 * Constructs a new Arc with specified Place and Transition.
	 * @param place The Place connected to this Arc.
	 * @param transition The Transition connected to this Arc.
	 */
	public Arc(Place place, Transition transition) {
		this.place = place;
		this.transition = transition;
	}
	
	/**
	 * Retrieves the Place associated with this Arc.
	 * @return The associated Place.
	 */
	public Place getPlace() {
		return this.place;
	}
	
	/**
	 * Sets the Place associated with this Arc.
	 * @param place The Place to be associated with this Arc.
	 */
	public void setPlace(Place place) {
		this.place = place;
	}
	
	/**
	 * Retrieves the Transition associated with this Arc.
	 * @return The associated Transition.
	 */
	public Transition getTransition() {
		return this.transition;
	}
	
	/**
	 * Sets the Transition associated with this Arc.
	 * @param transition The Transition to be associated with this Arc.
	 */
	public void setTransition(Transition transition) {
		this.transition = transition;
	}
	
	/**
	 * Determines if this Arc is activated.
	 * @return True if activated, otherwise false.
	 */
	public boolean isActivate() {
		return this.isActive;
	}
	
	/**
	 * Determines if this Arc is outgoing.
	 * @return True if it is an outgoing Arc, otherwise false.
	 */
	public boolean isOutgoing() {
		return this.isOutgoing;
	}
	
	/**
	 * Returns a string representation of this Arc.
	 * @return A string representing this Arc.
	 */
	public String toString() {return null;}
	
	/**
	 * Updates the associated Place based on the characteristics of this Arc.
	 */
	public void updatePlace() {}
	
}

