public class B
{
int a=30;
int b=40;
public void add()
{
int c=a+b;
System.out.println(c);
}
public void sub(int a, int b)
{
int c=a-b;
System.out.println(c);
}
public int mult()
{
int c=a*b;
return c;
}
public int div(int x, int y)
{
int c=a/b;
return c;
}
public static void main(String[] args)
{
B b=new B();
b.add();
b.sub(30,40);
System.out.println(b.mult());
System.out.println(b.div(40,10));
}
}