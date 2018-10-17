public class swap{
	public static void main(String[] args){
		int a=1, b =2;
		int []c = {a,b};
		swap(c,0,1);

		System.out.println(c[0] + " " + c[1]);
		
	}

	public static void swap(int[] data, int a,int b){
		int tmp = data[a];
		data[a] = data[b];
		data[b] = tmp;
	}
}

