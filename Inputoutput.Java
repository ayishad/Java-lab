//Program to read input and print its value
import java.util.Scanner;

public class Inputoutput
{
  public static void main(String args[])
  {
    System.out.print("Enter a number = ");
    Scanner reader = new Scanner(System.in); //object creation, reader is an object
    int num = reader.nextInt();     //integer value from keyboard
    System.out.print("/nEntered values is = " + num); 
   }
}    
