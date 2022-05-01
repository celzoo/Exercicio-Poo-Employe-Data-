package entitiy;

public class Employe {
	private String name;
	private double grossSalary;
	private double tax;
	private double liquidSalary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public Employe(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
		liquidSalary = grossSalary - tax;
	}
	
	
	public void newSalary( double percentage) {
		grossSalary += (grossSalary*percentage)/100;
		liquidSalary = grossSalary-tax;
		
	}
	
	public String toString() {
		return "Employe: " + name + ", " + liquidSalary;
	}
	
	
	

}
