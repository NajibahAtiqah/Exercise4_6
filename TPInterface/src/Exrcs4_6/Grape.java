package Exrcs4_6;

public class Grape extends Fruit {
	private double price;
	private double weight;
	
	public Grape (String name, double p, double w) {
		super(name);
		price = p;
		weight = w;
		
		if(weight <= 0.5) {
			TotalPrice G = new GrapeTotalPrice();
			
			System.out.println("Fruit: " + name);
			System.out.println("Weight: " + weight + " KG");
			System.out.println("Price to Paid: RM " + G.getTotalPrice(price,weight));
			
		}
		else if(weight > 0.5 && weight <= 1.0) {
			TotalPrice G = new GrapeTotalPrice();
			
			System.out.println("Type: "+ name);
			System.out.println("Taste: "+ taste());
			System.out.println("Weight: "+ weight +" KG");
			System.out.println("Price to Paid: RM " + G.getTotalPrice(weight));
			
		}
		else {
			TotalPrice G = new GrapeTotalPrice();
			double tax = 0.15;
			double price = 10;
				
			System.out.println("Fruit: " +  name);
			System.out.println("Taste: " + taste());
			System.out.println("Weight: " + weight + " KG");
			System.out.println("Total Tax: " + tax*100 + " %");
			System.out.println("Price to Paid: RM "+ G.getTotalPrice(price, weight, tax));
		}
		
	}


	public String taste() {

		return "Sour";
	}

}
