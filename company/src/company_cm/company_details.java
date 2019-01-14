package company_cm;

import java.util.*;



public class Company_details {

	ArrayList<Company> comp = new ArrayList<>();



	public static void main(String args[]) {

		Company c1 = new Company("a", "city1", "state1");

		Company_details cd=new Company_details();

		c1.addEmp();

		c1.getEmp();

		c1.dispSortedEmp();

		cd.findComp("city1");



	}


//Find companies 
	public void findComp(String city_name) {

		int count = 0;

		System.out.println();
		comp.add(new Company("a", "city1", "state1"));

		comp.add(new Company("b", "city1", "state3"));

		comp.add(new Company("c", "city2", "state2"));

		comp.add(new Company("d", "city2", "state4"));

		comp.add(new Company("e", "city3", "state5"));

		comp.add(new Company("g", "city2", "state6"));

		comp.add(new Company("h", "city1", "state7"));



		Iterator<Company> itr = comp.iterator();

		while (itr.hasNext()) {

			Company c = itr.next();

			int flag = city_name.compareTo(c.address.city);

			if (flag == 0) {

				count++;

				System.out.println("Company:" + c.name + " city: " + c.address.city);

			}
		}
		

	}

}
