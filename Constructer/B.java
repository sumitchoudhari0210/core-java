 public class B
{
int c;
public B()
{

c=1;

System.out.println("Determine Variables");
}
public void add()
{

System.out.println(c);
}
public static void main (String args[])
{
System.out.println("main start");
B b=new B();
b.add();
System.out.println("main end");
}
}