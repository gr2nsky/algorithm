// #10869. 사칠연산 해보기
//두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
//입력 : 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
//출력 : 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

import java.util.Random;

public class Main {
	
	public static void main(String args[]) {
		Random ran = new Random();
		
		int A = ran.nextInt(9999)+1;
		int B = ran.nextInt(9999)+1;
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}

}

//왜틀렸지? 근데 구성은 똑같으니깐...
