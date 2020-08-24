package com.company;

public class Node {
    private int data;
    private Node nextnode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextnode() {
        return nextnode;
    }

    public void setNextnode(Node nextnode) {
        this.nextnode = nextnode;
    }

    @Override
    public String toString(){
        return "Data : "+this.data;
    }

}
