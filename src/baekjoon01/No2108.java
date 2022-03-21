package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/*
정렬 문제
수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 
통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 
그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.

출력
첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.

둘째 줄에는 중앙값을 출력한다.

셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.

넷째 줄에는 범위를 출력한다.
*/

//N을 입력받는다.
//정수형 배열[N]을 만든다.
//데이터를 N번 입력받는다. 
//1. 평균을 구한다.(소수점은 반올림) ->더해서 길이-1로 나누면됨
//2. 중앙값을 구한다.	-> 정렬후 중앙인덱스값 찾기 -> 인덱스평균 찾으면됨
//3. 최빈값을 구한다.	-> 가장많이 나타나는 값을 배열로 만들어서 저장할듯 (여러개면 그중 2번째로 작은값을 출력)
//4. 범위 			-> 최소값과 최대값은 정렬하면 해결됨

//우선 정렬은 어떻게 할 것인가? -> 최대 50만개
//							퀵구현/카운팅구현/자바에서 제공하는 sort()사용(컬렉션/배열/스트림사용?)
//최빈값을 어떻게 배열로 구현할 것인가? -> 절대값 4000 -> -4000 ~ 4000(총 8001개)
//								-> 음수/양수를 어떻게 구분할 것인가?
//								-> 별도의 배열을 만든다? -> 검색할때 왔다갔다해야함.
//								-> 14001개를 만들어서 가장 앞 1을 양수 음수 구별로 사용? -> 누수가 크다.
//								-> 그냥 8001칸으로 만들자 4000을 0으로 잡는다.
//어차피 최빈값을 찾는다면 정렬도 카운팅구현을 하는게 좋을듯함
//순서는 카운팅정렬 누적합 이전까지만 -> 평균 -> 최빈값 -> 카운팅정렬 구현 -> 중앙값/범위 
//출력순서와 다르므로 별도로 저장해야할듯

public class No2108 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int len = Integer.parseInt(br.readLine());
		double sum = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		int[] counting = new int[8001];
		int[] result = new int[len];
		for(int i=0; i<len; i++) {
			int input = Integer.parseInt(br.readLine());
			sum += input;
			counting[4000+input]++;
			if(max < input) max = input; //최소, 최대값을 저장
			if(min > input) min = input;
		}
		
		int cnt_x=0; //최대 빈도수
		int idx =0; //조건에 맞는 최빈값
		boolean flag = false;
		
		for(int i=min+4000, j=0; i<=max+4000; i++) { //최소, 최대값으로 탐색범위 축소
			if(counting[i] > cnt_x) {
				flag = true;
				cnt_x = counting[i];
				idx = i;
			}else if(counting[i] == cnt_x && flag) {
				flag = false;
				idx = i;
			}
			while(counting[i] > 0) {
				result[j++] = i - 4000;
				counting[i]--;
			}
		}
		
		
		sb.append((int)Math.round(sum/len) + "\n");	//평균
		sb.append(result[result.length/2] + "\n"); //중앙값
		sb.append(idx-4000 + "\n");	//최빈값
		sb.append(max - min);
		
		System.out.println(sb);
		System.out.println(Arrays.toString(result));
	}
}
























