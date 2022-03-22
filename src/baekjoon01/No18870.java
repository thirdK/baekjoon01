package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
좌표 압축
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	512 MB	28895	12509	9500	41.224%

정렬문제
수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.

X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.

입력
첫째 줄에 N이 주어진다.

둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

출력
첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.

제한
1 ≤ N ≤ 1,000,000
-10^9 ≤ Xi ≤ 10^9

정렬 문제로 보기 애매한데 어찌됐든 쉽게 말하면 주어진 숫자에 rank를 매기는 것이다.
즉, 주어진 숫자의 가장작은 수를 0으로 이후 그다음 작은 수 1, 2, 3... 으로 순위를 매긴다.

입력 예제
5
2 4 -10 4 -9

출력 예제
2 3 0 3 1

1. N을 입력 받는다
2. N만큼 정수를 입력 받는다.
	- 배열로 저장 / map을 사용
		
3. 정렬이 아닌 각 수들의 rank를 구하여 출력한다.
	- 대응대는 배열을 만들어서 rank를 저장?
	- 비교는 어떻게 할 것인가? -> 수의 범위가 커서 카운팅배열은 힘들거 같음
		-> map으로 저장하면 해결됨
	
rank는 0부터 시작하며 중간에 비는 수는 없다. 
중복 되는 숫자는 같은 rank를 가진다.

1. 배열로 수를 받는다
2. 배열을 정렬한다.
3. 정렬된 순서대로 HashMap에 추가한다.
	- 수를 key로 사용할 것
	- value는 lank변수를 만들어서 1씩 증가 시킬것
	- 추가하기 전에 조건문으로 해당 키가 존재하는지 확인하여 추가 여부 결정할 것(lank가 증가하면 안되니까)



 */


public class No18870 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int len = Integer.parseInt(br.readLine());
		int[] arr = new int[len];
		int[] arr2 = new int[len];
		int lank=0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<len; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[i] = arr[i];
		}
		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<len; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], lank++);
			}
		}
		
		for(int i=0; i<len; i++) {
			sb.append(map.get(arr2[i]) + " ");
		}
		
		System.out.println(sb);
	}
}





















