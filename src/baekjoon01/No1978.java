package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//기본수학2 문제
//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
//
//입력
//첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
//
//출력
//주어진 수들 중 소수의 개수를 출력한다.

public class No1978 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int i=0; i<numCase; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num==1) continue;
            if(check(num)) cnt++;
        }
        System.out.println(cnt);
	}
	
	static boolean check(int num){
        int sqrt = (int)Math.sqrt(num);
        for(int i=2; i<=sqrt; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
