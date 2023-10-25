package petrinet;

import java.util.List;

/**
 * The 'Transition' class represents a state in a Petri net where a firing event can occur.
 * It manages the arcs associated with the transition and provides methods to control its behavior.
 */
public class Transition {
	
	// Flag indicating if the transition is fireable.
	private boolean isFireble;
	
	// Incoming and outgoing arcs connected to the transition.
	private Arc inArc;
	private Arc outArc;
	
	// Unique identifier for this transition.
	private String id;
	
	// Associated PetriNetwork instance.
	private PetriNetwork pn;
	
	/**
	 * Constructs a new Transition with a specified list of arcs.
	 * @param arcs The list of arcs connected to this transition.
	 */
	public Transition(List<Arc> arcs) {
	}
	
	/**
	 * Constructs a new Transition with no initial arcs.
	 */
	public Transition() {};
	
	/**
	 * Checks if the transition is fireable based on the current state of connected places.
	 * @return True if the transition is fireable, otherwise false.
	 */
	public boolean fireable() {		
		return this.isFireble;
	}
	
	/**
	 * Fires the transition, updating connected places according to Petri net semantics.
	 */
	public void fire() {
		// Check if is posible do the fire
		Place place = (Place) inArc.getStart();
		if ( place.getNbTokens() < inArc.getWeight()){
			this.isFireble = false;
			System.out.println("Can't fire!!");
		}else{
			this.isFireble = true;
			System.out.println("Fire!!");
		}
        // Remove tokens to the target places
        if (inArc.getWeight() > 0 && isFireble) {
			inArc.updatePlace();
        }
        // add tokens to the target places
		if (outArc.getWeight() > 0 && isFireble) {
			outArc.updatePlace();
        }
	}
	
	/**
	 * Retrieves the list of arcs associated with this transition.
	 * @return The list of arcs connected to this transition.
	 */
	public List<Arc> getArcs() {
		return null;
	}
	
	/**
	 * Sets the list of arcs associated with this transition.
	 * @param listArcs The list of arcs to be connected to this transition.
	 */
	public void setArcs(List<Arc> arcs) {
	}
	
	/**
	 * Adds a new arc to the list of arcs connected to this transition.
	 * @param arc The arc to be added.
	 */
	public void addArc(Arc arc) {
	}
	
	/**
	 * Deletes a specified arc from the list of arcs connected to this transition.
	 * @param arc The arc to be removed.
	 */
	public void deleteArc(Arc arc) {
	}
	
	/**
	 * Returns a string representation of this transition.
	 * @return A string representing this transition.
	 */
	public String toString() {
		return this.id;
	}
	
	/**
	 * Sets the incoming arc connected to this transition.
	 * @param inArc The incoming arc.
	 */
	public void setInArc(Arc inArc) {
		this.inArc = inArc;
	}
	
	/**
	 * Sets the outgoing arc connected to this transition.
	 * @param outArc The outgoing arc.
	 */
	public void setOutArc(Arc outArc) {
		this.outArc = outArc;
	}
	
	/**
	 * Retrieves the incoming arc connected to this transition.
	 * @return The incoming arc.
	 */
	public Arc getInArc() {
		return this.inArc;
	}
	
	/**
	 * Retrieves the outgoing arc connected to this transition.
	 * @return The outgoing arc.
	 */
	public Arc getOutArc() {
		return this.outArc;
	}

	/**
	 * Retrieves the unique identifier of the transition.
	 * @return The identifier of the transition.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Sets the unique identifier for the transition.
	 * @param id The identifier to be set.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Retrieves the associated PetriNetwork of the transition.
	 * @return The PetriNetwork instance.
	 */
	public PetriNetwork getPn() {
		return pn;
	}

	/**
	 * Sets the associated PetriNetwork for the transition.
	 * @param pn The PetriNetwork instance to be set.
	 */
	public void setPn(PetriNetwork pn) {
		this.pn = pn;
	}
}