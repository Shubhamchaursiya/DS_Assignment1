package com.hotwax.linkedlist;

public class LinkedList {
    static Node head;

//*Create the linked list

    public static void createList(int data) {

        Node node = new Node();

        node.data = data;
        node.next = null;
        if (head == null) {

            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }


    }
// *Insert the element at the last position

    public static void insertStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    // *Insert the element at the last position

    public static void insertEnd(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;

    }
    // *Insert the element at particular  position

    public static void insertSpecPos(int data,int position)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            //if head is null and position is zero then exit.
            if (position != 0) {
                return;
            } else { //node set to the head.
                head = node;
            }
        }

        if (head != null && position == 0) {
            node.next = head;
            head = node;
            return;
        }

        Node current =head;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        node.next = current;
        previous.next = node;

    }
    //* Remove the element at first position

    static Node removeFirstNode()
    {
        if (head == null)
            return null;

        // Move the head pointer to the next node
        Node temp = head;
        head = head.next;

        return head;
    }

    //Delete last node of the list
    void removeLastNode() {
        if(head != null) {
            if(head.next == null) {
                head = null;
            } else {
                Node temp = new Node();
                temp = head;
                while(temp.next.next != null)
                    temp = temp.next;
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
            }
        }
    }
    //* Delete node at particular position

    void deleteNode(int position)
    {
        // If linked list is empty
        if (head == null)
            return;

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;

        temp.next = next;
    }
    //* Search Element
    public boolean search(Node head, int x)
    {
        Node currentNode = head;    //Initialize current
        while (currentNode != null)
        {
            if (currentNode.data==(x) )
                return true;    //data found
            currentNode = currentNode.next;
        }
        return false;    //data not found
    }
//* List traversing

    public static void travers() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + "--->");
            node = node.next;
        }
        System.out.println(node.data);
    }

}
