class Odd_Even{

	static void Even_Odd(int num){

		if(num%2==0){			// checking the condition wheather no is odd or even (10%2==0) which is true so it will execut

			System.out.println("The number is even number and it is"+ num);
		}
		else{

			System.out.println("The number is odd number and it is"+ num);
		}
	}

	public static void main(String[] args){

		Even_Odd(10);
		Even_Odd(13);
	}


/* output and Explanation
 
java@carpediem-abhi21:~/Desktop/Dailflash/Day2$ java Odd_Even 
The number is even number and it is 10
The number is odd number and it is 13

we are passing 10 and 13
it will be stored in num the condition in if will check according to that we get result.
*/
