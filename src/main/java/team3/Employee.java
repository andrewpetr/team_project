package team3;

public class Employee {
	String name;
	String position;
	int salary;
	
	public Employee(String n, String p, String s) {
		int numsConverted = Integer.parseInt(s);
		this.name = n;
		this.position = p;
		this.salary = numsConverted;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Name: " + this.name + " -- Position: " + this.position + " -- Salary: " + this.salary;
	}

}
