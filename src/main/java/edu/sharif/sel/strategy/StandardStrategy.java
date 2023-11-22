package edu.sharif.sel.strategy;

public class StandardStrategy implements Strategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 2.5;
    }
}
