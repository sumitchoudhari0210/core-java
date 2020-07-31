package com.cjc.karvenagar;
import com.cjc.acurdi.B;
public class A
{
public void m1()
{
System.out.println("m1---A");
}
public static void main (String args[])
{
A a = new A();
a.m1();
B b = new B();
b.m2();
}
}