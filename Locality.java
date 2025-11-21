/*Store values for a city, state, and country.
 Print them in an address format.
Example Output:
"City: Pune, State: Maharashtra, Country: India"
*/

import java .util.Scanner;

 public class Locality{
 
 public static void main(String []args){
 
 Scanner San1=new Scanner (System.in);
 
 System.out.println("Enter The City Name:");
 String city=San1.next();
 
 System.out.println("Enter The State Name:");
 String state=San1.next();
 
  System.out.println("Enter The Country Name:");
  String country=San1.next();
  
  System.out.println("City : "+city + " State: "+ state +"Country :" +country);
  
   
    
	}
  
   
    }