package Lesson3.HW3;

import java.util.Random;

public class HomeWork3 {

    public static Random random = new Random();

    public static void main(String[] args) {

        invertArray();
        System.out.println();
        fillArray();
        System.out.println();
        changeArray();
        System.out.println();
        fillDiagonal();
        System.out.println();
        textMass(7, 8);
        System.out.println();
    }

    public static void invertArray() {
        int[] array = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }

    public static void changeArray() {
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int value = array2.length;
        for (int i = 0; i < value; i++) {
            if (array2[i] < 6) array2[i] = array2[i] * 2;
        }
        for (int i = 0; i < value; i++) {
            System.out.print(array2[i] + " | ");
        }
    }

    public static void fillDiagonal() {
        int mass[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mass[0][0] = 1;
                mass[1][1] = 1;
                mass[2][2] = 1;
                mass[3][3] = 1;
            }
            for (int j = 0; j < 4; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void textMass(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        for (int i = 0; i < len; i++) {
            System.out.print("[" + i + "]" + arr[i] + " ");

        }
    }
}
