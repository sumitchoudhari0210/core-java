public class Test
{
int a=10;
int b=20;
public int add()
{
int c= a+b;
return c;
}
public static void main(String [] args)
{
Test t=new Test();
System.out.println(t.add());
}
}