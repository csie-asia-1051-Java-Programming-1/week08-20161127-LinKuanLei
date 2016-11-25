package hw;
import java.util.Scanner;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 103051089 林冠磊
 */
public class hw01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		System.out.println(DecToBin(in));
	}
	public static String DecToBin(int a) {
		if(a==0){
			return "";
		}else{			
			return DecToBin(a/2)+String.valueOf(a%2);
		}		
	}
}
