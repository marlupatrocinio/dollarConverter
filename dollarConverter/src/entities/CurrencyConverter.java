package entities;

public class CurrencyConverter {
	
	public double dollarPrice;
	public double dollarBought;

	
	public double iofValue() {
		return (dollarBought * dollarPrice) * 0.06;
	}
	
	public double amountPaid() {
		return (dollarBought * dollarPrice) + iofValue();
	}

}
