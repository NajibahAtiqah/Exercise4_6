package Exrcs4_6;

class DiscountApple implements Discount { 
	public double DiscountRate(){
		return 0.10;
		}    
}

class DiscountBerry implements Discount {
	public double DiscountRate(){
		return 0.20;
		}  	  
}

class DiscountGrannySmith implements Discount{
	public double DiscountRate() {
		return 0.30;
	}
}
