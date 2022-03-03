package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println("d");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int numSub = Integer.parseInt(br.readLine());
        int[] scores= new int[numSub];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<numSub; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(scores);
        int total=0;
        for(int i=0; i<numSub; i++){
            total += scores[i]*100.0/scores[numSub-1];
        }
        sb.append((double)total/numSub);
        System.out.print(sb);
	}
}
