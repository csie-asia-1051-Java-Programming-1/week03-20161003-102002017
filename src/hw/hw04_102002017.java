package hw;

/*
 * ���ϥΪ̿�J�@�����n�A��while�j��p��n!���X�C
 */

import java.util.Scanner;
public class hw04_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӥ����: ");
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
