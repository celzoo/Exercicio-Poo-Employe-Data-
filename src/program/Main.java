package program;
import java.util.Scanner;

import entitiy.Employe;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		double salary,tax,percentage;
		System.out.print("Name:");
		name = sc.next();
		System.out.print("Salary:");
		salary = sc.nextDouble();
		System.out.print("Tax:");
		tax = sc.nextDouble();
		Employe employe = new Employe(name, salary, tax);
		System.out.println();
		System.out.println(employe);
		System.out.print("Wich percentage you wish to increase the salary of the employe " + employe.getName() + ":");
		percentage = sc.nextDouble();
		employe.newSalary(percentage);
		System.out.println(employe);
		
		

	}

}
