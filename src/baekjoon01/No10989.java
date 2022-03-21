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
	
	static void sortArr(int[] arr){	//counting정렬을 사용함
        int[] counting = new int[10001];	//나올수 있는 수의 범위만큼 배열의 크기를 만듬
        int[] result = new int[arr.length];	//결과를 저장할 배열(주어진 배열을 정렬하기 때문에 주어진 배열과 같은 크기)
        
        for(int i=0; i<arr.length; i++){//우선 주어진 배열의 값과 일치하는 counting배열의 index를 찾아 1씩 증가시킴
            counting[arr[i]]++;			//말 그대로 그 수가 몇번 나오는지 counting하는 것
        }
        
        for(int i=1; i<counting.length; i++){//카운팅배열을 누적합 시켜줌(코드참고)
            counting[i] += counting[i-1];	//현재idx의 누적합 = 현재idx의 값 + 이전idx의 값
        }
        
        for(int i=arr.length-1; i>=0; i--){//이제 주어진 배열의 값을 카운팅 배열의 인덱스로 사용하여
            int idx = --counting[arr[i]];//해당 칸에 저장된 값에 -1을 한다.
            result[idx] = arr[i];	//그 idx가 arr[i]값의 자리(순서)이다.
            						//여기서 주의점은 arr배열의 마지막 인덱스부터 탐색하는게 좋다.
        }
        for(int i : result){
            sb.append(i + "\n");
        }
        
    }
}
