package lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            int element = arr3[i];
            if (element < 6) {
                arr3[i] = element * 2;
            } else {
                arr3[i] = element;
            }
        }
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (arr4[i] == arr4[j]) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }

        int len = 5;
        int initialValue = 3;
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = 3;
        }
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = {2, 5, 7, 1, 9};
        System.out.println(Arrays.stream(arr6).max());
        System.out.println(Arrays.stream(arr6).min());


    }
}
