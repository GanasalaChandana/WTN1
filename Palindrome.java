import java.util.*;
class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,t;  
int temp;
temp=Integer.parseInt(args[0]);
  if(args.length==0){
System.out.println("A Number as an argument");  
  }
else{
 
  t=Integer.parseInt(args[0]);    
  while (t>0) {    
   r=t%10;
   sum=(sum*10)+r;    
   t=t/10;    
  }
}  
  if(temp==sum)    
   System.out.println(Integer.parseInt(args[0])+"palindrome number ");    
  else    
   System.out.println(Integer.parseInt(args[0])+"not palindrome");    
}  
}  

