import java.util.Scanner;
class factorial{
public static void main(String args[])
{
int i, x,f=1;
Scanner fact=new Scanner(System.in);
System.out.println("enter the number");
x=fact.nextInt();
for(i=x;i>=1;i--)

f=f*i;

System.out.println("the factorial of given number is="+f);
}}