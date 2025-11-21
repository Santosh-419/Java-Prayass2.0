/*Store your roll number, department, and college name.
 Print them in a formatted line.
Example Output:
"Roll No: 23CS45 | Department: Computer Science | College: IIT Bombay"
*/

 import java .util.Scanner;
 
 public class StudentIn{
 
  public static void main(String []args){
  
   Scanner San1=new Scanner(System.in);
   
   System.out.println("Enter The Student Roll Number:");
   int rollNumber=San1.nextInt();
   
   System.out.println("Enter The Student Deparment:");
   String department=San1.next();
   
   System.out.println("Enter The Student College Name:");
   String collegeName=San1.next();
    
	System.out.println(" Roll Number: "+ rollNumber +" Department :"+ department +"  College Name:"+ collegeName);
   
  }
   
    
	}