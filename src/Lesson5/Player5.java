//package Lesson5;
//
//public class Player5 {
//
//    /**
//     * Created by Aleksandr Gladkov [Anticisco]
//     * Date: 16.12.2021
//     */
//
//    public class Player {
//
//        public static int countLeg = 2;
//
//        private String name; //field class
//        private int hp;
//        private int str;
//        private Point2D coordinates;
//        private int exp;
//        private Sword sword = new Sword();
//
//        Player() {
//            name = "Boris";
//            System.out.println("This is constructor");
//        }
//
//        Player(String text) {
//            System.out.println(text);
//        }
//
//        public Player(String name, int hp, int str, int x, int y, int exp) {
//            this.name = name;
//            this.hp = hp;
//            this.str = str;
//            this.coordinates = new Point2D(x, y);
//            this.exp = exp;
//            doSomething("Hello");
//        }
//
//        public static void doSomething(String name) {
//            System.out.println("Hello");
//        }
//
//        void speak() {
//            System.out.println("Hello user, my name is " + name);
//        }
//
//        void move() {
//            System.out.println(name + " has moved");
//        }
//
//        void decreaseHealth(int value) {
//            hp -= value;
//            System.out.println(name + " take damage is " + value + " point(s)");
//        }
//
//        boolean isAlive() {
//            return hp > 0;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        class Sword {
//            String name;
//            int atk;
//            String color;
//
//            void giveAttack() {
//                System.out.println(color + " " + name + " give attack " + atk);
//            }
//        }
//
//
//    }
//
//}
