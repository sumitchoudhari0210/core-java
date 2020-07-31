
public class Test 
{
	public Employee x1() {
	Employee Naresh= new Employee();
	Naresh.Eid=123;
	Naresh.Name= "Naresh.K";
	Naresh.Salary= 50000;
	Naresh.Address= "301 jai umiya";
	return Naresh;
	}
	public static void main(String[] args) {
		Test t= new Test();
		Employee emt=t.x1();
		
		System.out.println(emt.Eid);
		System.out.println(emt.Name);
		System.out.println(emt.Salary);
		System.out.println(emt.Address);
	}
	
	

}
