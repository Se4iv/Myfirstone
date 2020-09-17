package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

    Scanner scanner = new Scanner(System.in);

    //first task
    public int lastNumber() {
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        return num % 10;
    }

    //second task
    public int sumNumbers() {
        System.out.println("Введите целое трехзначное число: ");
        int num = Math.abs(scanner.nextInt());
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    //third task
    public int checkNum() {
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        if (num > 0) {
            num++;
        }
        return num;
    }


    //forth task
    public int changeNum() {
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        if (num > 0) {
            num++;
        } else if (num < 0) {
            num -= 2;
        } else {
            num = 10;
        }
        return num;
    }


    //fifth task
    public int leastNumber() {
        System.out.println("Введите три целых числа: ");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        return arr[0];
    }


    //sixth task
    public String descriptionNumber() {
        System.out.println("Введите целое число: ");
        String descr = "";
        int num = scanner.nextInt();
        if (num > 0) {
            descr = "Положительное " + isEvenNumber(num) + " число!";
        } else if (num < 0) {
            descr = "Отрицательное " + isEvenNumber(num) + " число!";
        } else {
            descr = "Нулевое число!";
        }
        return descr;
    }

    public String isEvenNumber(int number) {
        String descr = "четное";
        if (number % 2 != 0) {
            descr = "нечетное";
        }
        return descr;
    }

    //seventh task
    public String talkCost() {
        System.out.println("Введите код города: ");
        int num = scanner.nextInt();
        int duration = 10;
        String descr = "";
        switch (num) {
            case (905) -> descr = "Москва.Стоимость разговора: " + duration * 4.15;
            case (194) -> descr = "Ростов.Стоимость разговора: " + duration * 1.98;
            case (491) -> descr = "Краснодар.Стоимость разговора: " + duration * 2.69;
            case (800) -> descr = "Киров.Стоимость разговора: " + duration * 5.00;
        }
        return descr;
    }

    //eighth task
    public String modifyArray() {
        int[] arr = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(arr);
        int sumPositive = 0;
        int countPositive = 0;
        int sumEvenNegative = 0;
        int sumNegative = 0;
        int countNegative = 0;
        String descr = "";
        for (int value : arr) {
            if (value > 0) {
                sumPositive += value;
                countPositive++;
            } else if (value % 2 == 0) {
                sumEvenNegative += value;
            } else if (value < 0) {
                sumNegative += value;
                countNegative++;
            }

        }
        return descr = "Максимальное число массива: " + arr[arr.length - 1] + "\n"
                + "Сумма положительных чисел: " + sumPositive + "\n"
                + "Сумма четных отрицательных чисел: " + sumEvenNegative + "\n"
                + "Количество положительных чисел: " + countPositive + "\n"
                + "Среднее арифметическое отрицательных чисел: " + sumNegative / countNegative;

    }


    //ninth task
    public String reverseArray() {
        String descr = "";
        int[] arr = new int[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = arr[j];
            arr[j] = temp;
        }

        for (int a = 0; a < arr.length; a++) {
            descr += a + " = " + arr[a] + "\n";
        }
        return descr;
    }

    //tenth task
    public String moveZeroArray() {
        String descr = "";
        int[] arr = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0) {
                int count = 0;
                for (int h = k + 1; h < arr.length; h++) {
                    int temp = arr[h];
                    arr[h] = arr[k + count];
                    arr[k + count] = temp;
                    count++;
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            descr += a + " = " + arr[a] + "\n";
        }
        return descr;
    }

}

