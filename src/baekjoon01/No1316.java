package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//문자열 문제
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
//예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
//kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
//aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

//입력
//첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
//둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

//출력
//첫째 줄에 그룹 단어의 개수를 출력한다.

//연속되는 중복은 제거하고 1개만 남긴다.
//	-> 1개씩 받기 || 1개씩 쪼개기
//비연속적인 중복을 찾는다. 
//	-> 반복문 탐색 || 중복관련된 함수가 있는 자료형 활용 || 알파벳 배열 활용
//문자열 문제니까 문자열로 받고 1개씩 쪼개서 탐색하는걸로
public class No1316 {
	public static void main(String[] args) throws IOException {
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		int numCase = Integer.parseInt(br.readLine());

		Loop1: for (int i = 0; i < numCase; i++) {
			boolean[] alpha = new boolean[26]; // a-z
			String str = br.readLine();
			alpha[str.charAt(0) - 'a'] = true;// j-1과 j를 비교하므로 [0]은 먼저 처리
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(j - 1) == str.charAt(j))	continue; // 직전문자와 중복이면 체크안함
				if (alpha[str.charAt(j) - 'a'] == true)	continue Loop1;// 이미 체크됐으면 다음 문자열
				alpha[str.charAt(j) - 'a'] = true;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
