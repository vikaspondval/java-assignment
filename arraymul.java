import java.util.Scanner;

class array{

public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);

System.out.println("enter row");
 n=sc.nextInt();
System.out.println("enter colunm");
n=sc.nextInt();
int[][]a= new int[n][n];
int[][]b= new int[n][n];
int[][]d= new int[n][n];
int i,j,k,sum;

System.out.println("Enter the elements of array a");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}}
System.out.println("Matrix a");

for(i=0;i<n;i++)

{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println();
}
System.out.println("Enter the elements of array b");
for(i=0;i<n;i++)

{
for(j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
}}
System.out.println("Matrix b");

for(i=0;i<n;i++)

{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+" ");

}
System.out.println();
}

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
sum=0;
for(k=0;k<n;k++)
{
	sum=sum+a[i][k]*b[k][j];
		
		d[i][j]=sum;
}
}}
System.out.println("The matrix after multiplying array a & b");
for(i=0;i<n;i++)

{
for(j=0;j<n;j++)
{
System.out.print(d[i][j]+" ");

}
System.out.println();
}

}}




