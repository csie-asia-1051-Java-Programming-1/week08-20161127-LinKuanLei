package hw;
/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示
 * Date: 2016/11/21
 * Author: 103051089 林冠磊
 */

import java.util.Scanner;
public class hw04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LED led = new LED();
		Scanner sc = new Scanner(System.in);
		led.setNum(sc.nextInt());
		led.showNum();
	}

}
class LED{
	private int num,a=0,b=0,c=0,d=0;
	private String[] line1 = {"	*****	",	"	*	",	"	*****	",	"	*****	",	"	*     *	",	"	*****	",	"	*****	",	"	*****	",	"	*****	",	"	*****	"};	
	private String[] line2 = {"	*     *	",	"	*	",	"	       *	",	"	       *	",	"	*     *	",	"	*       	",	"	*       	",	"	*     *	",	"	*     *	",	"	*     *	"};	
	private String[] line3 = {"	*     *	",	"	*	",	"	*****	",	"	*****	",	"	*****	",	"	*****	",	"	*****	",	"	       *	",	"	*****	",	"	*****	"};	
	private String[] line4 = {"	*     *	",	"	*	",	"	*       	",	"	       *	",	"	       *	",	"	       *	",	"	*     *	",	"	       *	",	"	*     *	",	"	       *	"};	
	private String[] line5 = {"	*****	",	"	*	",	"	*****	",	"	*****	",	"	       *	",	"	*****	",	"	*****	",	"	       *	",	"	*****	",	"	*****	"};	
	public LED() {		
	}
	public void setNum(int x){
		num = x;
		a = x/1000;
		b= (x%1000)/100;
		c= (x%100)/10;
		d = x%10;
	}
	public void showNum(){
		System.out.println(line1[a]+line1[b]+line1[c]+line1[d]);
		System.out.println(line2[a]+line2[b]+line2[c]+line2[d]);
		System.out.println(line3[a]+line3[b]+line3[c]+line3[d]);
		System.out.println(line4[a]+line4[b]+line4[c]+line4[d]);
		System.out.println(line5[a]+line5[b]+line5[c]+line5[d]);
	}
}
