package Exrcs4_6;

public class Main {

	public static void main(String[] args) {
		System.out.println(">>>>>> APPLE <<<<<<");
		Apple A = new Apple("Apple", 3.5, 10); //Name, Price, Quantity
		System.out.println();
		
		
		System.out.println(">>>>>> GRANNY SMITH <<<<<<");
		GrannySmith GS = new GrannySmith("Granny Smith", 2.5, 20, "Green", "Australia");//Name, Price, Quantity, Origin, Colour
		System.out.println("Origin: "+GS.getOrigin());
		System.out.println("Color: "+GS.getColour());
		System.out.println();

		
		System.out.println(">>>>>> BERRY <<<<<<");
		Berry B = new Berry("Berry", 3, 20, 200,'S');	//Name, Price, Quantity, Weight, Size
		System.out.println("Weight: "+B.getWeight()+" GRAMS");
		System.out.println("Size: "+B.getSize());
		System.out.println();

		
		System.out.println(">>>>>> GRAPE <<<<<<");
		Grape G = new Grape("Grape",15.50,30);	//Name, Price, Weight
		System.out.println();
		

	}
	}
