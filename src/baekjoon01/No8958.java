package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//배열문제
//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, 
//X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 
//연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
//길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
//
//출력
//각 테스트 케이스마다 점수를 출력한다.

public class No8958 {
	public static void main(String[] args) throws IOException {
		System.out.println("a");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int numCase = Integer.parseInt(br.readLine());
		String[] arr = new String[numCase];

		for (int i = 0; i < numCase; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < numCase; i++) {
			int score = 0;
			int point = 0;

			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					score += ++point; // 1점부터 연속으로 O가 나오면 증가됨
					continue; // 맞추면 point가 증가된 상태로 반복
				}
				point = 0;// 틀리면 point를 다시 0으로 초기화
			}
			sb.append(score).append("\n"); // stringBuilder에 저장
		}
		System.out.println(sb);

// 배열사용 안함
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//        int numCase = Integer.parseInt(br.readLine()); //받을 case 수
//        
//        for(int i=0; i<numCase; i++){
//        	int score = 0; //case별로 점수는 0점부터 시작됨
//        	int point = 0;	//점수가 증가되어도 다음문제에서는 초기화
//            String ox = br.readLine();
//            
//            for(int j=0; j<ox.length(); j++){
//                if(ox.charAt(j) == 'O'){
//                    score += ++point; //1점부터 연속으로 O가 나오면 증가됨
//                    continue; //맞추면 point가 증가된 상태로 반복
//                }
//                point = 0;//틀리면 point를 다시 0으로 초기화
//            }
//            sb.append(score).append("\n"); //stringBuilder에 저장
//        }
//        System.out.println(sb);
	}
}
