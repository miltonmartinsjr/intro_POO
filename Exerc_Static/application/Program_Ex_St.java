package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program_Ex_St {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double buyDollar = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(priceDollar, buyDollar);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		
		sc.close();
	}

}
