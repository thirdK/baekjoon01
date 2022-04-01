package baekjoon02_algoritm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
단어 뒤집기 2
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	13614	7683	5928	56.792%
문제
문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.

먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.

알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
문자열의 시작과 끝은 공백이 아니다.
'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 
단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 
태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.

입력
첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.

출력
첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.

1. 입력받는다.
	- 전체를 문자열로 받아야한다. 쪼개면 태그안에 띄어쓰기까지 토큰으로 쪼개질듯
	- <> 태그는 시작'<' 끝'>'으로 구분하고 순서를 바꾸지 않는다 -> 큐를 사용하면 될듯?
	- 태그를 제외하고 띄어쓰기로 구분된 모든 단어는 문자열 순서를 바꾼다(띄어쓰기 여러개를 주의) -> 스택사용
2. 출력한다.
	- 출력은 StringBuilder를 사용하면 될거같다.
*/
public class No17413 {
	static StringBuilder sb = new StringBuilder();
    static Stack<Character> s = new Stack<>();
    public static void main(String[] args) throws IOException{
    	System.out.println('a');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        solution(str);
        
        System.out.println(sb);
    }
    
   static public void solution(String str) {
        boolean check = false;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '<') {
            	check=true;
            	while(!s.isEmpty()){ sb.append(s.pop()); }
            }
            if(check){
                sb.append(c);
            }else{
                toStack(c);
            }
            if(c == '>') check = false;
        }
        while(!s.isEmpty()){ sb.append(s.pop()); }
    }
   
   
    static public void toStack(char c){
        if(c==' '){
            while(!s.isEmpty()){
                sb.append(s.pop());
            }
            sb.append(' ');
        }else {
        	s.push(c);
        }
    }
}




















