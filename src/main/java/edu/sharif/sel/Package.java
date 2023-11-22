package edu.sharif.sel;

import edu.sharif.sel.state.State;
import edu.sharif.sel.strategy.Strategy;

public class Package {
    private State state;
    private Strategy strategy;
    private double weight;

    public Package(State state, Strategy strategy) {
        this.state = state;
        this.strategy = strategy;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
