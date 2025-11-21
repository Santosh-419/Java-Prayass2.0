/*Declare variables for a car brand, model, and year. 
Print a descriptive sentence.
Example Output:
"The car is a 2022 model Honda Civic."
*/

import java .util.Scanner;

public class Model{

 public static void main (String []args){
 
 Scanner San1=new Scanner (System.in);
 
 System.out.println("Enter The Car Brand:");
 String carBrand= San1.next();
 
  System.out.println("Enter The Car Model:");
  String  model= San1.next();
  
  System.out.println("Enter The Car Year:");
  short year=San1.nextShort();
  
  System.out.println("The car is a "+ year + " model  "+ carBrand " "+ model);
  
   }
   }