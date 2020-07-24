class Instagram{
	
	void Following(){

		int No_Of_Following=180;
	}
	 static void Followers(Instagram ans){
		
	
		
		String res;
		res = (ans instanceof Instagram)?"yes it is instace of instagram": "No it is not part";
		System.out.println(res);
	}	
}








class Facebook{
	
	public static void main(String[] args){
	
		Instagram Reels = new Instagram();
		Instagram obj = null;
		Instagram.Followers(Reels);// passing object which is instance  of insta
		
		Instagram.Followers(obj); // which is not instance
	}
}
