package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//기본수학2 문제
//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 
//이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//
//예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 
//소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
//
//입력
//입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
//
//M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
//
//출력
//M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
//
//단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

public class No2581 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int start = Integer.parseInt(br.readLine());
        start = start < 2 ? 2 : start;	//2보다 작으면 시작범위를 2로 조정
        int end = Integer.parseInt(br.readLine());
        int total=0, min=0;
        
        for(int i=start; i<=end; i++){
            if(check(i) && total==0) min=i;//어차피 순서대로 검사하므로 최초의 소수가 최소값
            if(check(i)) total += i;//모든 소수는 더해서 저장
        }
        if(total==0) { //소수가 없으면
        	System.out.println(-1);
        	return;
        }
        sb.append(total).append('\n').append(min);
        System.out.println(sb);
        
	}
	
	static boolean check(int num){
        int sqrt = (int)Math.sqrt(num);
        for(int i=2; i<=sqrt; i++){
            if(num%i==0) return false;
        }
        return true;
    }
	
	// 에라토스테네스체 알고리즘
	//에라토스테네스의체 시간복잡도가 O(N㏒(㏒N)) 이라 매우 좋음
	
	
//	public static boolean prime[]; -> 필요한만큼 배열공간 생성
//	public static void get_prime() {
//		prime[0] = true; //0,1은 필요없으니 일단 마킹
//		prime[1] = true;
//	
//		for(int i = 2; i <= Math.sqrt(prime.length); i++) { //제곱근까지만 확인하면 나머지는 배수로 처리됨
//			if(prime[i]) continue;	// 이미 체크된 배열은 건너뜀
//			for(int j = i * i; j < prime.length; j += i) {
//				prime[j] = true;
//			}
//		}
//	
//	}
}
