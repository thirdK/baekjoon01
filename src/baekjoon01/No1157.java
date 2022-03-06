package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//문제
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 
//프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

//입력
//첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

//출력
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
//단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

public class No1157 {
	public static void main(String[] args) throws IOException {
		System.out.println('a');

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] result = new int[26];	//배열을 이용하여 알파벳 등장 횟수를 저장
		int max = 0, alpha = 0;
		String str = br.readLine().toUpperCase(); //대문자로 변환함 (어차피 결과도 대문자여서)

		for (byte b : str.getBytes()) { //getBytes()를 연습할겸 사용함
			result[b - 'A']++;
		}

		for (int i = 0; i < result.length; i++) {
			if (max < result[i]) {
				max = result[i];
				alpha = i;
			} else if (max == result[i]) {
				alpha = '?' - 'A';//배열에 없는 ? 이기 때문에 따로 -'A'처리함
			}
		}

		System.out.print((char) (alpha + 'A'));

		// 아래 입력 방법 참고
//		int[] arr = new int[26]; // 영문자의 개수는 26개임
//		 
//		int c = System.in.read(); //byte단위 입력을 받을 수 있다.
// 
//		while (c > 64) {	// 공백을 입력받는 순간 종료됨 
//			
//			if (c < 91) {
//				arr[c - 65]++;
//			} else {
//				arr[c - 97]++;
//			}
//			c = System.in.read();
//		}
	}
}
