package hw;

/*
 * ��J�@�ӥ���ƭ�(���t 0)�A�Ǧ^�ӼƭȬO�X���(# ofdigits)�C
 */

import java.util.Scanner;

public class hw01_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("�п�J�@�ӥ����: ");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		
		int i = n;
		while(i > 0)
		{
			i = i / 10;
			ans++;
		}
		
		System.out.println(n + " �O " + ans + " ���");

	}

}
