public class C{
 public static void main(String []args)
{
int no=321, sum=0;
while(no>0)
{
int rem = no % 10;
sum = (sum+rem);
no=no/10;
}
System.out.println(sum);
}
}