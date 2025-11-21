/*Store a movie’s title, release year, and IMDB rating in variables.
 Print:
"The movie Inception was released in 2010 and has an IMDB rating of 8.8."
*/
import java .util.Scanner ;

public class Movie{

 public static void main(String []args){
 
  Scanner San1 =new Scanner(System.in);
  
  System.out.println("Enter  The MOvie Title");
  String title=San1.next();
  
  System.out.println("Enter The Movie Year:");
  short year=San1.nextShort();
  
 System.out.println("Enter The IMDM Rating :");
 char rating =San1.next().charAt(0);
  
  System.out.println("The movie " + title+ "was released in  "+ year+ " and has an rating of "+8.8);
 
 
  
   
   
   
   }



 
  
   
   }
