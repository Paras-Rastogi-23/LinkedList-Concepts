package com.company;

public class LinkedList {
    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextnode(this.head);
        this.head = newNode;
    }
    @Override
    public String toString(){
        String result = "{";
        Node current = this.head;

        while (current!=null){
            result += current.toString()+" , ";
            current = current.getNextnode();
        }
        result += "}";
        return result;
    }

}
