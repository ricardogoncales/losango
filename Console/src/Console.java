public class Console {

	/*
	 ::::::::::::::::::::::#::::::::::::::::::::::
	 :::::::::::::::::::#######:::::::::::::::::::
	 ::::::::::::::::#############::::::::::::::::
	 :::::::::::::###################:::::::::::::
	 ::::::::::#########################::::::::::
	 :::::::::::::###################:::::::::::::
	 ::::::::::::::::#############::::::::::::::::
	 :::::::::::::::::::#######:::::::::::::::::::
	 ::::::::::::::::::::::#::::::::::::::::::::::
	 :::::::::::::::::::::::::::::::::::::::::::::
	 */	
	public static void main(String[] args) {
		int twoPoints = 22;
		int hashtag =1;
		
		for(int i=1 ; i < 5 ; i++, hashtag += 6, twoPoints -= + 3){
			printTwoPoints(twoPoints);
			printHastag(hashtag);
			printTwoPoints(twoPoints);
			System.out.println();
		}
		for(int j= 5 ; j > 0 ; j--, hashtag -= 6, twoPoints +=  3){
			printTwoPoints(twoPoints);
			printHastag(hashtag);
			printTwoPoints(twoPoints);
			System.out.println();
		}
		printTwoPoints(45);
	}
	
	private static void printHastag(int hashtag){
		for(int count = 1 ; count <= hashtag ; count++){
			System.out.print("#");
		}
	}
	
	private static void printTwoPoints(int twoPoints){
		for(int count = 1 ; count <= twoPoints ; count++){
			System.out.print(":");
		}
	}
	
	
}
