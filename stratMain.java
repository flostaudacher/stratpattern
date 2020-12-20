package strategyPattern;

public class stratMain {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		nahrungsmittel wasser = new nahrungsmittel();
		System.out.println("Nahrungsmittel werden mit " + wasser.tax() + "versteuert");
		
		kapitalertragsSteuer aktienauszahlung = new kapitalertragsSteuer();
		System.out.println("Kapitalerträge werden mit " + aktienauszahlung.tax() + "versteuert");
		
		gegenstand fernsehr = new gegenstand();
		System.out.println("Gegenstände werden mit " + fernsehr.tax() + "versteuert");
	}

}
