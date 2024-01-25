package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payer: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Tax payer #"+ i+ " data:");
			System.out.println("Individual or company(i/c)?");
			char type = sc.next().charAt(0);
			System.out.println("Name:");
			sc.next();
			String name = sc.nextLine();
			System.out.println("Anual income:");
			double anualIncome = sc.nextDouble();
			if(type=='i') {
				System.out.println("health expenditures");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome,healthExpenditures ));
			}else {
				System.out.println("Number of emplyees:");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome,numberOfEmployees));
			}
			System.out.println("TAXES PAID:");
			double sum = 0.0;
			for(TaxPayer payer:list) {
				System.out.println(payer.getName() + ": " +String.format("%.2f", payer.tax()));
				sum+=payer.tax();
			}
			System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		}
	}
}
