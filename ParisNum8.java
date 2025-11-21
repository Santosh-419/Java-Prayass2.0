  
  public class ParisNum8{
  
  public static void main(String []args){
  
  int arr={2,5,6,8,6,7};
  
  int target=9;
  
  public void disply(){
  
  for(int i=0;i<arr.length;i++){
  
  for(int j=1+i;j<arr.length;j++){
  
   int sum=arr[i]+arr[j];
   if(sum==target){
   
   System.out.println("It's Parise Number"+arr[i]+","+arr[j]);
  
  }
  }
  }
  
  }
  
  
  }
  
  
  }