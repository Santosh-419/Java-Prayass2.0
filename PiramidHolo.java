public class PiramidHolo{

 public static void main(String []args){
 
  int i,j;
  int n=7;
  
  for(i=1;i<=n;i++){
  
   for(j=1;j<=n;j++){
   
    if(j<=(n-i))
	
	System.out.print(" ");
	
	else if(j==(n-i)+1 || i==n ||j==n)
	{
	System.out.print("* ");
	}
   
   else
   {
   System.out.print("  ");
   }
   
   }
   
   System.out.println();
  
  }
 
 
 
 }






}