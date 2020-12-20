package strategyPattern;

public class kapitalertragsSteuer extends abstractTaxe{
	public kapitalertragsSteuer () {
		setTax(new tax275percent());
	}
}
