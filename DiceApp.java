import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		int[] dices = createDiceArr(5);
		System.out.println(Arrays.toString(dices);
				dices = createDiceArr(10);
				System.out.println(Arrays.toString(dices);
	}
	/*
	 * createDiceArrメソッド
	 * 引数で受け取った回数分のサイコロの目の入った配列を作成する
	 * 引数：count(int)回数
	 * 戻り値：diceArr(int[])サイコロの目が回数分入った配列
	 */
	static int[] createDiceArr(int count){
		int[] diceArr = new int[count];
		for(int i =0;i <diceArr.length ;i++){
			diceArr[i] = new Random().nextInt(6)+1;
		}
		return diceArr;
	}
}
