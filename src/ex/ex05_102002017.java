package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 102002017 邱泓偉
 */

import java.util.Scanner;
public class ex05_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		
		if(a%2 == 0)
		{
			System.out.println("偶數");
		}
		else
		{
			System.out.println("奇數");
		}
	}
}
