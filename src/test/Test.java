package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

public class Test {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int len = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		
		for(int i=0; i<len; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
//		for(int i : countingSort(arr)) {
//			sb.append(i + "\n");
//		}
		
		for(int i=1; i<10001; i++) {
			while(arr[i] > 0) {
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		
		
		System.out.print(sb);
		
	}
	
//	static int[] countingSort(int[] arr) {
//		int[] counting = new int[10001];
//		int[] result = new int[arr.length];
//		
//		for(int i=0; i < arr.length; i++) {
//			counting[arr[i]]++;
//		}
//		
//		for(int i=1; i<counting.length; i++) {
//			counting[i] += counting[i-1];
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			result[--counting[arr[i]]] = arr[i];
//		}
//		
//		return result;
//	}
}
