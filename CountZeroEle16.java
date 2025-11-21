import java.util.Scanner;

 public class CountZeroEle16 
 {
   public static void main(String[]X)
   {
     int count=0;
	 
	 boolean check=false;
	  
	 int arr[]={5,5,8,9,4,6};
	 
	  int zero=0;
	  
	  for(int i=0;i<arr.length;i++)
	  {
	     if(arr[i]==zero)
		 {
		   count++;
		   check=true;
		 }
	  }
	    
		if(check)
	    {
			System.out.println(count);
		}
		
		 else
		 {
			 System.out.println("There Are Know Zero Number In Arr");
		 }
   }
  }