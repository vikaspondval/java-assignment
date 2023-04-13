import java.util.Scanner;

class voting
{
public static void main(String args[])
{
int age;
char ch;
Scanner sc= new Scanner(System.in);
System.out.println("enter your age");
 age=sc.nextInt();
System.out.println((age<18)?"You are not eligible for voting":"You are eligible for voting");

}}

