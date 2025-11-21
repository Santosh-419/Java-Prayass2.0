public class PiramidInvertHolo{


 public static void main (String []args){
 
  int j,i;
  int n=7;
  
  for(i=1;i<=n;i++)
  {
  for(j=1;j<=n;j++)
  {
	
if(j<=i)

System.out.print(" ");	

 else  if(i==1 || j==i || j==(n-i)+1)
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