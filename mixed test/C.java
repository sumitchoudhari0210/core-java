public class C
{
int x=100;
int y=50;
public void add()
{
int c=x+y;
System.out.println(c);
}
public void sub(int x, int y)
{
int c=x-y;
System.out.println(c);
}
public int mult()
{
int c=x*y;
return c;
}
public int div(int x, int y)
{
int c=x/y;
return c;
}
public static void main(String[] args)
{
C c=new C();
c.add();
c.sub(100,50);
System.out.println(c.mult());
System.out.println(c.div(100,50));
}
}