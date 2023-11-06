# PetriNetwork

The PetriNetwork class is a Java implementation representing a Petri net, complete with places, transitions, and arcs. It adheres to the IPetriNetwork interface, offering a suite of methods for managing and analyzing the network.

## Table of Contents
- Overview
- Usage
- Classes
- Methods
- License

## Overview
A Petri net is a mathematical modeling language used to describe systems with discrete events. It consists of places (representing system states), transitions (representing events), and arcs (connecting places and transitions).

The **PetriNetwork** class allows users to create, connect, and manipulate these elements, as well as analyze the behavior of the network.

## Usage
To use the PetriNetwork class, follow these steps:

1) Create instances of places, transitions, and arcs.
2) Connect the elements of the Petri network using setInArc and setOutArc methods.
3) Set weights for the arcs using the setWeight method.
4) Create lists of places, transitions, and arcs.
5) Add the elements to the respective lists.
6) Create an instance of PetriNetwork using the lists of elements.

Here's an example of how to create and interact with a Petri network:

    try {
        Place p1 = new Place(3);
        Arc a1 = new Arc();
        Transition t1 = new Transition();
        Arc a2 = new Arc();
        Place p2 = new Place(2);

        p1.setOutArc(a1);
        a1.setStart(p1);
        a1.setEnd(t1);
        t1.setInArc(a1);
        t1.setOutArc(a2);
        a2.setStart(t1);
        a2.setEnd(p2);
        p2.setInArc(a2);
        a1.setWeight(2);
        a2.setWeight(5);

        ArrayList<Place> places = new ArrayList<Place>();
        ArrayList<Transition> transitions = new ArrayList<Transition>();
        ArrayList<Arc> arcs = new ArrayList<Arc>();

        places.add(p1);
        places.add(p2);
        transitions.add(t1);
        arcs.add(a1);
        arcs.add(a2);

        PetriNetwork pn1 = new PetriNetwork(places, transitions, arcs);

        System.out.println(pn1.toString());

        System.out.println("\n------Before to do Fire------");
        System.out.println("Number of tokens in " + p1 + " : " + p1.getNbTokens());
        System.out.println("Number of tokens in " + p2 + " : " + p2.getNbTokens());

        t1.fire();

        System.out.println("\n------After doing Fire-------");
        System.out.println("Number of tokens in " + p1 + " : " + p1.getNbTokens());
        System.out.println("Number of tokens in " + p2 + " : " + p2.getNbTokens());
    } catch (NegativeTokenInsertedException e) {
        System.out.println("\nError: " + e.getMessage());
    }

This will create a Petri network, set up connections between elements, and fire a transition, demonstrating the network's behavior. If an attempt is made to create a place with negative tokens, it will raise a NegativeTokenInsertedException.

## Classes

@startuml
alice->bob:hello
@enduml

classDiagram
    class BankAccount
    BankAccount : +String owner
    BankAccount : +Bigdecimal balance
    BankAccount : +deposit(amount)
    BankAccount : +withdrawal(amount)

## Methods
**fireAll():** Fires all transitions in the Petri network.

**addPlace(Place place):** Adds a place to the Petri network.

**addArc(Arc arc):** Adds an arc to the Petri network.

**addTransition(Transition transition):** Adds a transition to the Petri network.

**deletePlace(Place place):** Deletes a place from the Petri network.

**deleteArc(Arc arc):** Deletes an arc from the Petri network.

**deleteTransition(Transition transition):** Deletes a transition from the Petri network.

**fireTransition(Transition transition):** Fires a specific transition in the Petri network.

**getPlaces():** Retrieves the list of places in the Petri network.

**setPlaces(ArrayList<Place> places):** Sets the list of places in the Petri network.

**getTransitions():** Retrieves the list of transitions in the Petri network.

**setTransitions(ArrayList<Transition> transitions):** Sets the list of transitions in the Petri network.

**getArcs():** Retrieves the list of arcs in the Petri network.

**setArcs(ArrayList<Arc> arcs):** Sets the list of arcs in the Petri network.

**toString():** Returns a string representation of the Petri network.

**getPlacePosition():** Retrieves the position of the current place.

**setPlacePosition(int placePosition):** Sets the position of the current place.

**getTransitionPosition():** Retrieves the position of the current transition.

**setTransitionPosition(int transitionPosition):** Sets the position of the current transition.

**getArcPosition():** Retrieves the position of the current arc.

**setArcPosition(int arcPosition):** Sets the position of the current arc.

## License

This project is licensed under the MIT License.