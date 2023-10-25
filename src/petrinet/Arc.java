package petrinet;

/**
 * The 'Arc' class represents a connection between a Place and a Transition in a Petri net.
 * It defines methods for retrieving and setting associated elements, as well as activation status.
 */
public class Arc {
	
	// The weight of the Arc.
	private int weight;

	// Starting and ending Places connected by the Arc.
	private Place startPlace;
	private Place endPlace;
	
	// Starting and ending Transitions connected by the Arc.
	private Transition startTransition;
	private Transition endTransition;
	
	// Unique identifier for this Arc.
	private String id;
	
	// Associated PetriNetwork instance.
	private PetriNetwork pn;
	
	/**
 	 * Constructor for creating an Arc with a default weight of 1.
 	 */
	public Arc() {
		this.weight = 1; // weight for default is 1.
	}
	
	/**
	 * Sets the starting point (Place or Transition) of the Arc.
 	 * @param start The starting element (Place or Transition) to be connected to the Arc. 
	 * @throws IllegalStateException Thrown if the Arc already has a starting element assigned.
 	 */
	public void setStart(Object start) {
		if (this.startPlace != null || this.startTransition != null) {
			// TODO:exception
		} else if (start.getClass() == Place.class) {
			this.startPlace = (Place) start;
			
		} else if (start.getClass() == Transition.class) {
			this.startTransition = (Transition) start;
		}
	}

	/**
	 * Sets the ending point (Place or Transition) of the Arc.
 	 * @param end The ending element (Place or Transition) to be connected to the Arc.
 	 * @throws IllegalStateException Thrown if the Arc already has an ending element assigned.
 	 */
	public void setEnd(Object end) {
		if (this.endPlace != null || this.endTransition != null) {
			// TODO:exception
		} else if (end.getClass() == Place.class) {
			this.endPlace = (Place) end;
			
		} else if (end.getClass() == Transition.class) {
			this.endTransition = (Transition) end;
		}
	}

	/**
	 * Returns an object connected at the beginning of the arc.
	 * @return A Place or Transition. 
	 * @throws IllegalStateException Thrown if the Arc already has a starting element assigned. 
	 */
	public Object getStart() {		
		// TODO: if there's no start, sends Exception		
		if (this.startPlace != null) {
			return this.startPlace;
		} else {
			return this.startTransition;
		}
	}

	/**
	 * Returns an object connected at the end of the arc.
	 * @return A Place or Transition.
	 * @throws IllegalStateException Thrown if the Arc already has an ending element assigned.
 	 */
	public Object getEnd() {		
		// TODO: if there's no end, sends Exception		
		if (this.endPlace != null) {
			return this.endPlace;
		} else {
			return this.endTransition;
		}
	}
	
	/**
	 * Returns a string representation of this Arc.
	 * @return A string representing this Arc.
	 */
	public String toString() {
		return this.id != null ? this.id : "";}
	
	/**
	 * Updates the associated Place based on the characteristics of this Arc.
	 */
	public void updatePlace() {
		if (this.endPlace != null ) {
			endPlace.setNbTokens(endPlace.getNbTokens()+weight);
		} else if (this.startPlace != null ) {
			startPlace.setNbTokens(startPlace.getNbTokens()-weight);
		}
	}
	
	/**
	 * Return the weight associated with the Rrc.
	 * @return The weight.
	 */
	public int getWeight() {
		return this.weight;
	}

	/**
	 * Sets the weight of the Arc.
	 * @param weight The weight to be set.
	 * @throws NegativeTokenInsertedException Thrown if the weight is less than 0.
	 */
	public void setWeight(int weight) throws NegativeTokenInsertedException {
		if (weight < 0){
			throw new NegativeTokenInsertedException("Not is posible a weight inferior to 0");
		}
		this.weight = weight;
	}

	/**
 	* Retrieves the unique identifier of the Arc.
 	* @return The identifier of the Arc.
 	*/
	public String getId() {
		return this.id;
	}

	/**
	 * Sets the unique identifier for the Arc.
	 * @param id The identifier to be set.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Retrieves the associated PetriNetwork of the Arc.
	 * @return The PetriNetwork instance.
	 */
	public PetriNetwork getPn() {
		return pn;
	}

	/**
	 * Sets the associated PetriNetwork for the Arc.
	 * @param pn The PetriNetwork instance to be set.
	 */
	public void setPn(PetriNetwork pn) {
		this.pn = pn;
	}
}