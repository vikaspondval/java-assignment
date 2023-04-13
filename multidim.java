import java.util.Scanner;
class multidim{
public static void main(String args[])
{
int x,y,z;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the block");
ar=sc.nextInt();

System.out.println("Enter the row");
y=sc.nextInt();

System.out.println("Enter the column");
z=sc.nextInt();

int[][][]a=new int[x][y][z];

int i, j,k;
System.out.println("Enter the elements");
for(i=0;i<x;i++)
{
for(j=0;j<y;j++)
{
for(k=0;k<z;k++)
{

a[x][y][z]=sc.nextInt();
}}}
System.out.println("matrix a & b");

for(i=0;i<x;i++)
{
for(j=0;j<y;j++)
{
for(k=0;k<z;k++)
{
System.out.print(a[x][y][z]+" ");
}
System.out.println();
}
System.out.println();
}}}