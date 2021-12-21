package com.hotwax.stack.usinglinkedlist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int choice=0;
        Scanner scanner = new Scanner(System.in);
        StackUsingLinkedList stackUsingLinkedList  = new StackUsingLinkedList();
        System.out.println("*********Stack operations using array*********\n");
        System.out.println("\n------------------------------------------------\n");
        while(choice!=4)
        {
            System.out.println("\nChose one from the below options...\n");
            System.out.println("\n1.Push\n2.Pop\n3.Travers\n4.Exit");
            System.out.println("\n Enter your choice \n");
            choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter push Element:");
                    stackUsingLinkedList.push(scanner.nextInt());
                    break;
                }
                case 2:
                {
                    stackUsingLinkedList.pop();
                    break;
                }
                case 3:
                {
                    stackUsingLinkedList.travers();
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Please Enter valid choice ");
                }
            }
        }
    }
}
