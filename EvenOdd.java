//Program to check whether the given num is even or odd

import java.util.Scanner;

public class EvenOdd
{
 public static void main(String args[])
  {
    System.out.print("Enter a number = ");
    Scanner reader = new Scanner(System.in); //object creation, reader is an object
    int num = reader.nextInt();     //integer value from keyboard
    reader.close();
    if(num%2==0)
    {
     System.out.print("/Entered number "+ num + " is an Even number.");
     }
    else
    {
     System.out.print("/Entered number " + num + " is an Odd number.");
     }
   }
} 