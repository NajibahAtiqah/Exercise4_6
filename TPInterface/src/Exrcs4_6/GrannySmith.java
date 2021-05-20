package Exrcs4_6;

public class GrannySmith extends Apple {
	private String origin;
	private String colour;
	
	public GrannySmith(String name, double p, int q,String c, String o) {
		super(name, p, q);
		origin = o;
		colour = c;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public String getColour() {
		return colour;
	}

}
