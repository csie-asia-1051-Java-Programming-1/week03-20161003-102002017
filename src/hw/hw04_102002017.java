package hw;

/*
 * 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 */

import java.util.Scanner;
public class hw04_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個正整數: ");
		int n = scn.nextInt();
		int ans = 1;
		
		int i = n;
		while(i > 0)
		{
			ans*=i;
			i--;
		}
		
		System.out.println(n + "!" + " = " + ans);

	}

}
