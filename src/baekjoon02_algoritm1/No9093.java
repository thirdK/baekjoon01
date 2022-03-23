package baekjoon02_algoritm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//단어 뒤집기 다국어
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	19370	9799	7342	51.487%

//문제
//문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 
//단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 
//문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
//
//출력
//각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.

public class No9093 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int numCase = Integer.parseInt(br.readLine());
        
        for(int i=0; i<numCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
            	String tmp = st.nextToken();
            	for(int j=0;j<tmp.length();j++) {
            		stack.add(tmp.charAt(j));
            	}
            	
            	while(!stack.isEmpty()) {
            		sb.append(stack.pop());
            	}
            	sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
