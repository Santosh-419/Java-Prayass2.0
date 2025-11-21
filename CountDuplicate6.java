/*Count Duplicates: Count how many duplicate values are in an array.*/





public class CountDuplicat6{

 public static void main(String []args){
 
  int arr[]={4,5,4,5,9,9};
  
   int  count=1;
	
	 for(int i=1;i<arr.length;i++){
	 
	  for(int j=1+i;j<arr.length;j++){
	  
	  if(arr[i]==arr[j]){
	  
	  count++;
	  }
	  
	  
	  }
	 
	 
	 }
	 
	 System.out.println("Dublicate Number"+count);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
 
   