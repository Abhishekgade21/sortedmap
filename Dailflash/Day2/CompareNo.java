class Compare{

	static void Great(int x,int y){		// x=20 , y=40


		if(x>=y){			//20>=40 fasle jump to else and print
	

			System.out.println(x +" is greater than " + y);
		}		
		else{

			System.out.println(y +" is greater than " + x);
		}

	}
	public static void main(String[] args){

		Great(20,40); // calling the func
		
	}

}
/* output and Explanation


java@carpediem-abhi21:~/Desktop/Dailflash/Day2$ java Compare
40 is greater than 20


here we write a func Great which check the greater number and give desired result
*/

