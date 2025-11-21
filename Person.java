/*Declare variables for a person’s first name, last name, and age.
 Print a sentence like:
"Hi, I’m Sarah Johnson and I am 25 years old."
*/
import java .util.Scanner;

public class Person{

  public static void main(String []args){
  
   Scanner San1=new Scanner (System.in);
   
   System.out.println("Enter The First Name:");
   char name=San1.next().charAt(0);
   
   System.out.println("Enter The Last Name:");
   String lastName= San1.next();
   
  System.out.println("Enter The Age:");
   byte age=San1.nextByte();
   
   System.out.println("Hi ,I'm  " +name+ " and i am " +age+ "year old ");
  }
  
   }