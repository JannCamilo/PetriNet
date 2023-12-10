# PetriNetwork

The PetriNetwork class is a Java implementation representing a Petri net, complete with places, transitions, and arcs. It adheres to the IPetriNetwork interface, offering a suite of methods for managing and analyzing the network.

#### 📖 Documentation:
- [UML Diagrams explanation](UML.md)
- [Functions and Classes explanation](classes.md)
- [Usage example](usage.md)
- [Sequence diagram](sequencediagram.md)

## Table of Contents
- Overview
- Petri Network Class Diagram
- Usage

## Overview
A Petri net is a mathematical modeling language used to describe systems with discrete events. It consists of places (representing system states), transitions (representing events), and arcs (connecting places and transitions).

## Petri Network Class Diagram

This [class diagram](uml.md) outlines the structure of a Petri network in an object-oriented paradigm:

**IPetriNetwork Interface:**
Essential methods for firing transitions, adding/deleting places, arcs, and transitions.

**PetriNetwork Class:**
Main class storing places, transitions, and arcs.
Methods for firing all transitions, managing elements, and retrieving positions.
Specialized methods for updating, getting, and setting elements.

**Arc Class:**
Generic arc with weight, start/end places, start/end transitions, and an ID.

**DrainerArc Class:**
Specialized drainer arc extending Arc with methods for checking activity and updating places.

**ZeroArc Class:**
Specialized zero arc extending Arc with methods for checking activity.

**Place Class:**
Represents a place with the number of tokens, in/out arcs, and an ID.
Methods for managing tokens, arcs, and IDs.

**Transition Class:**
Represents a transition with fireability, in/out arcs, and an ID.
Methods for firing transitions, managing arcs, and handling IDs.