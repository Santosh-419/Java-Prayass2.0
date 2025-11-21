/*Create variables for a product name, price, and quantity.
 Print the total cost using those variables.
Example Output:
"You bought 3 Notebooks for ₹50.0 each. Total cost: ₹150.0."
*/

  import java.util.Scanner;
  public class TotalCost{
   
   public static void main(String args[]){
   
    Scanner San1=new Scanner (System.in);
	
	System.out.println("Enter The Product Name:");
	String  productName=San1.next();
	
	System.out.println(" Enter The Price :");
	float price=San1.nextFloat ();
	
	
	System.out.println("Enter Total Cost:");
	float totalQuantity=San1.nextFloat();
	
	System.out.println("You bouthgt  "+ productName +   "  NoteBooks for " + price + " each "+ " Total cost:150.0" );
   
   
   
   
   }
  
  
   
    
	
	}