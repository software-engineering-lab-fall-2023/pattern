package edu.sharif.sel.strategy;

public class ExpressStrategy implements Strategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 3.5;
    }
}
