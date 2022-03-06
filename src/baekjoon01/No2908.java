package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제
//상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
//이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
//상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
//
//상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 
//상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//
//두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 
//0이 포함되어 있지 않다.
//
//출력
//첫째 줄에 상수의 대답을 출력한다.

public class No2908 {
	public static void main(String[] args) throws IOException {
		System.out.println("a");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb =new StringBuilder();
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int max;
		int a = num1;
		int b = num2;
		while(true) {
			if(a%10 > b%10) {
				max = num1;
				break;
			}else if(a%10 < b%10) {
				max = num2;
				break;
			}
			a /= 10;
			b /= 10;
		}
		
		for(int i=0; i<3; i++) {
			sb.append(max%10);
			max/=10;
		}
		
		System.out.println(sb);
		
		//아래코드 참고
		//StringBuilder()를 생성과 동시에 append()하여 뒤집는다. 
		//그리고 StringBuilder타입이기 때문에 parseInt가 적용이 안되므로 toString을 사용한다.
//		int A = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
//		int B = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
//		
//		System.out.println(A>B ? A : B);
		
		//System.in.read()를 사용하여 byte단위로 입력받는 방법을 사용한 풀이
//		int a = 0;
//		int b = 0;
//		
//		a += System.in.read()-'0';
//		a += (System.in.read()-'0') * 10;
//		a += (System.in.read()-'0') * 100;
//		
//		System.in.read();
//		
//		b += System.in.read()-'0';
//		b += (System.in.read()-'0') * 10;
//		b += (System.in.read()-'0') * 100;
//		
//		System.out.print(a>b ? a : b);
	}
	
	
	
	
}























