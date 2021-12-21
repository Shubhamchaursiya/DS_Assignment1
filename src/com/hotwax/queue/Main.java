package com.hotwax.queue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();
        int choice=0;
        Scanner scanner = new Scanner(System.in);
        Queue queue  = new Queue();
        System.out.println("*********Queue operations using array*********\n");
        System.out.println("\n------------------------------------------------\n");
        while(choice!=4)
        {
            System.out.println("\nChose one from the below options...\n");
            System.out.println("\n1.Insert\n2.Delete\n3.Travers\n4.Exit");
            System.out.println("\n Enter your choice \n");
            choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter Insert Element:");
                    queue.enQueue(scanner.nextInt());
                    break;
                }
                case 2:
                {
                    queue.deQueue();
                    break;
                }
                case 3:
                {
                    queue.travers();
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
