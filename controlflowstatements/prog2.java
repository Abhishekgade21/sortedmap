class Demo{
	// this is the example else if else if ladder:
	
	public static void main(String[] args){

		//int x = 25;
		//int x = 100;
		int x = -30;
		
		if(x>=0 && x<=10){		// in this 1 value is true and another is false: => this false in and

			System.out.println("Number between 0 and 10");
		}else if(x>=10 && x<=20){
			
			System.out.println("Number between 10 and 20");
		}else if(x>=20 && x<=30){
			
			System.out.println("Number between 20 and 30");
		}else if( x>=30){
			
			System.out.println("Number greater than 30");
		}else{
			
			System.out.println("invalid number");
		}
	}
}
