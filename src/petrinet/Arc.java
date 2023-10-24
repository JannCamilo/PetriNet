package petrinet;

/**
 * The 'Arc' class represents a connection between a Place and a Transition in a Petri net.
 * It defines methods for retrieving and setting associated elements, as well as activation status.
 * @param <T>
 */
public class Arc {
	
	private Place startPlace;
	private Place endPlace;
	
	private Transition startTransition;
	private Transition endTransition;
	
	private String id;
	private PetriNetwork pn;
	
	public Arc() {};
	
	public void setStart(Object start) {
		if (this.startPlace != null || this.startTransition != null) {
			//exception
		} else if (start.getClass() == Place.class) {
			this.startPlace = (Place) start;
			
		} else if (start.getClass() == Transition.class) {
			this.startTransition = (Transition) start;
		}
	};
	
	public void setEnd(Object end) {
		if (this.endPlace != null || this.endTransition != null) {
			//exception
		} else if (end.getClass() == Place.class) {
			this.endPlace = (Place) end;
			
		} else if (end.getClass() == Transition.class) {
			this.endTransition = (Transition) end;
		}
	};
	
	public Object getStart() {
		
		// TODO: if there's no start, sends Exception
		
		if (this.startPlace != null) {
			return this.startPlace;
		} else {
			return this.startTransition;
		}
	}

	public Object getEnd() {
		
		// TODO: if there's no end, sends Exception
		
		if (this.endPlace != null) {
			return this.endPlace;
		} else {
			return this.endPlace;
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
	public void updatePlace() {}

	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the pn
	 */
	public PetriNetwork getPn() {
		return pn;
	}

	/**
	 * @param pn the pn to set
	 */
	public void setPn(PetriNetwork pn) {
		this.pn = pn;
	}
	
}

