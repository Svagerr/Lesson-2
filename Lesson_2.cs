﻿ /* Created by SharpDevelop.
 * User: Дима
 * Date: 04.05.2019
 * Time: 20:55
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Lesson_2
{
class Program
{
	
	                                             /* Условные операторы */
	
   public static void func0(int a, int b)
   {
     if(a%2 == 0) {
          Console.Write(a*b);
          Console.ReadKey(true);
    } else {
          Console.Write(a+b);
          Console.ReadKey(true);
    }
   }
   
   public static void func1(int x, int y)
   {
   if(x > 0 && y > 0){
         Console.Write("one");
          Console.ReadKey(true);
    } else if(x < 0 && y > 0){
        Console.Write("two");
          Console.ReadKey(true);
    } else if(x < 0 && y < 0){
        Console.Write("three");
          Console.ReadKey(true); 
    } else {
        Console.Write("four");
          Console.ReadKey(true);
    }
     }
    
   public static void func2(int a, int b, int c)
   {
   	int sum = 0;
    if(a > 0) {
        sum += a;
    }
    if(b > 0) {
        sum += b;
    }
    if(c > 0) {
        sum += c;
    }
    Console.Write(sum);
    Console.ReadKey(true);
                   }
   
   public static void func3(int a, int b, int c)
   {
   		if((a*b*c) > (a+b+c)){
        Console.Write((a*b*c)+3);
        Console.ReadKey(true);
    } else {
         Console.Write((a+b+c)+3);
         Console.ReadKey(true);
    }
   }
   
   public static void func4(int a)
   {
   	if(a>=0 && a<=20) {
   		Console.Write('F');
   	} else if(a>=21 && a<=40) {
   		Console.Write('E');
   	} else if(a>=41 && a<=59) {
   		Console.Write('D');
   	} else if(a>=60 && a<=74) {
   		Console.Write('C');
   	} else if(a>=75 && a<=89) {
   		Console.Write('B');
   	} else {
   		Console.Write('A');
   	}
   	Console.ReadKey(true);
    }
   
   													    /* Циклы */
										 
   public static void func5(int num)												     
   {
   		  int sum = 0;
   		  int val = 0;
    for(int i = 0; i <= num; i++)
    	{
        if(i%2 == 0){
            sum += i;
            val += 1;
        }
   }
    	Console.Write(sum);
    	Console.Write("\n");
    	Console.Write(val);
   		Console.ReadKey(true);
   }
   
   public static void func6(int num)												     
   {
   	string rez = " ";
    for(int i = 2; i < num; i++){
        if(num%i == 0){
            rez = "-";
            break;
        } else {
            rez = "+";
        }
    }
    Console.Write(rez);
    Console.ReadKey(true);
   }
   
   //Zadacha_func7
   
   public static void func9(int num)
   {
   		int factorial = 1;
    for(int i = 1; i <= num; i++){
        factorial *= i;
        if(num == 0){
            factorial = 1;
        }
    }
    Console.Write(factorial);
    Console.ReadKey(true);
   }
   
   public static void func10(double num)
   {
   	    double sum = 0;
    	for(double i = num; i > 0; i = i / 10){
        	double val = Math.Round(i, 0);
        	i = val;
        	sum = sum + (i%10);
    }
   	    double rez = Math.Round(sum, 0);
   	    
    	Console.Write(rez);
    	Console.ReadKey(true);
   }
   
   public static void func11(double num)
   {
   	    double sum = 0;
    	for(var i = num; i > 0; i = Math.Round(i/10, 0)){
        sum = sum * 10 + (i%10);
    }
    Console.Write(sum);
    Console.ReadKey(true);
   }
   
   
                                                  /*Одномерные массивы*/
   
   public static void func12(params int[] arr)
   {
   		int min = arr[0];
   		int max = arr[0];
    	for(int i = 0; i < arr.Length; i++){
        	if(arr[i] < min){   
         		min = i;
        }
   			if(arr[i] > max){   
         		max = i;
        }
    }
    Console.Write(min);
    Console.Write("\n");
    Console.Write(max);
    Console.ReadKey(true);
   }
   
   public static void func13(params int[] arr)
   {
   		int max = arr[0];
   		int min = arr[0];
    	for(int i = 0; i < arr.Length; i++){
        	if(arr[i] > max){   
         		max = i;
        }
   			if(arr[i] < min){   
         		min = i;
        }
    }
    Console.Write(min);
    Console.Write("\n");
    Console.Write(max);
    Console.ReadKey(true);
   }
   
   public static void func14(params int[] arr)
   {
   		 int sum = 0;
    	for(int i = 0; i < arr.Length; i++){
        	if(i%2 != 0){
            	sum += arr[i];
        }
    }
    Console.Write(sum);
    Console.ReadKey(true);
   }
   
   public static int[] func15(params int[] arr)
    {
     	int[] response = new int[arr.Length];
        int currentIndex = arr.Length - 1;
        for (int i = 0; i <= (arr.Length - 1); currentIndex--, i++)
        {
            response[currentIndex] = arr[i];
        }
        return response;
        
    }
   
   public static void func16(params int[] arr)
   {
   		int sum = 0;
    	for(int i = 0; i < arr.Length; i++){
        	if(arr[i]%2 != 0){
            sum += 1;
        }
    }
    Console.Write(sum);
    Console.ReadKey(true);
   } 
   
 
                                                       /*Функции*/
                                                       
   public static void func19(int a)
    {  
        switch (a)
        {
        	case 1: Console.Write("Понедельник"); break;
            case 2: Console.Write("Вторник"); break;
            case 3: Console.Write("Среда"); break;
            case 4: Console.Write("Четверг"); break;
            case 5: Console.Write("Пятница"); break;
            case 6: Console.Write("Суббота"); break;
            case 7: Console.Write("Воскресенье"); break;
        }
        Console.ReadKey(true);
    }
   
  /* public static string func20(string num)
   {
   		string str = num;
   		string[] arrNum = str.Split("");
   		string[] arr0 = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
   		string[] arr1 = {"десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
   		string[] arr2 = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестдесят", "семдесят", "восемдесят", "девяносто"};
   		string[] arr3 = {"сто", "двесте", "триста", "четыреста", "пятсот", "шестсот", "семсот", "восемсот", "девятсот"};
    
    	if(arrNum.Length == 3 && arrNum[1] == 1){
          Console.Write(arr3[arrNum[0] - 1] + " " + arr1[arrNum[2]]);
   		} else if(arrNum.Length == 3){
          Console.Write(arr3[arrNum[0] - 1] + " " + arr2[arrNum[1] - 2] + " " + arr0[arrNum[2] - 1]);
    	} else if(arrNum.Length == 2 && arrNum[0] == 1){
          Console.Write(arr1[arrNum[1]]);
    	} else if(arrNum.Length == 2 && arrNum[0] != 1){
          Console.Write(arr2[arrNum[0] - 2] + ' ' + arr0[arrNum[1] - 1]);
    	} else if(arrNum.Length == 1){
   			Console.Write(string.Join(",",arr0[arrNum[0] - 1]));
    }
   		
   } */
                                                       
   public static void func21(string num)
   {
   	string[] arrNum = num.Split(' ');
    long thousands = 0 , millions = 0, billions  = 0;
    long newNum = 0, newNum1 = 0, newNum2 = 0, newNum3 = 0;

    for(long i = 0; i < arrNum.Length; i++){
        
        switch(arrNum[i]){
                
            case "один": newNum += 1; break;
            case "одна": newNum += 1; break;
            case "два": newNum += 2; break;
            case "две": newNum += 2; break;
            case "три": newNum += 3; break;
            case "четыре": newNum += 4; break;
            case "пять": newNum += 5; break;
            case "шесть": newNum += 6; break;
            case "семь": newNum += 7; break;
            case "восемь": newNum += 8; break;
            case "девять": newNum += 9; break;
            case "ноль": newNum += 0; break;
           
            case  "десять": newNum += 10; break;
            case  "одиннадцать": newNum += 11; break;
            case  "двенадцать": newNum += 12; break;
            case  "тринадцать": newNum += 13; break;
            case  "четырнадцать": newNum += 14; break;
            case  "пятнадцать": newNum += 15; break;
            case  "шестнадцать": newNum += 16; break;
            case  "семнадцать": newNum += 17; break;
            case  "восемнадцать": newNum += 18; break;
            case  "девятнадцать": newNum += 19; break;
                
            case "двадцать": newNum += 20; break;
            case "тридцать": newNum += 30; break;
            case "сорок": newNum += 40; break;
            case "пятьдесят": newNum += 50; break;
            case "шестьдесят": newNum += 60; break;
            case "семьдесят": newNum += 70; break;
            case "восемьдесят": newNum += 80; break;
            case "девяносто": newNum += 90; break;
                
            case "сто": newNum += 100; break;
            case "двести": newNum += 200; break;
            case "триста": newNum += 300; break;
            case "четыреста": newNum += 400; break;
            case "пятьсот": newNum += 500; break;
            case "шестьсот": newNum += 600; break;
            case "семьсот": newNum += 700; break;
            case "восемьсот": newNum += 800; break;
            case "девятьсот": newNum += 900; break;
                
            case  "тысяча": thousands += 1000; break;
            case  "тысячи": thousands += 1000; break;
            case  "тысяч": thousands += 1000; break;
                
            case  "миллион": millions += 1000000; break;
            case  "миллиона": millions += 1000000; break;
            case  "миллионов": millions += 1000000; break;
            
            case  "миллиард": billions += 1000000000; break;
            case  "миллиарда": billions += 1000000000; break;
            case  "миллиардов": billions += 1000000000; break;
        }
        
        if(arrNum[i] == "миллиард" || arrNum[i] == "миллиарда" || arrNum[i] == "миллиардов"){
            newNum *= billions;
            newNum2 = newNum;
            newNum = 0;
        }
        if(arrNum[i] == "миллион" || arrNum[i] == "миллиона" || arrNum[i] == "миллионов"){
            newNum *= millions;
            newNum1 = newNum;
            newNum = 0;
        }
        if(arrNum[i] == "тысяча" || arrNum[i] == "тысячи" || arrNum[i] == "тысяч"){
            newNum *= thousands;
            newNum3 = newNum;
            newNum = 0;
        }
    } 
    long nums = newNum1 + newNum2 + newNum3 + newNum;
    Console.Write(nums);
    Console.ReadKey(true);
} 
   
   public static void func22(double x1, double y1, double x2, double y2) {
        double n = Math.Sqrt(Math.Pow((x2 - x1), 2) + Math.Pow((y2 - y1), 2));
        Console.WriteLine(n);
        Console.ReadKey(true);
    }
   
   static void Main(string[] args)
   {
   	//Условные операторы
   	//func0(2, 4);
   	//func1(4, 5);
   	//func2(1, 2, -4);
   	//func3(1, 2, 3);
   	//func4(50);
   	
   	//Циклы
   	//func5(100);
   	//func6(13);
   	//func9(3);
   	//func10(123);
   	//func12(1, 2, 3, 4);
   	//func13(1, 2, 3, 4);
   	//func14(1,2,3,4);
   	//func15(1,2,3);
   	//func16(1,2,3);
   	//func17(1,2,3,4);
   	
   	
   	//Функции
   	//func19(1);
   	//func20(22);
   	//func21("пять миллиардов девятьсот сорок пять миллионов пятьсот пятьдесят семь тысяч сто двадцать три");
   	func22(1, 2, 3, 5);
}
}}