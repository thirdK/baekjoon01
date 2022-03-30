package baekjoon02_algoritm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//요세푸스 문제
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//2 초	256 MB	61718	30256	21490	48.216%
//문제
//요세푸스 문제는 다음과 같다.
//
//1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 
//이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
//이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
//예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
//
//N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
//
//출력
//예제와 같이 요세푸스 순열을 출력한다.

public class No1158 {
	static StringBuilder sb = new StringBuilder();
	static int cnt=0;
	public static void main(String[] args) throws IOException {
		System.out.println('a');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());	//1~n
        int k = Integer.parseInt(st.nextToken());	//k번째 제거
        
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=0; i<n; i++) {
        	q.add(i+1);
        }
        
        sb.append("<");
        solution(q,k);
        sb.append(">");
        System.out.println(sb);
    }
	
	static void solution(Queue<Integer> q, int k) {
		
		while(!q.isEmpty()) {
			cnt++;
			if(q.size() == 1) {	// 1개의 객체만 남으면 ', '없이 sb에 저장
				sb.append(q.poll());
				return;
			}
			if(cnt%k == 0) {
				sb.append(q.poll() + ", ");
				continue;
			}
			q.add(q.poll());
		}
	}
}






















