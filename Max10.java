import java.util.Scanner ;

 public class Max10
 {
    public static void main(String []X)
	{
	  
	   
	   int arr[]=new int[5];
	   
	   int max;
	   
	   max=arr[0];
	   
	    Scanner San1=new Scanner (System.in);
		
	    for(int i=1;i<arr.length;i++)
	   {
	      arr[i]=San1.nextInt();
		  
		  if(arr[i]>max)
		  max=arr[i];
	   }
	    
		System.out.println("Max Number:"+ max);
	   
	}
 }