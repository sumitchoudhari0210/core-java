package departmentEmployee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
public static void main(String[] args) {
		
		Employee e1 = new Employee(1009, "Girish", 90000.00 );
		Employee e2 = new Employee(2009, "Satish", 30000.00);
		Employee e3 = new Employee(3009, "Akash", 50000.00);
		Employee e4 = new Employee(4009, "Sumit", 70000.00);
		Employee e5 = new Employee(5009, "Rukesh", 80000.00);
		
		Department d1 = new Department(10001, "IT", "Boston");
		Department d2 = new Department(10002, "Finance", "Chennai");
		
		Map<Employee,Department> empDeptMap = new HashMap<>();
		
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d1);
		empDeptMap.put(e3, d1);
		
		empDeptMap.put(e4, d2);
		empDeptMap.put(e5, d2);
		
		Set<Entry<Employee, Department>> entrySet = empDeptMap.entrySet();
		for (Entry<Employee, Department> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
		}
		
		/*System.out.println("--------------------------------------------");
		
		Set<Employee> keys = empDeptMap.keySet();
		for (Employee key : keys) {
			System.out.println(key);
			Department value = empDeptMap.get(key);
			System.out.println(value);*/
			
		}
		
		
}
		
		
		
		
		
		
		
		
		
	


