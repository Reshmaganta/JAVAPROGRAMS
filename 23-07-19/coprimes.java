public class coprimes
{
public static void main(String[] args)
{
int a=4,b=6,r;
r=a%b;
while(r!=0)
{
a=b;
b=r;
r=a%b;
}
if (b==1)
{
System.out.println("coprimes");
}
else
{
System.out.println(" not coprimes");
}
}
}