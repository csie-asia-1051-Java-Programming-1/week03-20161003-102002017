package hw;

/*
 * 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 */

import java.util.Scanner;

public class hw01_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("請輸入一個正整數: ");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		
		int i = n;
		while(i > 0)
		{
			i = i / 10;
			ans++;
		}
		
		System.out.println(n + " 是 " + ans + " 位數");

	}

}
