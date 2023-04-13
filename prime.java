import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();

System.out.println((n%2!=0)?"no. is prime":"no. is not prime");
}}