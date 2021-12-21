package com.hotwax.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        linkedList.createList(12);
        linkedList.createList(22);
        linkedList.createList(33);
        System.out.println("********** Menu ***********");

        while (true) {

            System.out.println("Enter value 1 for adding element in start position");
            System.out.println("Enter value 2 for adding element in last position");
            System.out.println("Enter value 3 for adding element at particular position");
            System.out.println("Enter value 4 for deleting element in start position");
            System.out.println("Enter value 5 for deleting element in last position");
            System.out.println("Enter value 6 for deleting element at particular position");
            System.out.println("Enter value 7 for searching element ");
            System.out.println("Enter value 8 for traversing");
            System.out.println("Enter value 9 for Exit:");
            System.out.println("Enter your choice::");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element:");
                    linkedList.insertStart(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the element:");
                    linkedList.insertEnd(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the element:");
                    int data=scanner.nextInt();
                    System.out.println("Enter the position where you want to insert node:");
                    int position=scanner.nextInt();
                    linkedList.insertSpecPos(data,position);
                    break;
                case 4:
                    linkedList.removeFirstNode();
                    break;
                case 5:
                    linkedList.removeLastNode();
                    break;
                case 6:
                    System.out.println("Enter the position where you want to delete node:");
                    int position1=scanner.nextInt();
                    linkedList.deleteNode(position1);
                    break;
                case 7:
                    System.out.println("Enter the data which you want to search :");
                    int x=scanner.nextInt();
                    if (linkedList.search(linkedList.head, x))
                        System.out.println("Element is find");
                    else
                        System.out.println("Element is not find");
                    break;
                case 8:
                    System.out.println("The list is:");
                    linkedList.travers();
                    break;
                case 9:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;

            }


        }
    }
}
