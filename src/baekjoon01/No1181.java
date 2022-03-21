package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로

입력
첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 
둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
주어지는 문자열의 길이는 50을 넘지 않는다.

출력
조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 */

//n을 입력받는다.
//문자열을 n번 입력받는다.
//조건에 맞게 정렬하여 출력한다.
//		1. 길이가 짧은 것
//		2. 같은 길이면 사전 순


public class No1181 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] arr = new String[len];
		
		for(int i=0; i<len; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.stream(arr)
		.distinct()
		.sorted((o1, o2) -> {
			if(o1.length() == o2.length()) {
				return o1.compareTo(o2);	//string의 compareTo는 사전순 정렬
			}else return o1.length() - o2.length();
		})
		.forEach(i -> sb.append(i + "\n"));
		
		System.out.println(sb);
		
		//아래처럼 스트림 없이 sort()메소드와 익명메소드로 풀이 가능
//		Arrays.sort(arr, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				if(o1.length() == o2.length()) return o1.compareTo(o2);
//				else return o1.length() - o2.length();
//			}
//		});
	}
}


























