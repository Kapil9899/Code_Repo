package com.example.exercise;

import java.util.Scanner;

public class RPNCalculator {

	 public static void main(String args[])

     {

                 PostfixOperation p=new PostfixOperation();

                 Scanner scr=new Scanner(System.in);

                 System.out.print("Enter the  expression: ");

                 String str=scr.next();

                 char b[]=str.toCharArray();                

                 System.out.print("\nResult  : "+p.eval(b));

                

     }
}
