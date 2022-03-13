package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//재귀 문제
//0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
//
//출력
//첫째 줄에 N!을 출력한다.

public class No10872 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.print(fac(num));
	}
	static int fac(int num){
        if(num == 0) return 1;
        return num * fac(num-1);
    }
	
}
