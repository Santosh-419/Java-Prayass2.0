import java.util.Scanner;

 public class SumOfOddEle15
 {
 
 
  public static void main(String[]X)
  {
     int sum=0;
	 
    int arr[]=new int[5];
   
    Scanner San1=new Scanner(System.in);
 
    for(int i=0;i<arr.length;i++)
   {
     System.out.println("ENter The Even Number:");
    
	   arr[i]=San1.nextInt();
	   
	    if(arr[i]%2!=0)
		{
		  sum+=arr[i];
		 
		
		}
   }
       System.out.println("Sum Of Odd Number"+sum);
   
 
  }
 
 
 
 
 
 
 
 }