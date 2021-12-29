package Lesson8;

import java.util.Scanner;

public class HW8 {

        private static Scanner scanner;

        public HW8() {
        }

        public static void main(String[] args) {
            System.out.println("Ваша задача угадать число.");

            for(int i = 10; i <= 30; i += 10) {
                playLevel(i);
            }

            System.out.println("Вы выиграли!!!");
            scanner.close();
        }

        private static void playLevel(int range) {
            int number = (int)(Math.random() * (double)range);

            while(true) {
                System.out.println("Угадайте число от 0 до " + range);
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println("Вы угадали.");
                    return;
                }

                if (input_number > number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
        }

        static {
            scanner = new Scanner(System.in);
        }
    }

