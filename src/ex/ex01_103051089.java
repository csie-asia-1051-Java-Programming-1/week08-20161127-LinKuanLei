package ex;
import java.util.Scanner;

/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 103051089 林冠磊
 */

public class ex01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Dex = sc.nextInt();
		System.out.print(DecToBin(Dex));
	}
	public static int DecToBin(int Dec){
		int temp=0;
		String str ="";
		while(Dec>0){
			temp=Dec%2;
			str = String.valueOf(temp) + str;
			Dec /=2;
		}		
		return Integer.valueOf(str);
	}

}

