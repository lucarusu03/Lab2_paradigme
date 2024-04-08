package ro.ulbs.paradigme.ex2.simplechained;

import ro.ulbs.paradigme.ex2.api.INode;

public class SimpleChainedNode implements INode {
    private int value;
    private SimpleChainedNode nextNode;

    public SimpleChainedNode(int value) {
        this.value = value;
        this.nextNode = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public SimpleChainedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SimpleChainedNode nextNode) {
        this.nextNode = nextNode;
    }
}
