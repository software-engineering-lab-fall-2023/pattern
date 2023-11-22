package edu.sharif.sel;

import edu.sharif.sel.state.State;
import edu.sharif.sel.strategy.Strategy;

public class Package {
    private Strategy strategy;
    private State state;
    private double weight;

    public Package(double weight) {
        this.weight = weight;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println(state.getMessage());
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice() {
        return strategy.calculatePrice(weight);
    }

    public boolean nextState() {
        state.next();
        return state.end();
    }
}
