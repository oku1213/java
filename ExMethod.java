import java.util.*;
public class ExMethod{
	public static void main(String[] args){
		System.out.print("税抜価格 >> ");
		int price = new Scanner(System.in).nextInt();
		System.out.print("税率 >> ");
		int taxRatio = new Scanner(System.in).nextInt();
		int result = calPrice(price,taxRatio);
		System.out.printf("税込価格は%d円です%n",result);

	}
	public static int calPrice(int price,int taxRatio){
		price = price * (taxRatio /100) + price;
		return price;
	}
}
