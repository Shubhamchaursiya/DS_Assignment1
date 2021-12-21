package com.hotwax.stack.usinglinkedlist;

import static java.lang.System.exit;

public class StackUsingLinkedList {
    Node root;

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }

    public void push(int data) {
        Node node = new Node(data);

        if (root == null) {
            root = node;
        } else {
            Node temp = root;
            root = node;
            node.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public void travers() {
        if (root == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = root;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.next;
            }
        }

    }
}
