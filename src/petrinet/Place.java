package petrinet;

/**
 * The 'Place' class represents a location in a Petri net where tokens can be stored.
 * It contains methods for managing the number of tokens and associated arcs.
 */
public class Place {
	
	// Number of tokens in this place.
	private int nbTokens; 
	
	// Arc representing incoming connections.
	private Arc inArc; 
	
	// Arc representing outgoing connections.
	private Arc outArc; 
	
	// Unique identifier for this place.
	private String id; 
	
	// Associated PetriNetwork instance.
	private PetriNetwork pn; 
	
	/**
	 * Constructs a new Place with a specified initial number of tokens and associated arcs.
	 * @param nbTokens The initial number of tokens in the place.
	 * @param inArc The incoming arc connected to this place.
	 * @param outArc The outgoing arc connected to this place.
	 * @throws NegativeTokenInsertedException Thrown if nbTokens is less than 0.
	 */	
	public Place(int nbTokens, Arc inArc, Arc outArc) throws NegativeTokenInsertedException{
		if (nbTokens < 0){
			throw new NegativeTokenInsertedException("The number of tokens cannot be less than 0");
		}
		this.nbTokens = nbTokens;
		this.inArc = inArc;
		this.outArc = outArc;
	}
	
	/**
	 * Constructs a new Place with a specified initial number of tokens.
	 * @param nbTokens The number of tokens to initialize the Place with.
	 * @throws NegativeTokenInsertedException Thrown if nbTokens is less than 0.
	 */
	public Place(int nbTokens) throws NegativeTokenInsertedException {
		if (nbTokens < 0){
			throw new NegativeTokenInsertedException("The number of tokens cannot be less than 0");
		}
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
	
	
	public void setInArc(Arc inArc) {
		this.inArc = inArc;
	}
	
	public void setOutArc(Arc outArc) {
		this.outArc = outArc;
	}
	
	/**
	 * Retrieves the incoming arc connected to this place.
	 * @return The incoming arc.
	 */
	public Arc getInArc() {
		return this.inArc;
	}
	
	/**
	 * Retrieves the outgoing arc connected to this place.
	 * @return The outgoing arc.
	 */
	public Arc getOutArc() {
		return this.outArc;
	}
	
	/**
	 * Returns a string representation of this place.
	 * @return A string representing this place.
	 */
	public String toString() {
		return this.id;
	}

	/**
	 * Retrieves the unique identifier of the place.
	 * @return The identifier of the place.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Sets the unique identifier for the place.
	 * @param id The identifier to be set.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Retrieves the associated PetriNetwork of the place.
	 * @return The PetriNetwork instance.
	 */
	public PetriNetwork getPn() {
		return pn;
	}

	/**
	 * Sets the associated PetriNetwork for the place.
	 * @param pn The PetriNetwork instance to be set.
	 */
	public void setPn(PetriNetwork pn) {
		this.pn = pn;
	}
}