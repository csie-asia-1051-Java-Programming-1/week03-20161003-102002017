package hw;

/*
 * ���ϥΪ̿�J�@�����n�A�p��1*(1+1) + 2*(2+1) + 3*(3+1) + �K + n*(n+1)�ÿ�X���G�C
 */

import java.util.Scanner;
public class hw05_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӥ����: ");
		int n = scn.nextInt();
		int ans = 0;
		
		for(int i = 1; i <= n; i++)
		{
			int m = i*(i+1);
			ans += m;
		}
		
		System.out.println("���G�� " + ans);

	}

}
