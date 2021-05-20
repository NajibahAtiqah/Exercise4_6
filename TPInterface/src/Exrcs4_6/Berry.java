package Exrcs4_6;

public class Berry extends Apple {
	private int weight;
	private char size;
	
	public Berry(String name, double p, int q, int w, char s) {
		super(name,p,q);
		weight = w;
		size = s;
	}
	
	public char getSize() {
		return size;
	}
	
	public int getWeight() {
		return weight;
	}

}
