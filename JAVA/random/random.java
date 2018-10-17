public class random{
	public static void main(String[] args){
		int[] diceCounter = new int[6];
		int ROLLS=100000;
		float average = (float)ROLLS/6.0f;

		for(int i = 0 ; i < ROLLS; i++){
			int number = (int)(Math.random()*6.0);
			diceCounter[number]++;
		}
		System.out.println("1\t"+diceCounter[0]+"\t"+ (((float)diceCounter[0] - average) / average) * 100.0f+"%");
		System.out.println("2\t"+diceCounter[1]+"\t"+ (((float)diceCounter[1] - average) / average) * 100.0f+"%");
		System.out.println("3\t"+diceCounter[2]+"\t"+ (((float)diceCounter[2] - average) / average) * 100.0f+"%");
		System.out.println("4\t"+diceCounter[3]+"\t"+ (((float)diceCounter[3] - average) / average) * 100.0f+"%");
		System.out.println("5\t"+diceCounter[4]+"\t"+ (((float)diceCounter[4] - average) / average) * 100.0f+"%");
		System.out.println("6\t"+diceCounter[5]+"\t"+ (((float)diceCounter[5] - average) / average) * 100.0f+"%");
	}
}	
