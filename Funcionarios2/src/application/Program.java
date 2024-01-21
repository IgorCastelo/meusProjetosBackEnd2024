package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enttities.Employee;
import enttities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.print("Enter the name of employees: ");
		int employees = sc.nextInt();
		
		for(int i=1; i<=employees; i++) {
			System.out.println("Employee #" + i +  " data: ");
			System.out.println("Outsourced(y/n)?");
			char ch =sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.println("Adittional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() +  " - $ " + String.format("%.2f", emp.payment()));
		}
			sc.close();
			
			
		}

	}


