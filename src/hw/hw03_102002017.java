package hw;

/*
 * ���ϥΪ̿�J�@�����n�A��for�j��p��n!���X�C
 */


import java.util.Scanner;
public class hw03_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӥ����: ");
		int n = scn.nextInt();
		
		int ans = 1;
		for(int i = 1; i <= n; i++)
		{
			ans *= i;
		}
		
		System.out.println(n + "!" + " = " + ans);

	}

}
