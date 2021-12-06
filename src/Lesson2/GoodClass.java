package Lesson2;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 06.12.2021
 */

public class GoodClass {

    public static int valueFormClass = 10;

    public static void main(String[] args) {

//        System.out.println(valueFormClass);
//
//        int valueFromMethod = 20;
//        System.out.println(valueFromMethod);
//
//        studySwitch();

//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");
//        System.out.println("6");
//        System.out.println("7");
//        System.out.println("8");
//        System.out.println("9");
//        System.out.println("10");
//        System.out.println("********");
//
//        for (int i = 1; i <= 10; i++) { //i++ > i = i + 1
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//
//            }
//        }

//        System.out.println(myMath(2,10));
//        printTable(10,10);

//        int a = 0;

//        while (a < 10) {
//            a++;
//            if (a == 3 || a == 7) {
//                continue;
//            }
//            if (a != 9) {
//                continue;
//            }
//            if (a == 8) {
//                break;
//            }
//            System.out.print(a + " ");
//        }

//        do {
//            a++;
//            if (a == 3 || a == 7) {
//                continue;
//            }
//            System.out.print(a + " ");
//        } while (a < 10);
        System.out.println(task(123));

    }

    public static String task(int value) {
        if (value >= 100 && value <= 999) {
            return value + "<>" + (value % 10 + "" + (value % 100) / 10 + "" + value / 100);
        } else {
            return "Error: " + value + " invalid";
        }
    }
//    public static int myMath(int base, int signature) {
//        int result = base;
//
//        for (int i = 1; i < signature; i++) {
//            result = result * base;
//        }
//
//        return result;
//    }
//
//    public static void printTable(int width, int height) {
//        for (int y = 1; y <= height; y++) {
//            for (int x = 1; x <= width ; x++) {
//                System.out.print(y * x + "\t");
//            }
//            System.out.println();
//        }
//    }

//    private static void studySwitch() {
//        String nameLetter = "Qwerty";
//
//        if (nameLetter == "Alex") {
//            System.out.println("Send letter to Alex");
//        } else if (nameLetter == "Olga") {
//            System.out.println("Send letter to Olga");
//        } else if (nameLetter == "Boris") {
//            System.out.println("Send letter to Boris");
//        } else if (nameLetter == "Maria") {
//            System.out.println("Send letter to Maria");
//        } else {
//            System.out.println("Go out office");
//        }
//        System.out.println("*****************************");
//
//        switch (nameLetter) {
//            case "Alex":
//                System.out.println("Send letter to Alex");
//                break;
//            case "Olga":
//                System.out.println("Send letter to Olga");
//                break;
//            case "Boris":
//                System.out.println("Send letter to Boris");
//                break;
//            case "Maria":
//                System.out.println("Send letter to Maria");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }
//    }
}

