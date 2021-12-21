package com.hotwax.stack.usingarray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice=0;
        Scanner scanner = new Scanner(System.in);
        StackUsingArray stackUsingArray = new StackUsingArray();
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
                    stackUsingArray.push(scanner.nextInt());
                    break;
                }
                case 2:
                {
                    stackUsingArray.pop();
                    break;
                }
                case 3:
                {
                    stackUsingArray.travers();
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
