package ex;

import java.util.Scanner;

/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 103051089 林冠磊
 */

public class ex04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("要做何種計算?(+,-,*,/,pow2,pow3,root)");
		String str = sc.nextLine();
		float a = 0, b=0;
		switch(str){
			case "+" :
				a=sc.nextFloat();
				b=sc.nextFloat();
				System.out.println( Counter .cha( a , b ));
				break;
			case "-" :
				a=sc.nextFloat();
				b=sc.nextFloat();
				System.out.println( Counter .chin( a , b ));
				break;
			case "*" :
				a=sc.nextFloat();
				b=sc.nextFloat();
				System.out.println( Counter .chan( a , b ));
				break;
			case "/" :
				a=sc.nextFloat();
				b=sc.nextFloat();
				System.out.println( Counter .chuu( a , b ));
				break;
			case "pow2" :
				a=sc.nextFloat();
				System.out.println( Counter .pow2( a ));
				break;
			case "pow3" :
				a=sc.nextFloat();
				System.out.println( Counter .pow3( a ));
				break;
			case "root" :
				a=sc.nextFloat();				
				System.out.println( Counter .root( a ));
				break;
		}
	}

}
class Counter{
	public static float cha(float a,float b){
		return a+b;
	}
	public static float chin(float a,float b){
		return a-b;
	}
	public static float chan(float a,float b){
		return a*b;
	}
	public static float chuu(float a,float b){
		return a/b;
	}
	public static float pow2(float a){
		return a*a;
	}
	public static float pow3(float a){
		return a*a*a;
	}
	public static float root(float a){
		return (float)Math.sqrt(a);
	}
}
