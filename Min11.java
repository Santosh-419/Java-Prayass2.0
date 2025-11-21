import java.util.Scanner ;

 public class Min11
 {
    public static void main(String []X)
	{
	  
	   
	   int arr[]=new int[5];
	   
	   Scanner San1=new Scanner (System.in);
	   
	   System.out.println("ENter The Number:");
	   
        arr[0]=San1.nextInt();
		
		int min=arr[0];
	 
	    for(int i=1;i<arr.length;i++)
	   {
		   System.out.println("Enter The NUmber:");
	      arr[i]=San1.nextInt();
		  
		  if(arr[i]<min)
		  min=arr[i];
	   }
	    
		System.out.println("min Number:"+ min);
	   
	}
 }