package ro.ulbs.paradigme.ex2.doublechained;

import ro.ulbs.paradigme.ex2.api.IMyList;

public class DoubleChainedList implements IMyList {
    private DoubleChainedNode head;

    public DoubleChainedList() {
        this.head = null;
    }

    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            DoubleChainedNode current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
            newNode.setPrevNode(current);
        }
    }

    public DoubleChainedNode getNodeByValue(int value) {
        DoubleChainedNode current = head;
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
            if (head != null) {
                head.setPrevNode(null);
            }
            return;
        }
        DoubleChainedNode current = head;
        while (current.getNextNode() != null) {
            if (current.getNextNode().getValue() == value) {
                current.setNextNode(current.getNextNode().getNextNode());
                if (current.getNextNode() != null) {
                    current.getNextNode().setPrevNode(current);
                }
                return;
            }
            current = current.getNextNode();
        }
    }

    public void listNodes() {
        DoubleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    public DoubleChainedNode getHead() {
        return this.head;
    }

    @Override
    public boolean isSorted() {
        DoubleChainedNode current = head;
        DoubleChainedNode currentplus1 = current.getNextNode();
        int val1 = current.getValue();
        int val2 = currentplus1.getValue();
        boolean ok = false;
        if (val1 > val2) ok = true;

        if (ok) {
            return false;
        } else {
            return true;
        }
    }
}
