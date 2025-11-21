/*Create variables for temperature, humidity, and weather condition. 
Print the weather report.
Example Output:
"Today's weather: 31°C, 60% humidity, and sunny."
*/
 import java .util.Scanner ;
 public class Weather{
 
    public static void main(String[]args){
	    
	    Scanner San1=new Scanner (System.in);
		
		System.out.println("Enter The Tempreture:");
		int tem=San1.nextInt();
		
		System.out.println(" Enter The Humidity " );
		String humidity =San1.next();
		
		System.out.println("Enter The weathe :");
		String weather=San1.next();
		
		System.out.println("Today's waether: "+ tem+ " C "+ humidity +" humidity "+ "And " +weather  );
	        
		 
		 
		  
		  }
   
    
	
	 }
