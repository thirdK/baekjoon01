package baekjoon01;

//배열문제
//대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
//당신은 그들에게 슬픈 진실을 알려줘야 한다.
//
//입력
//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 
//첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 
//100보다 작거나 같은 정수이다.
//
//출력
//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class No4344 {
	public static void main(String[] args) throws IOException {
		System.out.println("aa");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		DecimalFormat form = new DecimalFormat("#.###");
		int numCase = Integer.parseInt(br.readLine());
		String[] info = new String[numCase];
		for (int i = 0; i < numCase; i++) {
			info[i] = br.readLine();
		}
		
		for(int i=0; i<numCase; i++){
            StringTokenizer st = new StringTokenizer(info[i]);
            int students = Integer.parseInt(st.nextToken());
            int[] scores = new int[students];
            double total = 0;
            
            for(int j=0; j<students; j++) {
            	scores[j] = Integer.parseInt(st.nextToken());
            	total += scores[j];
            }
            double avg = total/students;
            int cnt = 0;
            for(int j=0; j<students; j++) {
            	if (scores[j] > avg) cnt++;
            }
            System.out.printf("%.3f%%\n", (double)cnt/students*100);
        }
		System.out.println(sb);
	}
}
