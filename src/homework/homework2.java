package homework;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        boolean result = checkSum(1, 5);
        if (result) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        plusOrMinus(10);

        boolean answer = rightOrWrong(5);
        if (answer) {
            System.out.println("Больше ноля");
        } else {
            System.out.println("Меньше ноля");
        }

        consoleStringN();
        happyNewYear();


    }


    static boolean checkSum(int a, int b) {
        int summa = a + b;
        return summa > 10 && summa <= 20;
    }

    static void plusOrMinus(int a) {
        if (a >= 0) {
            System.out.println(a + " - Положительное");
        } else {
            System.out.println(a + " - Отрицательное");
        }
    }

    static boolean rightOrWrong(int c) {
        return c >= 0;
    }


    static void consoleStringN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст строки: ");
        String s = sc.nextLine();
        System.out.println("Введите число строк N: ");
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println(s);
        }
    }

    static boolean happyNewYear() {
        Scanner yearNow = new Scanner(System.in);
        System.out.println("Введите год: ");
        int k = yearNow.nextInt();
        if ((k % 4 == 0 && (k % 100) != 0) || (k % 400 == 0)) {
           System.out.println("Год високосный, с понедельника в спортзал");
           return true;
        } else {
            System.out.println("Год не високосный, сидим ждем високосный год");
            return false;
        }

    }
}
