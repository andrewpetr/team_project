package team3;

public class Employee {
	String name;
	String lastname;
	String position;
	String phone;
	int salary;
	String id;

	public Employee() {
		int salaryConvertedToInteger = Integer.parseInt(String.valueOf(salary));
		this.name = name;
		this.lastname = lastname;
		this.position = position;
		this.salary = salaryConvertedToInteger;
		this.phone = phone;
		this.id=id;

	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
		return this.name + " " + this.lastname + " -- Position: " + this.position + " -- Salary: " + this.salary
				+ " --Phone: " + this.phone;
	}

}
