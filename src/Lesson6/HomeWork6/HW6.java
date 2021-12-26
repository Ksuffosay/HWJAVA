package Lesson6.HomeWork6;

public class HW6 {
    public static void main(String[] args){

        String title;
        String result;

        Cat cat1 = new Cat("Cat","Том",1.1f,5.2f);
        Dog dog1 = new Dog("Dog","Рекс",3.5f,2.5f);

        Animals[] animals = {cat1,dog1};

         float runLength = 150f;
         float swimLength = 50f;

        for (int i =0; i < animals.length; i++){
            System.out.println(animals[i].getKind() + " " + animals[i].getName());
            System.out.println("Сколько нужно пробежать - " + animals[i].getRun() + "м.");
            System.out.println("Пробежал - " + animals[i].getRun() + "м.");

            int swimResult = animals[i].swim(swimLength);
            System.out.println("Сколько нужно проплыть - " + animals[i].swim(swimLength) + "м.");
            if (swimResult == Animals.SWIM_NOBODY){
                System.out.println("Кот не умеет плавать!");
            }
            System.out.println("Проплыл - " + animals[i].getSwim() + "м.");
        }

    }
}
