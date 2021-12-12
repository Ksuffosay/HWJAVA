package Lesson2.HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {

        System.out.println(myExerciseOne(8, 25));
        lineOutput(80);
        System.out.println(valueNumber(-50));
        printTextNumber("Hello", 10);

    }

    public static boolean myExerciseOne(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void lineOutput(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean valueNumber(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printTextNumber(String word, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(" " + word);

        }
    }
}
