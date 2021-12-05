package papka1;

public class MyFirstFile {
    public static void main(String [] args) {
//        System.out.println("Hello World!");
//        System.out.println("Hello Java!");
//
//
//        byte myByte = 16;
//        short myShort = 316;
//        int myInteger = 99000;
//        long myLong = 300000000L;
//
//        float myFloat = 15.68f;
//        double myDouble = 15.68;
//
//        char myChar = '&';
//
//        String myString = "My String";
//
//        boolean myBooleanTrue = true;
//        boolean myBooleanFalse = false;
//
//
//
//        System.out.println( myDouble);
//        System.out.println( myShort);
//
//
//
//        System.out.println("My Word is:" + myString + ">" + myLong);
//
//
//        int abc = 100;
//        if (abc > 150) {
//            System.out.println("Дубль 1: All OK abc > 150");
//        }else {
//            System.out.println("Дубль 1: No good abc < 150");
//        }
//
//
//        if (abc > 150) {
//            System.out.println("Дубль 2: All OK abc > 150");
//        }
//
//        if (abc > 150) {
//            System.out.println("Дубль 3: All OK abc > 150");
//        }else if (abc == 100){
//            System.out.println("Дубль 3: SUPER PRICE abc == 100");
//        }else {
//            System.out.println("Дубль 3: No good abc < 150");
//        }

//        double a = 15;
//        float b = 35;
//        System.out.println("Result =" + (a / b ));

        int value1 = 10;
        int value2 = 20;
        int result;

//        result = value1 * value2 + 2;
//        System.out.println("Step 1:"+ result);
//        value1 = value1 + 1;
//        result = value1 * value2 +2;
//        System.out.println("Step 2:"+ result);

        result = myCalculate(value1, value2);
        System.out.println("Step 1:"+ result);
        value1 = value1 + 1;
        result = myCalculate(value1, value2);
        System.out.println("Step 2:"+ result);
        value2 = value2 + 1;
        result = myCalculate(value1, value2);
        System.out.println("Step 3:"+ result);

        String message = welcomeUser("Peter", 25);
        System.out.println(message);

    }
    public  static int myCalculate(int argInt1, int argInt2){
        return argInt1 + argInt2;
    }

    public  static String welcomeUser(String name, int age) {
        return "Welcome," + name + ". Your age is:" + age;
    }


}

