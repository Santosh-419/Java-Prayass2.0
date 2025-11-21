/*First Unique Element:
 Find the first unique element in an array*/

 public class UniqueNum{

 public static void main(String []args){
 
 int unique=0;
 
 int arr[]={2,5,8,9,2,5,9,3};
 
 for(int i=0;i<arr.length;i++){
 
  for(int j=1+i;j<arr.length;j++){
  
   if(arr[i]== arr[j]){
	   
	   break;
   
  
   }                           
	 
   }
    System.out.println("This Is Uique num"+arr[i]);
  
  }
  
 
 }
 
 
 
}  
 
 
