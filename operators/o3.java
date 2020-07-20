class Pre_Post{

	int a = 10;
	int b = 20;
	int c = 50;
	
       	

// 1 scene
	void Fun(){
	
		int ans=(a++ + ++b + ++c);	//10+21+51=82
		System.out.println("The value of Ans is : " + ans);
	}
//2nd
	void Fun2(){

		int ans= (--a + ++b + c--);	//9+21+50=80
		System.out.println("The value of Ans is : " + ans);
	}
//3rd
	void Fun3(){

		int ans= (a++ + --b + c--);	//10+19+50=79
		System.out.println("The value of Ans is : " + ans);
	}

	public static void main(String[] args){

		Pre_Post obj = new Pre_Post();
		Pre_Post obj1 = new Pre_Post();
		Pre_Post obj2 = new Pre_Post();
		obj.Fun();
		obj1.Fun2();
		obj2.Fun3();


	}
}
