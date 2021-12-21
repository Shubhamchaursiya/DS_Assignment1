package com.hotwax.sorting;

public class QuickSort {
    public static int partition (int a[], int start, int end)
    {
        int pivot = a[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            // If current element is smaller than the pivot
            if (a[j] < pivot)
            {
                i++; // increment index of smaller element
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    /* function to implement quick sort */
    static void sort(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */
    {
        if (start < end)
        {
            int p = partition(a, start, end);  //p is partitioning index
            sort(a, start, p - 1);
            sort(a, p + 1, end);
        }
    }



    public static void printArray(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        // write your code here
        int[] array = {10, 3, 4, 2, 11, 45, 76, 87, 2};
        int n = array.length;
        System.out.println("Before Sorting list:");
        printArray(array);

        sort(array,0,n-1);
        System.out.println("After Sorting list");
        printArray(array);

    }
}
