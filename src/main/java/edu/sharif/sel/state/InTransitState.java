package edu.sharif.sel.state;

import edu.sharif.sel.Package;

public class InTransitState extends State {
    public InTransitState(Package pkg) {
        super(pkg);
    }

    public String getMessage() {
        return "In Transit";
    }

    public void next() {
        pkg.setState(new DeliveredState(pkg));
    }

    public boolean end() {
        return false;
    }
}
