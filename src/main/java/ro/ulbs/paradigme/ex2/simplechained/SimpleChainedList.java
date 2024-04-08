package ro.ulbs.paradigme.ex2.simplechained;

import ro.ulbs.paradigme.ex2.api.IMyList;
import ro.ulbs.paradigme.ex2.api.INode;
import ro.ulbs.paradigme.ex2.doublechained.DoubleChainedNode;

public class SimpleChainedList implements IMyList {
    private SimpleChainedNode head;

    public SimpleChainedList() {
        this.head = null;
    }

    public void addValue(int value) {
        SimpleChainedNode newNode = new SimpleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            SimpleChainedNode current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }

    public SimpleChainedNode getNodeByValue(int value) {
        SimpleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return current;
            }
            current = current.getNextNode();
        }
        return null; // Nu s-a găsit nodul cu valoarea dată
    }

    public void removeNodeByValue(int value) {
        if (head == null) {
            return; // Lista este goală
        }
        if (head.getValue() == value) {
            head = head.getNextNode();
            return;
        }
        SimpleChainedNode current = head;
        while (current.getNextNode() != null) {
            if (current.getNextNode().getValue() == value) {
                current.setNextNode(current.getNextNode().getNextNode());
                return;
            }
            current = current.getNextNode();
        }
    }

    public void listNodes() {
        SimpleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    public SimpleChainedNode getHead() {
        return this.head;
    }

    public boolean isSorted() {
        SimpleChainedNode current = head;
        SimpleChainedNode currentplus1 = current.getNextNode();
        int val1 = current.getValue();
        int val2 = currentplus1.getValue();
        boolean ok = val1 > val2;

        if (ok) {
            return false;
        } else {
            return true;
        }
    }
}
