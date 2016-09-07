import java.util.*;
class Power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
while(num%2==0)
{
num=num/2;
}
if(num==1)
{
System.out.println("it is power of 2");
}
else
{
System.out.println("it is not power of 2");
}}}

