import java.util.*;
public class Method7{
	public static void main(String[] args){
		int[] arr2 = {1,2,3};
		int[] newArr =method6(arr2);
		System.out.println(Arrays.toString(newArr));
	}
	public static int[] method6(int[] arr){
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length ;i++){
			newArr[i] = arr[i]*2;
		}
		return newArr;
	}
}
