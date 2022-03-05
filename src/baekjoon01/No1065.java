package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//함수문제
//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
//등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
//N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

//입력
//첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

//출력
//첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

public class No1065 {
	public static void main(String[] args) throws IOException{
		System.out.println("aa");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(solution(num));
	}

	static int solution(int num){
        if(num < 100) return num;	//어차피 99까진 한수임
        
        int cnt = 99;	//99 넘는 숫자만 이쪽으로 넘어오기 때문에 초기값은 99
        
        for(int i=100; i<=num; i++){ //99이하는 비교할 필요없음
            int n1 = i%10;	//1의 자리
            int n2 = i/10 % 10;	//10의 자리
            int n3 = i/100;	//100의 자리
            
            if((n3-n2) == (n2-n1)){ //한수면 cnt증가
                cnt++;
            }
        }
        return cnt;
	}
}
