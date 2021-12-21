package com.hotwax.searching;

import java.util.Scanner;

public class BinarySearch {
    public static int binaeySearch(int[] array,int key)
    {
        int low=0;
        int high=array.length-1;


        while(low<=high)
        {
            int mid=(low+high)/2;
            if (key==array[mid])
            {
                return mid;
            }
            else if(key<array[mid])
            {

                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        int[] array={4,8,10,15,18,21,24,27,29,33,34,37,39,41,43};
        System.out.println("Enter the key element:");
        int key=scanner.nextInt();
        System.out.println(key+" is found at index: "+binaeySearch(array, key));
    }
}
