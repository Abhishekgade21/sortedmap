class Airtmetic{

	int Num1=20,Num2=10,Ans=0;


	void Add(){
		
		Ans=Num1+Num2;
		System.out.println("Addition of" + Num1 + "and" +  Num2 + "is equal to:-" + Ans);
	}


	
	void Sub(){
		
		Ans=Num1-Num2;
		System.out.println("Subtraction of" + Num1 + "and" + Num2 + "is equal to:-" + Ans);
	}

	void Mul(){
		
		Ans=Num1*Num2;
		System.out.println("Multiplication of" + Num1 + "and" + Num2 + "is equal to:-" + Ans);
	}

	void Div(){
		
		Ans=Num1/Num2;
		System.out.println("Division of" + Num1 + "and" + Num2 + "is equal to:-" + Ans);
	}

	void Mod(){
		
		Ans=Num1%Num2;
		System.out.println("Modulo of" + Num1 + "and" + Num2 + "is equal to:-" + Ans);
	}


	public static void main(String[] args){

		Airtmetic obj = new Airtmetic();


		obj.Add();
		obj.Sub();
		obj.Mul();
		obj.Div();
		obj.Mod();

	}
}
