package strategyPattern;

public class nahrungsmittel extends abstractTaxe{
	public nahrungsmittel() {
		setTax(new tax10percent());
	}
}
