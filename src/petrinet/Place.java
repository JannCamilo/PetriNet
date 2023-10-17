package petrinet;

import java.util.List;

/**
 * The 'Place' class represents a location in a Petri net where tokens can be stored.
 * It contains methods for managing the number of tokens and associated arcs.
 */
public class Place {
	
	private int nbTokens; // Number of tokens in this place.
	private List<Arc> arcs;
	
	/**
	 * Constructs a new Place with a specified initial number of tokens and associated arcs.
	 * @param nbTokens The initial number of tokens in the place.
	 * @param listArcs A list of arcs connected to this place.
	 */	
	public Place(int nbTokens, List<Arc> arcs) {
		this.nbTokens = nbTokens;
		this.arcs = arcs;
	}
	
	/**
	 * Constructs a new Place with a specified initial number of tokens.
	 * @param nbTokens The initial number of tokens in the place.
	 */
	public Place(int nbTokens) {
		this.nbTokens = nbTokens;
	}
	
	/**
	 * Retrieves the current number of tokens in this place.
	 * @return The number of tokens in this place.
	 */
	public int getNbTokens() {
		return this.nbTokens;
	}
	
	/**
	 * Sets the number of tokens in this place to a specified value.
	 */
	public void setNbTokens(int nbTokens) {
		this.nbTokens = nbTokens;
	}
	
	/**
	 * Retrieves the list of arcs associated with this place.
	 * @return The list of arcs connected to this place.
	 */
	public List<Arc> getArcs() {
		return this.arcs;
	}
	
	/**
	 * Sets the list of arcs associated with this place.
	 * @param listArcs The list of arcs to be connected to this place.
	 */
	public void setArcs(List<Arc> arcs) {
		this.arcs = arcs;
	}
	
	/**
	 * Returns a string representation of this place.
	 * @return A string representing this place.
	 */
	public String toString() {return null;}
}
