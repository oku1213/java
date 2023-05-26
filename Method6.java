import java.util.*;
public class Method6{
	public static void main(String[] args){
		int n = -20;
		int input = method(n);
		System.out.println(input);

	}
	public static int method(int n){
		int input = n;
		if(input < 0){
			input = input * (-1);
		}else if(input > 0){
			input = input * (-1);
		}else{
		}
		return input;
	}
}
