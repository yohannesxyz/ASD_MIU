package without.templatemethod;

public class CurrencyConverter {
	public double convertToDollars(double amount, String currency) {
		System.out.println("Convert "+amount+" "+currency+" to US dollars");
		if (currency.contentEquals("EUR")) {
			return amount * 1.1;
		}
		else if (currency.contentEquals("INR")) {
			return amount * 0.014;
		}
		else if (currency.contentEquals("USD")) {
			return amount;
		}
        else {
			return 0.00;
		}
	}

}
