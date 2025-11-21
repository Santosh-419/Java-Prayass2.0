

 public class LinearSearch17 
 {
   public static void main(String[]X)
   {
     
	 
	 boolean check=false;
	  
	 int arr[]={5,7,8,9,4,6};
	 
	  int target=5;
	  
	  for(int i=0;i<arr.length;i++)
	  {
	     if(arr[i]==target)
		 {
		   
		   check=true;
		   break;
		 }
	  }
	    
		if(check)
	    {
			System.out.println("linear serch"+arr[i]);
		}
		
		 else
		 {
			 System.out.println("-1");
		 }
   }
  }