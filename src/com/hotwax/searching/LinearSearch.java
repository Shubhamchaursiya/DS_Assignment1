package com.hotwax.searching;

import java.util.Scanner;

public class LinearSearch {
    public  static int linearSearch(int[] array, int key)
    {

        for (int i=0;i<array.length;i++)
        {
            if(key==array[i])
            {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        int []array={10,9,3,2,4,6,19,32,1,22};
        System.out.println("Enter the Key element:");
        int key=scanner.nextInt();
        System.out.println(key+" is found at index: "+linearSearch(array, key));

    }
}
