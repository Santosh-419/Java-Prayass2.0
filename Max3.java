/*Find Maximum: Return the maximum number in an array.*/

 
  
  public class Max3{
  
  public static void main(String []X){
   
   int arr[]={5,4,8,9,7};
   
   int max=arr[0];
   
   for(int i=1;i<arr.length;i++){
	   
	   if(arr[i]>max)
		   
	   max=arr[i];
   }
   System.out.println( max);
  
  
  }
   }
  
  