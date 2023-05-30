import java.util.*;

public class Code6_10{
	public static void main(String[] args){

		int[] heights = {172,149,152,191,155};
		for(int h :heights){
			System.out.println(h);
		}

		//配列の内容を表示
		int[] arr = {9,5,7};
		System.out.println(Arrays.toString(arr));
		//配列の昇順ソート
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		//部分文字列の作成
		//文字列.substring(以上、未満)
		String s = "Java".substring(0,2); //Ja

		//書式を使って文字列を作成する
		String fmt = String.format("%d:%s:%.1f",10,"Hello",20.235);
		System.out.println(fmt);
	}
}
