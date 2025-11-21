/*Create variables to store your favorite food, favorite color, and favorite hobby. 
Print them in one line.
Example Output:
"My favorite food is Pizza, my favorite color is Blue, and I love Painting."
*/

import java .util.Scanner;
public class SantoshFav{
	
	public static void main(String []args){

  Scanner San1 =new Scanner(System.in);
  
  System.out.println("Enter The Santosh Favorite Food:");
  String FavoriteFood=San1.next();
  
  System.out.println("Ente The Santosh Favoritr Color:");
   String FavoriteColor= San1.next();
   
    System.out.println("Enter The Santosh Favorite  Hobby: ");
	String Hobby=San1.next();
	
	System.out.println("Santosh Favorite Food Is  "+ FavoriteFood+ "  Favorite Color " + FavoriteColor + " Hobby Is " + Hobby);

}
}
