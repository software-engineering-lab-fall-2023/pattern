package edu.sharif.sel.state;

import edu.sharif.sel.Package;

abstract public class State {
    protected Package pkg;

    public State(Package pkg) {
        this.pkg = pkg;
    }

    abstract public String getMessage();

    abstract public void next();

    abstract public boolean end();
}
