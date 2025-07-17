import java.util.*;
import java.lang.*;
import java.io.*;

class MaxElement{
    public static void main(String[] args) {
        // Number of test cases
        int t = 2;

        // Test case 1
        int[] arr1 = {10, 20, 30, 40, 50};
        // Test case 2
        int[] arr2 = {4, 3, 6, 1};

        // Process each test case
        for (int test = 1; test <= t; test++) {
            int[] arr;

            if (test == 1) {
                arr = arr1;
            } else {
                arr = arr2;
            }

            int maximum = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maximum) {
                    maximum = arr[i];
                }
            }

            // Print the result for this test case
            System.out.println(maximum);
        }
    }
}
