package ex;
import java.util.Scanner;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 103051089 林冠磊
 */

public class ex02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("需要轉換的數字系統為?(Ex.二進制輸入2)");
		int in = sc.nextInt();
		System.out.print("轉換為哪種數字系統?(Ex.十進制輸入10)");
		int out = sc.nextInt();
		System.out.print("需要轉換的數字為?");
		int num = sc.nextInt();
		int export = InToOut(10,out,InToOut(in,10,num));
		System.out.println(export);
		
	}
	public static int InToOut(int in,int out,int num){
		int temp=0,count= 0;		
		if(in>out){
			String str ="";
			while(num>0){
				temp=num%out;
				str = String.valueOf(temp) + str;
				num /=out;				
			}
			return Integer.valueOf(str);
		}else{
			while(num>0){				
				temp+=num%10 * (int)Math.pow(in,count);
				num/=10;				
				count++;				
			}
			return temp;
		}
		
	}

}
