package petrinet;

import java.util.ArrayList;
import java.util.List;

import petrinet.exceptions.NoExistingObjectException;

/**
 * The 'Transition' class represents a state in a Petri net where a firing event can occur.
 * It manages the arcs associated with the transition and provides methods to control its behavior.
 */
public class Transition {
	
	private boolean isFireble;
	private ArrayList<Arc> inArcs;
	private ArrayList<Arc> outArcs;
	
	private String id;
	
	/**
	 * Constructs a new Transition with a specified list of arcs.
	 * @param listArcs The list of arcs connected to this transition.
	 */
	public Transition(List<Arc> arcs) {
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
	 * @throws NoExistingObjectException 
	 */
	public void fire() throws NoExistingObjectException {
		
		for (Arc inArc : this.inArcs) {
			Place place = (Place) inArc.getStart();
			
			// Check if is possible do the fire
			if ( place.getNbTokens() < inArc.getWeight()){
				
				this.isFireble = false;
				System.out.println("Can't fire!!");
				
			} else {
				this.isFireble = true;
				System.out.println("Fire!!");
			}
			
	        // Remove tokens to the target places
	        if (inArc.getWeight() > 0 && isFireble) {
				inArc.updatePlace();
	        }
		}
		
		for (Arc outArc: this.outArcs) {
			
	        // add tokens to the target places
			if (outArc.getWeight() > 0 && isFireble) {
				outArc.updatePlace();
	        }
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
	
	public void setInArcs(ArrayList<Arc> inArcs) {
		this.inArcs = inArcs;
	}
	
	public void setOutArcs(ArrayList<Arc> outArcs) {
		this.outArcs = outArcs;
	}
	
	public void addInArc(Arc inArc) {
		this.inArcs.add(inArc);
	}
	
	public void addOutArc(Arc outArc) {
		this.outArcs.add(outArc);
	}
	
	public ArrayList<Arc> getInArcs() {
		return this.inArcs;
	}
	
	public ArrayList<Arc> getOutArcs() {
		return this.outArcs;
	}

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
	
}
