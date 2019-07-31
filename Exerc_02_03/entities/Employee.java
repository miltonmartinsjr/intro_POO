package entities;

public class Employee {
	
	public String name;
	public Double grossSalary;
	public Double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		percentage = (grossSalary / 100.0) * percentage;
		grossSalary = grossSalary + percentage;
	}
	
	public String toString() {
		return name
				+", $ "
				+ String.format("%.2f", netSalary());
	}

}
