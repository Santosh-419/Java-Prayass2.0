public class Digits{



 public static void main(String []args){
 
 int num=154;
 int sum=0;
 int c=1;
 
 int i;
 
 int b=3;
 while(c<=b){ 
 
  num%=10;
  
  sum+=num;
  
  num/=10;
  
System.out.println(sum);
  
 c++;
 
 
 
 }
 
 }


}