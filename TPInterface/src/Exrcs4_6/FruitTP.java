package Exrcs4_6;

class AppleTotalPrice implements TotalPrice {
	
	public double getTotalPrice(double quantity) {
		double price = 3.5;
		return price*quantity;
	}

	public double getTotalPrice(double price, double quantity) {
		return price*quantity;
	}

	public double getTotalPrice(double price, double quantity, double discount) {
		return  (price*quantity) * (1-discount);
	}
}


class GrapeTotalPrice implements TotalPrice{
	
	public double getTotalPrice(double weight) {
		double price = 8;
		return price*weight;
	}
	
	public double getTotalPrice(double price, double weight) {
		return price*weight;
	}

	public double getTotalPrice(double price, double weight, double tax) {
		return  (price*weight) * (1+tax);
	}
}
