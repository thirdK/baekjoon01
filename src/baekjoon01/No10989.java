package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 
//둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.


public class No10989 {
	static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
    	System.out.println('a');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCase = Integer.parseInt(br.readLine());
        int[] arr = new int[numCase];
        
        for(int i=0; i<numCase; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        sortArr(arr);
        System.out.println(sb);
    }
	
	static void sortArr(int[] arr){
        int[] counting = new int[10001];
        int[] result = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            counting[arr[i]]++;
        }
        
        for(int i=1; i<counting.length; i++){
            counting[i] += counting[i-1];
        }
        
        for(int i=arr.length-1; i>=0; i--){
            int idx = --counting[arr[i]];
            result[idx] = arr[i];
        }
        for(int i : result){
            sb.append(i + "\n");
        }
        
    }
}
