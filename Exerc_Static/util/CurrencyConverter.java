package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double priceDollar, double buyDollar) {
		return priceDollar * buyDollar * (1.0 + IOF);
	}

}
