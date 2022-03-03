package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
    	System.out.println("a");
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
