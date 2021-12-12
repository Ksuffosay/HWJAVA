package HomeWork1;

public class HomeWorkApp {
    public static void main(String[] args) {

        String fruit1 = "Orange";
        String fruit2 = "Banana";
        String fruit3 = "Apple";
        printThreeWords(fruit1, fruit2, fruit3);
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords(String fruit1, String fruit2, String fruit3) {
        System.out.println(fruit1);
        System.out.println(fruit2);
        System.out.println(fruit3);
    }

    public static void checkSumSign() {
        int a = 15;
        int b = 10;
        int result;
        result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 85;
        if (value < 0) {
            System.out.println("Красный");
        } if (value <= 100){
            System.out.println("Желтый");
        }if (value > 100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 20;
        int b = 50;
        if (a >= b){
            System.out.println(+ a +  " >= " + b );
        }if (a < b){
            System.out.println(+ a + " < "  + b );
        }
    }
}
