class test
{
int a;
test()
{
System.out.println(a);
}
void display(int a)
{
System.out.println(a);
}
}
class test_pro
{
public static void main(String arg[])
{
test ob=new test();
ob.display(10);
}
}