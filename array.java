import java.util.Scanner;
class array{
public static void main(String args[])
{
int[][]a= new int[2][2];
int[][]b= new int[2][2];
int[][]c= new int[2][2];
int i,j;
Scanner sc = new Scanner(System.in);
System.out.println("enter the elements you wanna print");
for(i=0;i<=1;i++)
{
for(j=0;j<=1;j++)
{
a[i][j]=sc.nextInt();
}}
System.out.println("The elments of a:");

for(i=0;i<=1;i++)

{
for(j=0;j<=1;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println();
}

for(i=0;i<=1;i++)

{
for(j=0;j<=1;j++)
{
b[i][j]=sc.nextInt();
}}
System.out.println("The elments of b:");

for(i=0;i<=1;i++)

{
for(j=0;j<=1;j++)
{
System.out.print(b[i][j]+" ");

}
System.out.println();
}
for(i=0;i<=1;i++)

{
for(j=0;j<=1;j++)
{
c[i][j]= a[i][j]+b[i][j];
}}
for(i=0;i<=1;i++)

{
for(j=0;j<=1;j++)
{
System.out.print(c[i][j]+" ");

}
System.out.println();
}

}}

