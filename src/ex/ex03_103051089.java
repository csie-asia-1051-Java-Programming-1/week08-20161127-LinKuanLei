package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，
	而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m1 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 103051089 林冠磊
 */

public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		int[][] a={{1,2},{1,2}};
		int[][] b={{1,2,3,4},{1,2,3,4}};
		int[][] c = new int[a.length][b[0].length];
		for(int i =0;i< a.length;i++){
			for(int j =0;j< b[0].length;j++){				
				for(int k = 0;k<a[0].length;k++){					
					c[i][j]+=a[i][k]*b[k][j];
				}				
			}			
		}
		System.out.println("A陣列：");
		for(int i = 0; i<a.length;i++){
			for(int j = 0; j<a[0].length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("B陣列：");
		for(int i = 0; i<b.length;i++){
			for(int j = 0; j<b[0].length;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("C陣列：");
		for(int i = 0; i<c.length;i++){
			for(int j = 0; j<c[0].length;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
