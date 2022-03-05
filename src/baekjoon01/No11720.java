package baekjoon01;

//문자열문제
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

//입력
//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

//출력
//입력으로 주어진 숫자 N개의 합을 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {
	public static void main(String[] args) throws IOException{
		System.out.println("aa");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCase = Integer.parseInt(br.readLine());
        String num = br.readLine();
        
        int sum = 0;
        for(int i=0; i<numCase; i++){
            sum += num.charAt(i)-'0';
        }
        System.out.print(sum);
        
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.
//		
//		int sum = 0;
//		
//		for(byte value : br.readLine().getBytes()){   <--아래 설명 참조
//			sum += (value - '0');	// 또는 (a-48)
//		}
//		
//		System.out.print(sum);
	}
}

//getBytes()메소드에 관한 자바 API 설명

//이 메소드는 java.lang.string 패키지에 있는 메소드로 따로 import 할 필요 없이 사용할 수 있다.
//설명을 하자면 String (문자열) 에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 메소드다.
//이 때, 변환되는 방법은 Charset 에서 사용되는 인코딩 방식, 즉 UTF-16 인코딩으로 변경되는 값을 따른다.
//* UTF-16 (유니코드)의 앞부분은 아스키코드와 호환되기 때문에 영어 문자 및 숫자는 같다. 
//즉 아스키 코드에서 0 이라는 문자는 48 라는 값이고 이는 UTF-16 에서도 48 이라는 값을 갖는다.

//즉, readLine() 으로 읽어들인 문자를 byte[] 로 변환하여 반환되므로 
//for-each 구문을 통해 문자열의 문자를 하나하나씩 읽어들일 수 있다.




















