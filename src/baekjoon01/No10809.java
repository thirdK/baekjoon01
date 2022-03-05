package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//문자열문제
//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
//단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 
//프로그램을 작성하시오.
//
//입력
//첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
//
//출력
//각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 
//위치를 공백으로 구분해서 출력한다.
//
//만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 
//단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.




public class No10809 {
	
	public static void main(String[] args) throws IOException{
		System.out.println("aa");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);
        
        for(int i=0; i<str.length(); i++){
        	if(alpha[str.charAt(i)-97] != -1) continue;
            alpha[str.charAt(i)-97] = i;
        }
        
        for(int i : alpha){
            sb.append(i).append(" ");
        }
        System.out.print(sb);
		
//		System.out.println(str.contains("b")); 문자열로 1글자씩 분해하면 사용 가능한데 번거롭고
//		System.out.println(str.indexOf("o")); 자원사용이 비효율적인것 같음(배열을 별도로 만들어야함)
        
//		for(byte s : str.getBytes()) { 이 방법은 결국 byte를 문자로 쓰려면 char로 형변환해야함
//			System.out.println(s-97);	String상태로 한글자씩 뽑을 수 없음
//		}
	}
}

























