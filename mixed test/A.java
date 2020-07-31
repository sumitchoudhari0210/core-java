public class A
{
int a=10;
int b=20;
public void add()
{
int c=a+b;
System.out.println(c);
}
public void sub(int x, int y)
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
public static void main(String [] args)
{
A a=new A();
a.add();
a.sub(6,5);
System.out.println(a.div(8,8));
System.out.println(a.mult());
}
}