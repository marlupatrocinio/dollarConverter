package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter currency = new CurrencyConverter();
		
		System.out.println("What is the dollar price?");
		currency.dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		currency.dollarBought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f%n", currency.amountPaid());
		
		
		
		sc.close();
	}

}
