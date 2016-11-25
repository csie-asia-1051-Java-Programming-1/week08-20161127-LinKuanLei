package hw;
import java.util.Scanner;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 103051089 林冠磊
 */
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("需要轉換的數字系統與數字為?(ex.十進位 13,輸入 10 13)");
		int in = sc.nextInt();
		int num = sc.nextInt();
		System.out.print("轉換為何種數字系統?(ex.二進位,輸入2)");
		int out = sc.nextInt();
		System.out.println(DecToAny(out, AnyToDec(in, num, 0)));
	}
	public static int AnyToDec(int a,int b,int c){		
		if(b==0){
			return 0;
		}else{
			return (int)((b%10)*Math.pow(a, c))+AnyToDec(a,(int)(b/10),++c);
		}
	}
	public static String DecToAny(int a,int b) {
		if(b==0){
			return "";
		}else{			
			return DecToAny(a,b/a)+String.valueOf(b%a);
		}
		
	}
}
