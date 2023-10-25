# PetriNetwork

The PetriNetwork class is a Java implementation representing a Petri net, complete with places, transitions, and arcs. It adheres to the IPetriNetwork interface, offering a suite of methods for managing and analyzing the network.

# Table of Contents
Overview
Usage
Methods
Example

# Overview
The PetriNetwork class encapsulates the core functionality of a Petri net. It maintains lists of places, transitions, and arcs, and provides methods for adding, deleting, and firing these elements.

# Usage
To utilize the PetriNetwork class, follow these steps:

Import the petrinet package:
import petrinet.*;

Create an instance of the PetriNetwork class, either by providing pre-existing lists of places, transitions, and arcs, or by instantiating an empty network:
PetriNetwork pn1 = new PetriNetwork(); // Empty network

Add places, transitions, and arcs as needed:
Place p1 = new Place(2);

// Add more elements...
Perform operations such as firing transitions or retrieving information about the network.

pn1.fireTransition(t1);

# Methods
fireAll()
Fires all transitions in the Petri network.

addPlace(Place place)
Adds a place to the Petri network.

addArc(Arc arc)
Adds an arc to the Petri network.

addTransition(Transition transition)
Adds a transition to the Petri network.

deletePlace(Place place)
Deletes a place from the Petri network.

deleteArc(Arc arc)
Deletes an arc from the Petri network.

deleteTransition(Transition transition)
Deletes a transition from the Petri network.

fireTransition(Transition transition)
Fires a specific transition in the Petri network.

getPlaces()
Retrieves the list of places in the Petri network.

setPlaces(ArrayList<Place> places)
Sets the list of places in the Petri network.

getTransitions()
Retrieves the list of transitions in the Petri network.

setTransitions(ArrayList<Transition> transitions)
Sets the list of transitions in the Petri network.

getArcs()
Retrieves the list of arcs in the Petri network.

setArcs(ArrayList<Arc> arcs)
Sets the list of arcs in the Petri network.

toString()
Returns a string representation of the Petri network.

getPlacePosition()
Retrieves the position of the current place.

setPlacePosition(int placePosition)
Sets the position of the current place.

getTransitionPosition()
Retrieves the position of the current transition.

setTransitionPosition(int transitionPosition)
Sets the position of the current transition.

getArcPosition()
Retrieves the position of the current arc.

setArcPosition(int arcPosition)
Sets the position of the current arc.

# Example
Here's an example of how to create and interact with a Petri network:

java
Copy code
try {
    Place p1 = new Place(2);
    Arc a1 = new Arc();
    Transition t1 = new Transition();
    Arc a2 = new Arc();
    Place p2 = new Place(2);

    p1.setOutArc(a1);
    // Set up more connections...

    ArrayList<Place> places = new ArrayList<Place>();
    ArrayList<Transition> transitions = new ArrayList<Transition>();
    ArrayList<Arc> arcs = new ArrayList<Arc>();

    places.add(p1);
    places.add(p2);
    transitions.add(t1);
    arcs.add(a1);
    arcs.add(a2);

    PetriNetwork pn1 = new PetriNetwork(places, transitions, arcs);
    System.out.println(PN1.toString());

    System.out.println("\n------Before to do Fire------");
    System.out.println("Number of tokens in " + p1 + " : " + p1.getNbTokens());
    System.out.println("Number of tokens in " + p2 + " : " + p2.getNbTokens());

    t1.fire(); // Perform a transition firing
    System.out.println("\n------After to do Fire-------");
    System.out.println("Number of tokens in " + p1 + " : " + p1.getNbTokens());
    System.out.println("Number of tokens in " + p2 + " : " + p2.getNbTokens());

    // Attempt to create a place with negative tokens
    Place p3 = new Place(-5);

} catch (NegativeTokenInsertedException e) {
    System.out.println("\nError: " + e.getMessage());
}

This will create a Petri network, set up connections between elements, and fire a transition, demonstrating the network's behavior. If an attempt is made to create a place with negative tokens, it will raise a NegativeTokenInsertedException.