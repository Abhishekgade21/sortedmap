class Human{

	public static void main(String[] args){

		Human lion = null;
		Human tiger = null;
		Human puma = null;
		Human monkey = new Human();

		boolean isLionHuman = lion instanceof Human;

		System.out.println("Are lion and human of same species-->"+ isLionHuman);

		boolean isTigerHuman = tiger instanceof Human;

		System.out.println("Are tiger and human of same species-->"+ isTigerHuman);

		boolean isPumaHuman = puma instanceof Human;

		System.out.println("Are puma and human of same species-->"+ isPumaHuman);

		boolean isMonkeyHuman = monkey instanceof Human;

		System.out.println("Are monkey and human of same species-->"+ isMonkeyHuman);

	}
}
//Output and Explanation
/*java@carpediem-abhi21:~/Desktop/Dailflash/Day1$ java Human 
Are lion and human of same species-->false
Are tiger and human of same species-->false
Are puma and human of same species-->false
Are monkey and human of same species-->true

when we are using instance of operator then it search for the object we should provide it directly or in indirectly method
we should provide refrence or object to it
in 1st 3 cases we create object but we have not allocated memory to it.*/
