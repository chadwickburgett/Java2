package model;

public class Employee {
	private String name;
	private double monthlySalary;
	private int age;
	
	public Employee() {
		super();
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int mS) {
		this.monthlySalary = mS;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String printInfo() {
		return (name + " age " + age + " with a monthly salary of $" + monthlySalary);
	}
}
