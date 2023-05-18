public class ExMethod3{
	public static void main(String[] args){

		calcArea(5,10,4);

	}
	public static void calcArea(int top,int bottom,int height){
		System.out.print("top >> ");
		top = new java.util.Scanner(System.in).nextInt();
		System.out.print("bottom >> ");
		bottom = new java.util.Scanner(System.in).nextInt();
		System.out.print("height >> ");
		height = new java.util.Scanner(System.in).nextInt();
		System.out.printf("TOPが%d,BOTTOMが%d,HEIGHTが%dの台形の面積は%dです%n",top,bottom,height,(top+bottom)*height/2);
	}
}
