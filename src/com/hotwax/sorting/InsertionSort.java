package com.hotwax.sorting;

public class InsertionSort {

        public static void sort(int arr[]) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
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
            sort(array);
            System.out.println("Sorted list");
            printArray(array);


        }
    }
