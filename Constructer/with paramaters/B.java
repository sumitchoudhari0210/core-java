public class B
{
int x;
int y;
public B(int a, int b)
{
x=a;
y=b;
}
public void w1()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String args[])
{
B b=new B(10,20);
b.w1();
}
}
