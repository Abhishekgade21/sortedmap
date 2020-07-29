

class If_Demo{

	public static void main(String[] args) {
		
		int Age = 20;

		if(Age > 18){							// here we check the condition
			
			System.out.println("You are eliglble to vote.");
		}
		
		If_Demo obj = new If_Demo();					// creating the object
		obj.If_Else();							// calling the method

	}

	void If_Else(){								// here we write ifelse method

		int Num = 13;							//	declare a variable.

		if( Num % 2 == 0){			// check the condition true then go inside otherwisw execute the else part.

			System.out.println("Given number is even number.");
		}
		else{

			System.out.println("Number is odd Number.");
		}

	 	 int year=2020;    
   	
		 if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
       	
			 System.out.println("it is a leap year");  
  
	       	 }  
 
	      	 else{  
       
			 System.out.println("Common year"); 
		 }
	}
}
