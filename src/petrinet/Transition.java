package petrinet;
import java.util.ArrayList;
import petrinet.exceptions.NoExistingObjectException;

/**
 * The 'Transition' class represents a state in a Petri net where a firing event can occur.
 * It manages the arcs associated with the transition and provides methods to control its behavior.
 */
public class Transition {
	
	private boolean isFireble = true;
	private ArrayList<Arc> inArcs = new ArrayList<Arc>();
	private ArrayList<Arc> outArcs= new ArrayList<Arc>();
	
	// Unique identifier for this transition.
	private String id;
	
	/**
	 * Constructs a new Transition with a specified list of arcs.
	 * @param listArcs The list of arcs connected to this transition.
	 * @throws NoExistingObjectException 
	 */
	public Transition(ArrayList<Arc> inArcs, ArrayList<Arc> outArcs) throws NoExistingObjectException {
		if (inArcs.size() == 0 || outArcs.size() == 0) {
			throw new NoExistingObjectException();
		}
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

}