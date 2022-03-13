package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//기초수학2 문제
//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

//입력
//세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

//출력
//직사각형의 네 번째 점의 좌표를 출력한다.


public class No3009 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][2];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());    
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<2; i++){
            if(arr[0][i] == arr[1][i]) sb.append(arr[2][i]).append(' ');
            else if(arr[0][i] == arr[2][i]) sb.append(arr[1][i]).append(' ');
            else sb.append(arr[0][i]).append(' ');    
        }
        System.out.println(sb);
        
	}
}
