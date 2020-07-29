class Switch_Demo{

	public static void main(String[] args){

	//	int var = 10;
		int var = 5;		
	//	int var = 12;
		System.out.println("Before switch");



		switch(var){

/*			default :	
				System.out.println("In default");

				break;*/
		
			case 1 :					// this is label

				System.out.println("One");
				break;

			case 2 :					// this is label

				System.out.println("Two");
				break;

			case 3 :					// this is label

				System.out.println("Three");
				break;

			case 4 :					// this is label

				System.out.println("Four");
				break;
			case 5 :					// this is label

				System.out.println("Five");
				break;
			case 6 :					// this is label

				System.out.println("Six");
			
				break;
			case 7 :					// this is label

				System.out.println("Seven");
				break;

			case 8 :					// this is label

				System.out.println("Eight");
				break;

			case 9 :					// this is label

				System.out.println("Nine");
				break;
			case 10 :					// this is label

				System.out.println("Ten");
				break;
			default :	
				System.out.println("In default");
				break;
		}
		
		System.out.println("After switch");
	}
}



/* if we dont give break then when we  give in between condition if it is true the all the below case statement will executed in
 * order to stop this we must include break in our statement.
 * output before break: 
Before switch
Five
Six
Seven
Eight
Nine
Ten
After switch

 *output after giving break

Before switch
Five
After switch

when we give break it will exit from the switch statement.

for multiple statement you can give the curly braces not compulsion.

if our case does not match then there is default statemnent in java and it will execute.
*/
