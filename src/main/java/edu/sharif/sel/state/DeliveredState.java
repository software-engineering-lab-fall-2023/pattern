package edu.sharif.sel.state;

import edu.sharif.sel.Package;

public class DeliveredState extends State {
    public DeliveredState(Package pkg) {
        super(pkg);
    }

    public String getMessage() {
        return "Delivered";
    }

    public void next() {
    }

    public boolean end() {
        return true;
    }
}
