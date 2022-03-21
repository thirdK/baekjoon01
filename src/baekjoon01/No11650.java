package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//정렬문제
//2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, 
//x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
//(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
//
//출력
//첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.

//N을 입력받는다.
//좌표를 N번 입력 받는다. 	-> 1~100,000
//좌표를 저장한다.			-> -100,000 <= (x,y) <= 100,000
//		-> 2차원 배열로 받는다?	arr[N][2]
//좌표를 정렬한다. -> x가 작은 값을 우선으로 x가 같으면 y를 기준으로
//		-> 2차원 배열을 x,y 둘다 정렬? -> 노가다
//		-> 2차월 배열의 1번 인덱스를 x로 잡고 포함되는 y를 집어넣으면? -> 각 배열별로 길이가 다르다.
//		-> 메소드의 역정렬을 comparator, lambda를 이용해 사용?
//좌표를 출력한다.


public class No11650 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		
		int n = Integer.parseInt(br.readLine());
		int[][]	arr = new int[n][2];
//		int[][] arr = {{3,4},{1,1},{1,-1},{2,2},{3,3}};
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] =Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.stream(arr)
		.sorted((o1, o2) ->{
			if(o1[0] == o2[0]) {
				return o1[1] - o2[1];
			} else return o1[0] - o2[0];
		})
		.forEach(i -> sb.append(i[0] + " " + i[1] + "\n"));
		
		System.out.println(sb);
		
		
//		Arrays.sort(arr, (i1, i2) -> {
//			if(i1[0] == i2[0]) {
//				return i1[1] - i2[1];
//			}else return i1[0] - i2[0];
//		});
	}
}























