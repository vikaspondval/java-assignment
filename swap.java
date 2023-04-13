class swap 
{
int a=5, b=9;
public static void main(String args[])
{
swap s=new swap();
s.a=s.a+s.b;
s.b=s.a-s.b;
s.a=s.a-s.b;
System.out.println("value of a after swap=" +s.a);
System.out.println("value of b after swap=" +s.b);

}}