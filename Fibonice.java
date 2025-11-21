  
  
  public class Fibonice{
  
  public static int sum=0;
   public static void main(String []args){
   
   int a=0;int b=1;
   
   for(int i=0;i<=80;i++){
   
      sum=a+b;
	   
	   a=b;
	   b=sum;
	   
	   
	   System.out.println(" Fibinices"+b);
   
   }
   }
  
  }