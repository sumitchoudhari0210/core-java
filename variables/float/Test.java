public class Test 
{
float a=56.563f;
float b=23.1254837f;
float c=9.2538f;
public void o1()
{
float d=a*c/b;
System.out.println("a*c/b="+d);
}
public static void main (String [] args)
{
Test t=new Test();
t.o1();
}
}