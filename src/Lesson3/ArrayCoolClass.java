package Lesson3.online;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 09.12.2021
 */

public class ArrayCoolClass {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
//        System.out.println("Hello Peter");

//        String inputValue = scanner.next();
//        System.out.println("Input Value = " + inputValue);

//        System.out.println(welcomeUser("Enter your name", "Welcome"));

//        int valueFromUser = scanner.nextInt();
//        System.out.println(valueFromUser + 50);

//        System.out.println("Result = " + calcUser("Enter random int-value"));

//        for (int i = 0; i < 10; i++) {
//            System.out.print(random.nextInt() + " | "); // [-int;+int]
//            System.out.print(random.nextInt(30) + " | "); // [0;value)
//            System.out.print(random.nextFloat() + " | "); // [0;1)
//            System.out.print(random.nextDouble() + " | "); // [0;1)
//            System.out.print(randomValue(5,-30) + " | ");
//        }

//        welcome();
//        welcome("Peter");
//        welcome("Peter", "Oxy");
//
//        welcome();

//        int[] myArrayInt1 = new int[random.nextInt(100)];
//        int[] myArrayInt2 = new int[random.nextInt(100)];
//        int[] myArrayInt3 = new int[random.nextInt(100)];
//        int[] myArrayInt4 = new int[random.nextInt(100)];
//
//        String[] myStringArray = new String[random.nextInt(20)];
//        myArrayInt[0] = 1;
//        myArrayInt[1] = 10;
//        myArrayInt[2] = -5;
//        myArrayInt[3] = 0;
//        myArrayInt[4] = 20;

//        for (int i = 0; i < myArrayInt.length; i++) {
//            myArrayInt[i] = random.nextInt(30);
//        }

//        for (int i = 0; i < myArrayInt.length; i++) {
//            System.out.print(myArrayInt[i] + " | ");
//        }

//        fillArray(myArrayInt1);
////        fillArray(myArrayInt2);
////        fillArray(myArrayInt3);
////        fillArray(myArrayInt4);
////
////        readArray(myArrayInt1);
////        System.out.println();
////        readArray(myArrayInt2);
////        System.out.println();
////        readArray(myArrayInt3);
////        System.out.println();
////        readArray(myArrayInt4);
////        System.out.println();

//        fillArray(myStringArray);
//        readArray(myStringArray);

//        int[][] myInt2Array = new int[5][];
//        myInt2Array[0] = new int[10];
//        myInt2Array[1] = new int[3];
//        myInt2Array[2] = new int[25];
//        myInt2Array[3] = new int[40];
//        myInt2Array[4] = new int[30];
//
//        for (int i = 0; i < myInt2Array.length; i++) {
//            for (int j = 0; j < myInt2Array[i].length; j++) {
//                myInt2Array[i][j] = random.nextInt(20);
//            }
//        }
//
//        for (int i = 0; i < myInt2Array.length; i++) {
//            for (int j = 0; j < myInt2Array[i].length; j++) {
//                System.out.print(myInt2Array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int[] abc = new int[4];
//        abc[0] = 14;
//
//        int[][] myTable = new int[10][5];
//        myTable[2][1] = 1999999;

//        study2Array(8,16);

//        int[][][][][][][] arrayBig = new int[5][12][1][5][9][8][7];
//
//        for (int i = 0; i < arrayBig.length; i++) {
//            for (int j = 0; j < arrayBig[i].length; j++) {
//                for (int k = 0; k < arrayBig[i][j].length; k++) {
//                    /////
//                }
//            }
//        }
//        System.out.println("Hello Peter");
//        System.out.printf("Hello %s", "Peter"); //%s %i %o ...

//        String[] myBooks = {"Book1", "Book2", "Book3"};
//        String[] myBooks = new String[3];
//        myBooks[0] = "Book1";
//        myBooks[1] = "Book2";
//        myBooks[3] = "Book3";
//        byte[][] myByteA = {{1, 5, 6}, {3, 5, 7}};
    }

//    public static void study2Array(int i, int j) {
//        String[][] arr = new String[i][j];
//
//        for (int y = 0; y < arr.length; y++) {
//            for (int x = 0; x < arr[y].length; x++) {
//                arr[y][x] = "[" + y + ":" + x + "]";
//            }
//        }
//
//        for (int y = 0; y < arr.length; y++) {
//            for (int x = 0; x < arr[y].length; x++) {
//                System.out.print(arr[y][x] + "\t");
//            }
//            System.out.println();
//        }
//    }

//    public static void fillArray(int[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = random.nextInt(30);
//        }
//    }
//
//    public static void readArray(int[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " | ");
//        }
//    }
//
//    public static void fillArray(String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = "Hello + " + i;
//        }
//    }
//
//    public static void readArray(String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " | ");
//        }
//    }

//    public static void welcome() {
//        System.out.println("Welcome Peter");
//    }
//
//    public static void welcome(String name) {
//        System.out.println("Welcome " + name);
//    }
//
//    public static void welcome(String name, String surname) {
//        System.out.println("Welcome " + name + " " + surname);
//    }
//
//    public static void welcome(String name, int age) {
//        System.out.println("Welcome " + name + " " + age);
//    }
//
//    public static void welcome(int age, String name) {
//        System.out.println("Welcome " + name + " " + age);
//    }

//    public static int randomValue(int value1, int value2) {
//        if (value2 > value1) {
//            int tmp = value2 - value1;
//            return value1 + random.nextInt(tmp + 1);
//        } else {
//            System.out.println("Error : " + value2 + " must > " + value1);
//            return -1;
//        }
//
//    }

//    public static String welcomeUser(String systemMsg, String welcomeMsg) {
//        System.out.print(systemMsg + " > ");
//        return welcomeMsg + " " + scanner.next();
//    }

//    public static int calcUser(String systemMsg) {
//        System.out.print(systemMsg + " > ");
//        return scanner.nextInt() + 50;
//    }


}
