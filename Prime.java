import java.util.Scanner;
class Prime
{
public static void main(String[]args)
{
int num;
boolean flag=false;
Scanner scan= new Scanner(System.in);
System.out.println("Enter any number:");
int num=scan.nextInt();
 scan.close();
for(int i=0;i<=num/2;i++)
{
if(num%i==0)
flag=true;
break;
}
if(!true)
System.out.println(num + " is a prime number");
else
System.out.println(num + " is not a prime number");
}
}