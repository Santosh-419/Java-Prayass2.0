/*Declare a book title, author name, and number of pages.
 Print something like:
"The book 'Atomic Habits' by James Clear has 320 pages."
*/

 import java .util.Scanner;
 
 public class Writer{
  
   public static void main(String []args){
   
     Scanner San1=new Scanner(System.in);
	 
	 System.out.println("Enter The Book Author Name:");
	 String authorName=San1.next();
	 
	 System.out.println("Enter The Title Name: ");
	 String title =San1.next();
	 
	 System.out.println("Enter The Number Of Pages:");
     int numberOfPages=San1.nextInt();
	 
	 System.out.println("The Book  "+ "'"+title+"'" +" by " + authorName + " has "+ numberOfPages+ "."+ " pages");
   
     
	 }
    
	 
	  
	   }