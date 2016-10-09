package hw;

/*
 * 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 */

import java.util.Scanner;
public class hw05_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個正整數: ");
		int n = scn.nextInt();
		int ans = 0;
		
		for(int i = 1; i <= n; i++)
		{
			int m = i*(i+1);
			ans += m;
		}
		
		System.out.println("結果為 " + ans);

	}

}
