package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//기본수학1 문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
//
//출력
//첫째 줄에 A+B를 출력한다.

public class No10757 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		
		sum(a,b);
	}
	
	static void sum(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int len = Math.max(a.length(), b.length());
		int[] num1 = new int[len+1];
		int[] num2 = new int[len+1];
		
		for(int i=0; i<a.length(); i++) {
			num1[i] = a.charAt(a.length()-i-1)-'0';
		}
		for(int i=0; i<b.length(); i++) {
			num2[i] = b.charAt(b.length()-i-1)-'0';
		}
		
		for(int i=0; i<len+1; i++) {
			int r = num1[i] + num2[i];
			if(r >= 10) num2[i+1]++;
			num2[i] = r%10;
			sb.append(num2[i]);
		}
		if(sb.charAt(len) == '0') {
			sb.delete(len, len+1);
		}
		System.out.println(sb.reverse());
	}
}
