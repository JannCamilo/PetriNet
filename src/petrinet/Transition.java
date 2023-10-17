package petrinet;

import java.util.List;

/**
 * The 'Transition' class represents a state in a Petri net where a firing event can occur.
 * It manages the arcs associated with the transition and provides methods to control its behavior.
 */
public class Transition {
	
	private List<Arc> arcs;
	private boolean isFireble;
	
	/**
	 * Constructs a new Transition with a specified list of arcs.
	 * @param listArcs The list of arcs connected to this transition.
	 */
	public Transition(List<Arc> arcs) {
		this.arcs = arcs;
	};
	
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
	public void fire() {}
	
	/**
	 * Retrieves the list of arcs associated with this transition.
	 * @return The list of arcs connected to this transition.
	 */
	public List<Arc> getArcs() {
		return this.arcs;
	}
	
	/**
	 * Sets the list of arcs associated with this transition.
	 * @param listArcs The list of arcs to be connected to this transition.
	 */
	public void setArcs(List<Arc> arcs) {
		this.arcs = arcs;
	}
	
	/**
	 * Adds a new arc to the list of arcs connected to this transition.
	 * @param arc The arc to be added.
	 */
	public void addArc(Arc arc) {
		this.arcs.add(arc);
	}
	
	/**
	 * Deletes a specified arc from the list of arcs connected to this transition.
	 * @param arc The arc to be removed.
	 */
	public void deleteArc(Arc arc) {
		this.arcs.remove(arc);
	}
	
	/**
	 * Returns a string representation of this transition.
	 * @return A string representing this transition.
	 */
	public String toString() {return null;}
}
