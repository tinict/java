package Tuan_03;

public class Test_Employee {

	public static void main(String[] args) {
		Employee test = new Employee(001, "Nguyen", "Tin", 1000);
		System.out.println(test.getAnnualSalary());
		System.out.println(test.raiseSalary(10));
		System.out.println(test.toString());
	}

}
