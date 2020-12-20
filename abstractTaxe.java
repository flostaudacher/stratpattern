package strategyPattern;

public abstract class abstractTaxe {
	taxes taxPercentage = new tax20percent();

	public void setTax(taxes taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public double tax(){
		return taxPercentage.tax();
	}
}
