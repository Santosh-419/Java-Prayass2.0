
 public class nagetiveNumBegining
 {
   public static void main(String[]X)
   {
     int arr1[]={-5,4,-8,9,-5};
   
      int end=arr1.length;
       
     int arr2[]=new int[end];

       for(int i=0;i<arr1.length;i++)
         {
		    if(arr1[i]<0)
			{
			 arr2[i]=arr1[i];
			
			}
		 
		 
		 }

          for(int j=0;j<arr1.length;j++)
		  {
		   
		   if(arr1[j]>0)
		   {
		     arr2[end-2+j]=arr1[j];
		   
		   
		   }
		  
		  
		  
		  
		  }
   
   }
 
 
 
 }