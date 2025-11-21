/*Declare variables to store the name of a student, their grade, and their school name. Print them in a single sentence.
Example Output:
"Student John is in grade 10 at Green Valley High School."
*/
   
 import java.util.Scanner;
 
 public class StudentInfo{
 
 public static void main(String [] args){
 
   Scanner San1= new Scanner(System.in);
   
   System.out.println("Enter The Student Name:");
   String Name= San1.next();
   
   System.out.println(" Enter The  Student Grade:");
   String Grade=San1.next();
   
   System.out.println("Enter The School Name:");
   String SchoolName=San1.next();
   
   System.out.println("Student "+Name+" Is In Grade "+Grade+"At "+SchoolName+" High School");
 
 
 }
 
 
 }