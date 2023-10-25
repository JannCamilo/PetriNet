package petrinet;

/**
 * The 'IPetriNetwork' interface defines the methods that a Petri net network should implement.
 * It provides a set of operations for manipulating and analyzing a Petri net.
 */
public interface IPetriNetwork {	
	
	/**
	 * Fires all fireable transitions in the Petri network.
	 */
	public void fireAll();
	
	/**
	 * Adds a new place to the Petri network.
	 * @param place The place to be added.
	 */
	public void addPlace(Place place);
	
	/**
	 * Adds a new arc to the Petri network.
	 * @param arc The arc to be added.
	 */
	public void addArc(Arc arc);
	
	/**
	 * Adds a new transition to the Petri network.
	 * @param transition The transition to be added.
	 */
	public void addTransition(Transition transition);
	
	/**
	 * Deletes a place from the Petri network.
	 * @param place The place to be deleted.
	 */
	public void deletePlace(Place place);
	
	/**
	 * Deletes an arc from the Petri network.
	 * @param arc The arc to be deleted.
	 */
	public void deleteArc(Arc arc);
	
	/**
	 * Deletes a transition from the Petri network.
	 * @param transition The transition to be deleted.
	 */
	public void deleteTransition(Transition transition);
	
	/**
	 * Fires a specific transition in the Petri network.
	 * @param transition The transition to be fired.
	 * @throws NegativeTokenInsertedException
	 */
	public void fireTransition(Transition transition);
}
