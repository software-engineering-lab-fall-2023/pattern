package edu.sharif.sel.state;

abstract public class State {
    private Package pkg;

    public State(Package pkg) {
        this.pkg = pkg;
    }

    abstract public String getMessage();

    abstract public void next();
}
