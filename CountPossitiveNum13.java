/*Count Positive Numbers:
 Count how many positive numbers are in an array.
 */
 import java.util.Scanner;
 
 public  class CountPossitiveNum13{
	 
 public static void main (String []x){
 
  
  int arr []=new int [5];
  
  int count=0;
  
  Scanner San1=new Scanner(System.in);
  
  for(int i=1;i<arr.length;i++){
  
   arr[i]=San1.nextInt();
   
   if(arr[i]>0)
   count++;
  }
  System.out.println("Possitive Number"+count);
 }
 }