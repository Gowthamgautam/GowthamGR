import java.util.*;
class primeno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
for(i=2;i<=n/2;i++)
{
if(n%2==0)
break;
else
continue;
}
if(n/2+1==i)
{
System.out.println("It is prime");
}
else
{
System.out.println("not a prime");
}
}
}