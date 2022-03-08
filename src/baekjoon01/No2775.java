package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//기본수학1 문제
//평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 
//각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.
//
//이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 
//사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
//
//아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 
//주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 
//단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
//
//입력
//첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 
//두 번째 줄에 정수 n이 주어진다
//
//출력
//각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.


//0층의 i호에는 i명이 산다.
//a층의 b호 인원-> a-1층의 1호~b호 합
//2층 1 4 10 20 35 56
//1층 1 3  6 10 15 21
//0층 1 2  3  4  5  6

//[a층 b-1호] + [a-1층 b호]  

public class No2775 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int[][] apt = new int[15][15]; //[a][b]
        
        for(int i=1; i<apt.length; i++){
            apt[0][i] = i;
        }
        for(int i=1; i<apt.length; i++){
            for(int j=1; j<apt[i].length; j++){
                apt[i][j] = apt[i][j-1]+apt[i-1][j];
            }
        }
        
        int numCase = Integer.parseInt(br.readLine());
        for(int i=0; i<numCase; i++) {
        	sb.append(apt[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())]).append('\n');
        }
        
        System.out.println(sb);
	}
}



















