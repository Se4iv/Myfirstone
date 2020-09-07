package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){


        //first task
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Последняя цифра: " + num%10);


        //second task
        System.out.println("Введите целое трехзначное число: ");
        int num2 = scanner.nextInt();
        int sum2 = num2%10 + (num2 - num2%10)/10%10 + (num2 - num2%100)/100;
        System.out.println("Сумма цифра: " + sum2);

        //third task
        System.out.println("Введите целое число: ");
        int num3 = scanner.nextInt();
        if(num3>0){
            num3++;
        }

        System.out.println("Новое число: " + num3);

        //forth task
        System.out.println("Введите целое число: ");
        int num4 = scanner.nextInt();
        if(num4>0){
            num4++;
        }
        else if (num4<0){
            num4-=2;
        }
        else if (num4 ==0){
            num4 = 10;
        }

        System.out.println("Новое число: " + num4);


        //fifth task
        System.out.println("Введите три целых числа: ");
        int[] arr= new int[3];
        for (int i=0;i <3;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);


        System.out.println("Наименьшее число : " + arr[0]);


        //sixth task
        System.out.println("Введите целое число: ");
            int num6 = scanner.nextInt();
        if(num6 >0&&num6%2==0){
            System.out.println("Положительное четное число!");
        }
        else if (num6>0&&num6%2>0){
            System.out.println("Положительное нечетное число!");
        }
        else if (num6==0){
            System.out.println("Нулевое число!");
        }
        else if (num6<0&&num6%2==0){
            System.out.println("Отрицательное четное число!");
        }
        else if (num6<0&&num6%2<0){
            System.out.println("Отрицательное нечетное число!");
        }

        //seventh task
        System.out.println("Введите код города: ");
        int code = scanner.nextInt();
        switch(code){
            case(905):
                System.out.println("Москва.Стоимость разговора: " + 10*4.15);
                break;
            case(194):
                System.out.println("Ростов.Стоимость разговора: " + 10*1.98);
                break;
            case(491):
                System.out.println("Краснодар.Стоимость разговора: " + 10*2.69);
                break;
            case(800):
                System.out.println("Киров.Стоимость разговора: " + 10*5.00);
        }

        //eighth task
        int[] arr2 = new int[]{1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int sum3 =0;
        int sum4 = 0;
        int count = 0;
        int sum5 = 0;
        int count2 = 0;
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length; i++){
            if (arr2[i]>0){
             sum3+=arr2[i];
             count++;
            }
            if(arr2[i]<0&&arr2[i]%2<0){
                sum4+=arr2[i];
            }
            if (arr2[i]<0){
                sum5+=arr2[i];
                count2++;
            }
        }
        System.out.println("Максимальное число массива: " + arr2[arr2.length-1]);
        System.out.println("Сумма положительных чисел: " + sum3);
        System.out.println("Сумма четных отрицательных чисел: " + sum4);
        System.out.println("Количество положительных чисел: " + count);
        System.out.println("Среднее арифметическое отрицательных чисел: " + sum5/count2);


        //ninth task
        int[] arr3 = new int[]{15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        for (int j=0;j< arr3.length/2; j++){
            int temp = arr3[arr3.length-1-j];
            arr3[arr3.length-1-j]=arr3[j];
            arr3[j]=temp;

            
        }

        for (int a=0;a< arr3.length; a++)
             {
            System.out.println(a +" = "+ arr3[a]);
        }


            //tenth task
        int count3 = 0;
        int[] arr4 = new int[]{15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        for (int k=0;k< arr4.length - count3; k++){
            if(arr4[k]==0){
                int temp2=arr4[arr4.length-1-count3];
                if (temp2==0){
                    count3++;
                    temp2 = arr4[arr4.length-1-count3];
                }

                arr4[arr4.length-1-count3]=arr4[k];
                arr4[k]=temp2;
                count3++;

            }
        }

        for (int a=0;a< arr4.length; a++)
        {
            System.out.println(a +" = "+ arr4[a]);}

        //tenth task version 2

        int[] arr5 = new int[]{15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        for (int k=0;k< arr5.length; k++){
            if(arr5[k]==0){
                int count4 = 0;
                for (int h=k+1;h< arr5.length; h++){
                    int temp2=arr5[h];
                    arr5[h]=arr5[k + count4];
                    arr5[k + count4]=temp2;
                    count4++;
                }


            }
        }

        for (int a=0;a< arr5.length; a++)
        {
            System.out.println(a +" = "+ arr5[a]);}
    }
    }

