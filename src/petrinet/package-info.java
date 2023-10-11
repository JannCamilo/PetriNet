/**
 * This package contains classes and interfaces for simulating and working with Petri Networks.
 * 
 * A Petri Network is a mathematical modeling tool used to represent and analyze systems with
 * concurrent processes and state transitions. This package provides the core components
 * required to create and manipulate Petri Networks.
 * 
 * The primary classes and interfaces in this package are:
 * 
 * - {@link petrinet.PetriNetwork}: This class represents a Petri Network, which consists
 *   of places, transitions, and arcs. It allows you to define and simulate the behavior of the network.
 *   
 * - {@link petrinet.IPetriNetwork}: An interface that defines the contract for a Petri Network,
 *   allowing you to implement custom Petri Network classes.
 *  
 * - {@link petrinet.Place}: A Place in a Petri Network represents a state or condition that
 *   can hold tokens. Tokens are used to represent resources or entities in the system.
 * 
 * - {@link petrinet.Transition}: A Transition represents an event or action that can occur
 *   in the Petri Network. Transitions can be enabled or disabled based on the availability of tokens
 *   in connected places.
 * 
 * - {@link petrinet.Arc}: An Arc represents a directed connection between a place and a
 *   transition or vice versa. Arcs define how tokens can flow between places and trigger transitions.
 * 
 * Usage:
 * You can use the classes and interfaces in this package to model and simulate systems with
 * Petri Networks. Start by creating a Petri Network, adding places, transitions, and arcs, and then
 * simulate the system's behavior.
 * 
 * Example:
 * ```java
 * PetriNetwork petriNet = new PetriNetwork();
 * Place p1 = new Place("Place 1");
 * Transition t1 = new Transition("Transition 1");
 * petriNet.addPlace(p1);
 * petriNet.addTransition(t1);
 * petriNet.addArc(new Arc(p1, t1));
 * ```
 * 
 * @since 1.0
 */
package petrinet;
