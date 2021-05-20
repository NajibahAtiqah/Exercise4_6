package Exrcs4_6;

public abstract class Fruit {
	//define super class as abstract class. This is bcs we don't need to create instance of fruit.
		//Class which declare as abstract cannot create instance object
		
		private String name;
		
		public Fruit(String name) {
			this.name = name;
		}
		
		//declare method that has no implementation
		//only subclass know how to implement the method
	//	public abstract double totalPrice(); //define method as abstract, only have heading with no body, use semi colon.

		
}
