package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 103051089 林冠磊
 */
public class hw03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		System.out.println(DecToBin(in));
		System.out.println(StrCheck(DecToBin(in)));
	}
	public static String DecToBin(int a) {
		if(a==0){
			return "";
		}else{			
			return DecToBin(a/2)+String.valueOf(a%2);
		}		
	}
	public  static int StrCheck(String a) {

		if(a.equals("")){		
			return 0 ;
		}else if(a.substring(0,1).equals("1")){
			return 1+StrCheck(a.substring(1));
		}else{
			return StrCheck(a.substring(1));
		}
		
	}
}
