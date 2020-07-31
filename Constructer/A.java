public class A
{
byte a;
short b;
int c;
long d;
float e;
double f;
boolean g;
char h;
public A()
{
System.out.println("Determine Variables");
}
public void add()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
}
public static void main (String args[])
{
System.out.println("main start");
A a=new A();
a.add();
System.out.println("main end");
}
}