import java.util.Scanner;
class armstrong{
public static void main(String args[])
{
int num, r,ans=0,n;
Scanner Sc=new Scanner(System.in);
System.out.println("enter the number");
num= Sc.nextInt();
n=num;
	while(n>0){
	
		r=n%10;
		ans=ans+(r*r*r);
		n=n/10;
			}
			
System.out.println((ans==num)?"the number is armstrong":"the number is not armstrong");
}}