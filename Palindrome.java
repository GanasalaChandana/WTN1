import java.util.Scanner;
class Palindrome
{
public static void main(String[]args)
{
String s,rev="";
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
s=sc.nextLine();
int length=s.length();
for(int i=length-1;i>=0;i--)
rev=rev+s.charAt(i);
if(s.equals(rev))
System.out.println("number is a palindrome");
else
System.out.println("number is not a palindrome");
}
}