import java.util.Scanner;

 public class SumOfEle9
 {
   public static void main(String[]X)
   {
     Scanner San1=new Scanner(System.in);
   
     int arr[]=new int [5];
     int sum=0;
   
     for(int i=0;i<arr.length;i++)
     {
	   arr[i]=San1.nextInt();
	  
	   sum+=arr[i];
	  }
	    System.out.println(" Sum Of Element"+sum);
	
   } 
  }