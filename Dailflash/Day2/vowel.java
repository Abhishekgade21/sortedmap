class Vowels{

	static void Check(char x){		


		if(x=='a'|| x=='A'|| x=='e'|| x=='E'|| x=='i'|| x=='I' || x=='o' || x=='O' || x=='u' || x='U'){
	

			System.out.println(x +" is Vowel");
		}		
		else{

			System.out.println(x +" is Constant.");
		}

	}
	public static void main(String[] args){

		Check('X'); // calling the func
		Check('a');
	}

}
/* output and Explanation


java@carpediem-abhi21:~/Desktop/Dailflash/Day2$ java Compare
40 is greater than 20


here we write a func Great which check the greater number and give desired result
*/

