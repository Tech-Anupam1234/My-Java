package pkg100programs_level3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        //21.WAP to display all the Natural numbers from 1 to n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n");
//
//        int n = sc.nextInt();
//        // natural numbers from 1 to n 
//        System.out.println("Natural numbers from 1 to " + n + " are:");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//
//        }
//        sc.close();
        //22.WAP to display all the Natural numbers from 1 to n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n");
//
//        int n = sc.nextInt();
//        //Natural numbers from 1 to n in reverse order
//        System.out.println("Natural number from " + n + " to 1 are:");
//        for (int i = n; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
//        sc.close();
        //23.Write a program to display all even numbers from 1 to n.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Value of n");
//
//        int n = sc.nextInt();
//        //.even numbers from 1 to n.
//        System.out.println("Even number from 1 to n");
//        for (int i = 2; i <= n; i = i + 2) {
//            System.out.print(i + " ");
//        }
//        sc.close();
        //   24.Write a program to display all ODD numbers from 1 to n.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //Odd number from 1 to n
//        System.out.println("Odd Number from 1 to n");
//        for (int j = 1; j <= n; j = j + 2) {
//            System.out.print(j + " ");
//        }
//        sc.close();
        //25.WAP to print product of all natural numbers(Factorial Of n);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number ");
//        int n = sc.nextInt();
//        double fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact = fact * i;
//
//        }
//        System.out.println("Factorial of " + n + " is " + fact);
//        sc.close();
        //26.WAP to print multiplication table of 1 to n;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number :");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            int mul = n * i;
//
//            System.out.println(mul);
//        }
//        sc.close();
        //27.  Write a program to display all multiples of a number m up to n terms.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :");
//        int num = sc.nextInt();
//        System.out.print("Enter how many terms :");
//        int terms = sc.nextInt();
//        for (int i = 1; i <= terms; i++) {
//            System.out.println(num + "x" + i + "=" + num * i);
//        }
//          sc.close();
          //Find the sum of all natural numbers from 1 to n
          
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the term");
          int n=sc.nextInt();
          int sum=1;
          for(int i=1;i<=n;i++)
          {
             sum=sum+i;
              System.out.println("sum is :"+sum);
          }
           sc.close();
    }

}
