package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//기본수학2 문제
//1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 
//예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
//
//골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 
//이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 
//예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 
//10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
//
//2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 
//만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.
//
//출력
//각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 
//출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
//
//제한
//4 ≤ n ≤ 10,000

public class No9020 {
	static boolean[] arr = new boolean[6000];
	
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        makeArr();
        
        for(int t=0; t<numCase; t++){
            int num = Integer.parseInt(br.readLine());
        	int i=num/2, j=i;
        	while(arr[i]==true || arr[j]==true) {
        		i--;
        		j++;
        	}
            sb.append(i).append(' ').append(j).append('\n');
        }
        System.out.print(sb);
		
	}
	
	static void makeArr(){
        arr[0] = true;
        arr[1] = true;
        for(int i=2; i<=Math.sqrt(arr.length); i++){
            if(arr[i] == true) continue;
            for(int j=i+i; j<arr.length; j+=i){
                arr[j] = true;
            }
        }
    }
}