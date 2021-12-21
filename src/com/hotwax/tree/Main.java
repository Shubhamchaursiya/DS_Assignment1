package com.hotwax.tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeCreate treeCreate = new TreeCreate();
        treeCreate.insert(20);
        treeCreate.insert(49);
        treeCreate.insert(10);
        treeCreate.insert(4);
        treeCreate.insert(59);
        int choice = 0;
        System.out.println("*********Tree operations *********");
        System.out.println("------------------------------------------------");
        while (choice != 6) {
            System.out.println("\nChose one from the below options...");
            System.out.println("\n1.InOrder\n2.PreOrder\n3.PostOrder\n4.Delete\n5.Search\n6.Exit");
            System.out.println("\nEnter your choice:\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Inorder traversal:");
                    treeCreate.inorderRec(treeCreate.root);
                    break;

                case 2:

                    System.out.println("\nPreorder traversal:");
                    treeCreate.preorderRec(treeCreate.root);
                    break;

                case 3:


                    System.out.println("\nPostorder traversal:");
                    treeCreate.postorderRec(treeCreate.root);
                    break;

                case 4:
                    System.out.println("Please enter Deleted element:");
                    int data = scanner.nextInt();
                    treeCreate.deleteRec(treeCreate.root, data);
                    break;
                case 5:
                    System.out.println("Please enter search element:");
                    int key = scanner.nextInt();
                    if (treeCreate.search(treeCreate.root, key))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                    break;
                case 6:
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please Enter valid choice ");

            }
        }
    }
}
