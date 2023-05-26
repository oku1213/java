import java.util.*;
public class ExSample{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("何人>> ");
		int num = sc.nextInt();
		int[] scores = new int[num];
		for(int i = 0;i < num ;i++){
			scores[i] = rand.nextInt(101);
		}
		System.out.println(Arrays.toString(scores));
	}
}
