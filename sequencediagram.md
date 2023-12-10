# Sequence Diagram

A Petri net sequence diagram illustrates the dynamic behavior of a Petri net by showing the sequence of transitions and their firing in response to input events or conditions. Each transition in the diagram represents a state change in the system, and the directed arcs connecting transitions to places indicate the flow of tokens, which are used to model resources or conditions. This visual representation helps to understand the temporal sequence of events and transitions within a Petri net, making it a valuable tool for modeling and analyzing complex, concurrent processes.

```mermaid

sequenceDiagram
    Client-->>+Transition: Fire Transition,fire()
loop [is validated if is posible fire the transition]
    Transition->>+Arc: Check transition, fireable()
    Arc-->>+Place: Get number of tokens, getNbTokens()
    Place-->>-Arc: Number of tokens
    Arc-->>-Transition: Number of tokens
end

alt [is fairable, fireable() == true]
    loop [for the inArcs]
            Transition-->>+Arc:   
            Arc-->>+Place: remove Tokens, updatePlace()
            Place-->>-Arc:  
            Arc-->>-Transition:  
    end
    loop [for the outArcs]
            Transition-->>+Arc:   
            Arc-->>+Place: add Tokens, updatePlace()
            Place-->>-Arc:  
            Arc-->>-Transition:  
    end
end
```