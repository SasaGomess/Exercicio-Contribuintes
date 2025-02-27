package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("AMOOOO O CARLOS <3 ");

		System.out.print("Enter the number of tax payers: ");
		Integer n = sc.nextInt();

		List<TaxPayers> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("---------------------------");
			System.out.println("Tax payer #" + i + " data: ");
			System.out.println("---------------------------");
			System.out.println();
			System.out.print("Individual or company (i / c)? ");
			char resp = sc.next().charAt(0);
			System.out.println();

			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			Double salary = sc.nextDouble();

			if (resp == 'i') {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();

				list.add(new Individual(name, salary, health));
			} else if (resp == 'c') {
				System.out.print("Number of employees: ");

				Integer employees = sc.nextInt();

				list.add(new Company(name, salary, employees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		System.out.println("-------------------<3--------------------");
		for (TaxPayers c : list) {
		
			System.out.println(c.getName() + ": $ " + String.format("%.2f", c.taxesPaid()));
		}

		Double som = 0.0;
		for (TaxPayers c : list) {

			som += c.taxesPaid();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $" + som);
		sc.close();
	}

}
