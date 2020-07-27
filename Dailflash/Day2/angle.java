class Triangle{

	static void Angle(int x){

		if(x<90){
			System.out.println("Angle is acute angle and Degree of Angle is: " + x);
		}
		else if(x==90){

			System.out.println("Angle is right angle and Degree of Angle is: " + x);
		}
		else{

			System.out.println("Angle is obtuse angle and Degree of Angle is: " + x);
		}

	}
	public static void main(String[] args){

		Angle(20);
		Angle(150);
	}

}
/* output and Explanation

java@carpediem-abhi21:~/Desktop/Dailflash/Day2$ java Triangle

Angle is acute angle and Degree of Angle is: 20
Angle is obtuse angle and Degree of Angle is: 150

here we write a func Angle which check the degree and give desired result
*/

