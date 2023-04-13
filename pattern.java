import java.util.Scanner;
class pattern{
public static void main(String args[])
{
int a,i;
Scanner sc= new Scanner(System.in);
System.out.println("enter first number");
a=sc.nextInt();
for( i=1;i<=10;i++)
System.out.println(a+"*+"+i+"="+a*i);

}}