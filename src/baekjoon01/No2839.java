package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3, 5, 봉지수: i , 무게 : N
//3*i| 3  6  9 12 15 18 21 24
//5*i| 5 10 15 20 25 30 35 40
//3,5| 3  5  6  8  9 10 11 12 14 15

//3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
//1   1 2   2 3  2  3  4  3  4  3  4  5  4  5  4
//.   * .     .  *     .       .*        .     *
//N이 5의 배수이면 i는 -> if(N%5==0) then i = N/5
//5의 배수 + 1 이면 i는 (이전 5의 배수 +6 이므로)-> if(N%5==1) then i = N/5 + 1 
//5의 배수 + 3 이면 i는 -> if(N%5==3) then i = N/5 + 1 -> N이 3이여도 성립
//N이 4,7 이면 i = -1

//3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
//	          3        4     4        5     5        6     6
//N>7이고 N이 5의배수 + 2 이면 i는 -> if(N>7 && N%5==2) then i=N/5 +2
//N이 5의배수 + 4 이면 i는 -> if(N%5==4) then i=N/5 + 2


public class No2839 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int n = num%5;
        if(num==4 || num==7) System.out.println(-1);
        else if(n==0) System.out.println(num/5);
        else if(n==1 || n==3)System.out.println(num/5+1);
        else if(n==4 || n==2)System.out.println(num/5+2);
	}
}
