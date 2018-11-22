// 입력받은 숫자 a,b를 뺄셈해 출력하기

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a - b);
	}

}
