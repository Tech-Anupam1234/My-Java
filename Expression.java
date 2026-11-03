/*Udemy example
  Area of a Triangle

import java.lang.*;
import java.util.scanner;

class Expression
{
     public static void main(String args[])
      {
       float base,height,area;
       System.out.println("Enter Base and Height ");

       Scanner sc=new Scanner(System.in);
       base=sc.nextFloat();
       height=sc.nextFloat();

      area=base*height/2;
    
     System.out.println("Area of a Triangle is " +area);

     }
}

  **/

import java.util.Scanner;

class Expression {
  @SuppressWarnings("resource")
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int a, b, c;
    float s, area;

    System.out.println("enter 3 sides of triangle");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    s = (a + b + c) / 2f;

    area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));

    System.out.println("Area is  " + area);

  }

}
