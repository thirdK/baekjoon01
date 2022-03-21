package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//정렬문제
//배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
//
//입력
//첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

//입력을 받는다 -> 역정렬하여 출력한다.
//124860 -> 864210

//입력받은 값을 어떤 자료형으로 받을 것인가? (문자열/정수/배열)
//	우선 정수 사용은 제외한다 -> 1자리씩 빼려면 %10 씩 계속 연산해야함
//	배열 사용은 애매하다 -> 배열 1칸에 1자리씩 받아야 한다 정수랑 크게 다르지 않다.
//	문자열 사용이 괜찮을듯 -> 문자열을 어떻게 정렬?
//정렬은 어떻게할 것인가? (메소드사용/특정 정렬 구현)
//	메소드사용은 제외한다. -> 너무쉬움
//	카운팅 변형 가능할듯

//어차피 각 자리수는 0~9이니까 counting배열로 숫자별 횟수만 저장하면 될듯? 

public class No1427 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int[] cnt = new int[10];
        
        for(int i=0; i < input.length(); i++){
            cnt[input.charAt(i)-'0']++;
        }
        
        
        for(int i=cnt.length-1; i>=0; i--){
            for(int j=0; j < cnt[i]; j++){
                sb.append(i);
            }
        }
        
        System.out.print(sb);
    }

}
