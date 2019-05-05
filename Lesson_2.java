package com.example.myapplication;

import java.util.List;
import java.util.Arrays;

public class Lesson_2 {

    public static void main(String[] args) {

        //func0(4, 5);
        //func1(4, 4);
        //func2(1,2,3);
        //func3(1, 2, 3);
        //func4(54);


        //func5(54);
        //func6(55);
        func7(9);
        //func8(3);
        //func9(123);
        //func10(123);


        int[] array = {4, 2, 8, 2, 2, 3};
        //System.out.println(func11(array));
        //System.out.println(func12(array));
        //System.out.println(func13(array));
        //System.out.println(func14(array));
        //System.out.println(func15(array));
        //System.out.println(func16(array));
        //System.out.println(func17(array));
        //System.out.println(bubble(array));
        //System.out.println(selection(array));
        //System.out.println(insert(array));


        //func17(4);
        //func18(4);
        //func19("пять миллиардов сто миллионов пятьсот тысяч триста три");
        //func20(1, 4, 6, 8;

    }


    public static void func0(int a, int b) {
        if (a % 2 == 0) {
            System.out.println(a * b);
        } else {
            System.out.println(a + b);
        }
    }

    public static void func1(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("one");
        } else if (x < 0 && y > 0) {
            System.out.println("two");
        } else if (x < 0 && y < 0) {
            System.out.println("three");
        } else {
            System.out.println("four");
        }
    }

    public static void func2(int a, int b, int c) {
        int sum = 0;
        if (a > 0) {
            sum += a;
        }
        if (b > 0) {
            sum += b;
        }
        if (c > 0) {
            sum += c;
        }
        System.out.println(sum);
    }

    public static void func3(int a, int b, int c) {
        if ((a * b * c) > (a + b + c)) {
            System.out.println((a * b * c) + 3);
        } else {
            System.out.println((a + b + c) + 3);
        }
    }

    public static void func4(int a) {
        if (a >= 0 && a <= 20) {
            System.out.println('F');
        } else if (a >= 21 && a <= 40) {
            System.out.println('E');
        } else if (a >= 41 && a <= 59) {
            System.out.println('D');
        } else if (a >= 60 && a <= 74) {
            System.out.println('C');
        } else if (a >= 75 && a <= 89) {
            System.out.println('B');
        } else {
            System.out.println('A');
        }
    }


    /* Циклы */


    public static void func5(int num) {
        int sum = 0;
        int val = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
                val += 1;
            }
        }
        System.out.println(sum);
        System.out.println("\n");
        System.out.println(val);
    }

    public static void func6(int num) {
        String rez = " ";
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                rez = "-";
                break;
            } else {
                rez = "+";
            }
        }
        System.out.println(rez);
    }

    public static void func7(int num) {
        if (num <= 0) return;
        int a = 1;
        int rez = 0;
        while (num > 0) {
            num -= a;
            a += 2;
            rez += (num < 0) ? 0 : 1;
        }
        System.out.println(rez);
    }

    public static void func8(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            if (num == 0) {
                factorial = 1;
            }
        }
        System.out.println(factorial);

    }

    public static void func9(int num) {
        int sum = 0;
        for (int i = num; i > 0; i = i / 10) {
            int val = Math.round(i);
            i = val;
            sum = sum + (i % 10);
        }
        int rez = Math.round(sum);

        System.out.println(rez);
    }

    public static void func10(int num) {
        int sum = 0;
        for (int i = num; i > 0; i = Math.round(i / 10)) {
            sum = sum * 10 + (i % 10);
        }
        System.out.println(sum);
    }



    /*Одномерные массивы*/


    public static int func11(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = i;
            }
            if (arr[i] > max) {
                max = i;
            }
        }
        //return min;
        return max;
    }

    public static int func12(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        //return min;
        return max;
    }

    public static int func13(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int func14(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            rev[arr.length - i - 1] = arr[i];
        }
        return rev[rev.length - 1];
    }

    public static int func15(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += 1;
            }
        }
        return sum;
    }

    public static String func16(int[] arr) {
        int[] newArr = new int[arr.length];
        int middle = arr.length / 2;
        int n = 0;
        for (int i = middle; i < arr.length; i++) {
            newArr[n] = arr[i];
            n++;
        }
        for (int i = 0; i < arr.length / 2; i++) {

            newArr[middle] = arr[i];
            middle++;
        }
        String done = "";
        for (int i = 0; i < newArr.length; i++) {
            done = done + Integer.toString(newArr[i]);
        }
        return done;
    }

    public static String bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        String sort = "";
        for (int i = 0; i < arr.length; i++) {
            sort = sort + Integer.toString(arr[i]);
        }
        return sort;
    }

    public static String selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        String sort = "";
        for (int i = 0; i < arr.length; i++) {
            sort = sort + Integer.toString(arr[i]);
        }
        return sort;
    }

    public static String insert(int[] arr) {
        for (int i = 1; i > arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        String sort = "";
        for (int i = 0; i < arr.length; i++) {
            sort = sort + Integer.toString(arr[i]);
        }
        return sort;
    }



    /*Функции*/


    public static void func17(int a) {
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }

    }

    /*public static void func18(int num){
        String str = Integer.toString(num);
        String[] arrNum = str.split("");
        String[] arr0 = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] arr1 = {"десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] arr2 = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестдесят", "семдесят", "восемдесят", "девяносто"};
        String[] arr3 = {"сто", "двесте", "триста", "четыреста", "пятсот", "шестсот", "семсот", "восемсот", "девятсот"};

        //if(arrNum.length == 3 && arrNum[1] == 1){
        //    System.out.println(arr3[arrNum[0] - 1] + " " + arr1[arrNum[2]]);
       // } else if(arrNum.length == 3){
       //     System.out.println(arr3[arrNum[0] - 1] + " " + arr2[arrNum[1] - 2] + " " + arr0[arrNum[2] - 1]);
       // } else if(arrNum.length == 2 && arrNum[0] == 1){
       //     System.out.println(arr1[arrNum[1]]);
      //  } else if(arrNum.length == 2 && arrNum[0] != 1){
       //     System.out.println(arr2[arrNum[0] - 2] + " " + arr0[arrNum[1] - 1]);
       // } else
        if(arrNum.length == 1){
            String rez = String.join(" ", "arr0[arrNum[0] - 1]");
    }

    }*/

    public static void func19(String num) {
        String[] arrNum = num.split(" ");
        long thousands = 0;
        long millions = 0;
        long billions = 0;
        long newNum = 0;
        long newNum1 = 0;
        long newNum2 = 0;
        long newNum3 = 0;

        for (int i = 0; i < arrNum.length; i++) {

            switch (arrNum[i]) {

                case "один":
                    newNum += 1;
                    break;
                case "одна":
                    newNum += 1;
                    break;
                case "два":
                    newNum += 2;
                    break;
                case "две":
                    newNum += 2;
                    break;
                case "три":
                    newNum += 3;
                    break;
                case "четыре":
                    newNum += 4;
                    break;
                case "пять":
                    newNum += 5;
                    break;
                case "шесть":
                    newNum += 6;
                    break;
                case "семь":
                    newNum += 7;
                    break;
                case "восемь":
                    newNum += 8;
                    break;
                case "девять":
                    newNum += 9;
                    break;
                case "ноль":
                    newNum += 0;
                    break;

                case "десять":
                    newNum += 10;
                    break;
                case "одиннадцать":
                    newNum += 11;
                    break;
                case "двенадцать":
                    newNum += 12;
                    break;
                case "тринадцать":
                    newNum += 13;
                    break;
                case "четырнадцать":
                    newNum += 14;
                    break;
                case "пятнадцать":
                    newNum += 15;
                    break;
                case "шестнадцать":
                    newNum += 16;
                    break;
                case "семнадцать":
                    newNum += 17;
                    break;
                case "восемнадцать":
                    newNum += 18;
                    break;
                case "девятнадцать":
                    newNum += 19;
                    break;

                case "двадцать":
                    newNum += 20;
                    break;
                case "тридцать":
                    newNum += 30;
                    break;
                case "сорок":
                    newNum += 40;
                    break;
                case "пятьдесят":
                    newNum += 50;
                    break;
                case "шестьдесят":
                    newNum += 60;
                    break;
                case "семьдесят":
                    newNum += 70;
                    break;
                case "восемьдесят":
                    newNum += 80;
                    break;
                case "девяносто":
                    newNum += 90;
                    break;

                case "сто":
                    newNum += 100;
                    break;
                case "двести":
                    newNum += 200;
                    break;
                case "триста":
                    newNum += 300;
                    break;
                case "четыреста":
                    newNum += 400;
                    break;
                case "пятьсот":
                    newNum += 500;
                    break;
                case "шестьсот":
                    newNum += 600;
                    break;
                case "семьсот":
                    newNum += 700;
                    break;
                case "восемьсот":
                    newNum += 800;
                    break;
                case "девятьсот":
                    newNum += 900;
                    break;

                case "тысяча":
                    thousands += 1000;
                    break;
                case "тысячи":
                    thousands += 1000;
                    break;
                case "тысяч":
                    thousands += 1000;
                    break;

                case "миллион":
                    millions += 1000000;
                    break;
                case "миллиона":
                    millions += 1000000;
                    break;
                case "миллионов":
                    millions += 1000000;
                    break;

                case "миллиард":
                    billions += 1000000000;
                    break;
                case "миллиарда":
                    billions += 1000000000;
                    break;
                case "миллиардов":
                    billions += 1000000000;
                    break;
            }

            if (arrNum[i].equals("миллиард") || arrNum[i].equals("миллиарда")  || arrNum[i].equals("миллиардов")) {
                newNum *= billions;
                newNum2 = newNum;
                newNum = 0;
            }
            if (arrNum[i].equals("миллион") || arrNum[i].equals("миллиона")  || arrNum[i].equals("миллионов")) {
                newNum *= millions;
                newNum1 = newNum;
                newNum = 0;
            }
            if (arrNum[i].equals("тысяча") || arrNum[i].equals("тысячи")  || arrNum[i].equals("тысяч")) {
                newNum *= thousands;
                newNum3 = newNum;
                newNum = 0;
            }
        }
        long nums = newNum1 + newNum2 + newNum3 + newNum;
        System.out.println(nums);
    }

    public static void func20(int x1, int y1, int x2, int y2) {
        double n = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(n);
    }
}



