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