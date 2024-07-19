package entities;

public class Employee {
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void tax() {
		salary -= 10;
	}
	
	
}
