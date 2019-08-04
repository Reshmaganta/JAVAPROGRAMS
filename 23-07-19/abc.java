class test
{
static int a=10;
static int b;
static void print()
{
System.out.println(a);
System.out.println(b);
}
static 
{
System.out.println("static");
b=a*20;
}
public static void main(String[] args)
{
System.out.println("main");
print();
}
}