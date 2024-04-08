package ro.ulbs.paradigme.ex2.doublechained;

import ro.ulbs.paradigme.ex2.api.INode;

public class DoubleChainedNode implements INode {
    private int value;
    private DoubleChainedNode nextNode;
    private DoubleChainedNode prevNode;

    public DoubleChainedNode(int value) {
        this.value = value;
        this.nextNode = null;
        this.prevNode = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public DoubleChainedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleChainedNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleChainedNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoubleChainedNode prevNode) {
        this.prevNode = prevNode;
    }
}
