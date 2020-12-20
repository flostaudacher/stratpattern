package strategyPattern;

public class gegenstand extends abstractTaxe{
	public gegenstand() {
		setTax(new tax20percent());
	}
}
