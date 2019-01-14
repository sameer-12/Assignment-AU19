package company_cm;
import java.io.*;
public class Company {
	String name;

	Address address;

	TreeSet<Employee> emp;

	Company(String name, String city, String state) {

		address = new Address(city, state);

		this.name = name;

		emp = new TreeSet<>();

	}



	public void addEmp() {

		emp.add(new Employee(45, "ram", 20));

		emp.add(new Employee(46, "sameer", 30));

		emp.add(new Employee(47, "ramesh", 29));

		emp.add(new Employee(48, "moody", 43));

		emp.add(new Employee(49, "sandy", 24));

		emp.add(new Employee(50, "sham", 34));

		emp.add(new Employee(51, "varun", 36));

		emp.add(new Employee(52, "shan", 50));

		emp.add(new Employee(53, "sam", 26));

		emp.add(new Employee(54, "kamal", 25));

	}



	public void getEmp() {

		System.out.println();

		System.out.println("age is less than 30");

		Iterator<Employee> itr = emp.iterator();

		while (itr.hasNext()) {

			Employee e = itr.next();

			if (e.age < 30) {

				System.out.println("name: " + e.e_name + " age: " + e.age + " ");

			}

		}

	}



	public void dispSortedEmp() {

		Iterator<Employee> itr = emp.iterator();

		System.out.println();

		System.out.println("Sorted Employees");

		while (itr.hasNext()) {

			Employee e = itr.next();

			System.out.println("name:" + e.e_name + " age:" + e.age + "");

		}

	}

}
	


