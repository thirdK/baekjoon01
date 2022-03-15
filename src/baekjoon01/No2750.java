package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//정렬문제
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 
//이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
//
//출력
//첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

public class No2750 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int numCase = Integer.parseInt(br.readLine());
        int[] arr = new int[numCase];
        
        for(int i=0; i<numCase; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

//        sortArr(arr);
//        for(int i : arr) {
//        	sb.append(i + "\n");
//        }
//        System.out.println(sb);
        
        //stream() 풀이
        Arrays.stream(arr).sorted().forEach( i -> sb.append(i + "\n"));
        System.out.println(sb);
    }
	//선택정렬 풀이
//	static void sortArr(int[] arr) {
//		int tmp;
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//	}
}
