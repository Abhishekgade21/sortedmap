class Dominos{

	int Price;			//Instance variable
	int Quantity;

	static int Total=0;			//Static variable

	static void  Bill(){

		System.out.println("the Total cost of your order bill is :-" + Total);


	}

	public static void main(String[] args){

		Dominos Pizza = new Dominos();
		Dominos Fries = new Dominos();
		
		Pizza.Price = 210;		// asigining the values to instance variable
		Pizza.Quantity = 3;

		Fries.Price = 140;
		Fries.Quantity = 4;

		Total=((Pizza.Price*Pizza.Quantity) +(Fries.Price*Fries.Quantity));	// calculating the total cost of bill
		Bill();

	}
}
