package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1546 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int numSub = Integer.parseInt(br.readLine());
        int[] scores= new int[numSub];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<numSub; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(scores);
        double total=0;
        for(int i=0; i<numSub; i++){
            total += scores[i]*100.0/scores[numSub-1];
        }
        sb.append(total/numSub);
        System.out.print(sb);
	}
}
