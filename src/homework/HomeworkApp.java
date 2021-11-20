package homework;

import java.util.Scanner;

public class HomeworkApp {
            public static void main(String... args) {

                printThreeWord();

                checkSumSign();

                printColor();

               compareNumbers();

            }

            static void printThreeWord() {
                System.out.println("Orange");
                System.out.println("Banana");
                System.out.println("Apple");
            }
            static void checkSumSign(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите первое число:");
                int a=sc.nextInt();
                System.out.println("Введите второе число:");
                int b=sc.nextInt();
                int summa=a+b;
                if(summa>=0) {
                    System.out.println("Сумма положительная");
                } else {
                    System.out.println("Сумма отрицательная");
                }
            }
            static void printColor(){
                Scanner color = new Scanner(System.in);
                System.out.println("Введите цену:");
                int value=color.nextInt();
                if(value<=0) {
                    System.out.println("Красный");
                } if(value>0 && value<=100){
                    System.out.println("Желтый");}
                    else  {
                        System.out.println("Зеленый");
                    }

        }

    static void compareNumbers(){
        Scanner number = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a=number.nextInt();
        System.out.println("Введите b: ");
        int b=number.nextInt();
        if(a>=b) {
            System.out.println(a + " >= " + b);
        } else System.out.println(a + " < " + b);
    }
    }
