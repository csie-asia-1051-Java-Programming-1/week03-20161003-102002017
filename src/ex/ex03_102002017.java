package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 102002017 邱泓偉
 */

import java.util.Scanner;
public class ex03_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		char ch1 = scn.next().charAt(0);
		int v1 = ch1 - 'a';
		
		//a97 A65
		
		//小寫
		if(v1 >= 0 && v1 < 26)
		{
			v1 = 65 + v1;
			System.out.println((char)v1);
			
		}
		else
		{
			v1 = ch1 - 'A';
			
			if(v1 >= 0 && v1 < 26)
			{
				v1 = 97 + v1;
				System.out.println((char)v1);
			}
		}
	}
}
