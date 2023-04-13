import java.util.Scanner;
class switchvote{
public static void main(String args[])
{
int a,res;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age"); 
a=sc.nextInt();

if(a<18)
res=0;
else
res=1;

switch(res)
{

case 0:
System.out.println("you are not eligible for voting");
break;

case 1:
System.out.println("you are eligible for voting");
}}
}
