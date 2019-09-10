package CollectionsExample;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeeHashMap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(25, "saumya", "Finance");
		Employee e2=new Employee(25, "ps", "Devops");
		Employee e3=new Employee(28,"sammy","Manager");
		
		HashMap<Integer, Employee> hme=new HashMap<Integer, Employee>();
		hme.put(1, e1);
		hme.put(2, e2);
		hme.put(3, e3);
		if(hme.containsValue(e1)) {
			System.out.println("value found");
		}
		for(Entry<Integer,Employee> e:hme.entrySet()) {
			
			int key=e.getKey();
			Employee value=e.getValue();
			
			System.out.println("Employee "+key+"==>"+value.age+"||"+value.name+"||"+value.dept);
		}
		
		System.out.println("hash code value of hash map"+hme.hashCode());
	}

}
