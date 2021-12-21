package com.hotwax.sorting;

public class SelectionSort {
    public static void sort(int[] array)
    {
        int n=array.length;
        for(int i=0;i<n-1;i++)
        {
            int index=i;

            for (int j = i+1; j < n; j++)
                if (array[j] < array[index])
                    index = j;
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

    }
    public static void printArray(int[] arr)
    {

        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

    }

    public static void main(String[] args) {
        // write your code here
        int []array={10,3,4,2,11,45,76,87,2};
        sort(array);
        System.out.println("Sorted list");
        printArray(array);
    }
}
