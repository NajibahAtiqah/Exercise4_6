package Exrcs4_6;

public class Apple extends Fruit{
	protected double price;
	protected int quantity;
	protected double discount;
	
	public Apple(String name, double p, int q) {
		super(name);
		price = p;
		quantity = q;
		
		if(quantity <= 3) {
			TotalPrice A = new AppleTotalPrice();
			
			System.out.println("Fruit: "+name);
			System.out.println("Quantity: "+quantity);
			System.out.println("Price to paid: RM "+A.getTotalPrice(price, quantity));
		}
		else if(quantity > 3 && quantity <= 10) {
			TotalPrice A= new AppleTotalPrice();
	
			System.out.println("Fruit: "+name);
			System.out.println("Quantity (units): "+quantity);
			System.out.println("Price to paid: RM "+A.getTotalPrice(quantity));
		}
		else {
			double price = 5.5;
			TotalPrice A = new AppleTotalPrice();
			
			if(name.equals("Apple")) {
				Discount aa = new DiscountApple();
				discount = aa.DiscountRate();
			}
			else if(name.equals("Berry")) {
				Discount bb = new DiscountBerry();
				discount = bb.DiscountRate();
			}
			else if(name.equals("Granny Smith")) {
				Discount cc = new DiscountGrannySmith();
				discount = cc.DiscountRate();
			}					
				
			System.out.println("Fruit: "+name);
			System.out.println("Quantity (units): "+quantity);
			System.out.println("Discount Received: "+discount*100+" %");
			System.out.println("Price to Paid: RM "+A.getTotalPrice(price, quantity,discount));
		}
	}
}
