package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//기본수학1 문제

public class No10250 {
	public static void main(String[] args) throws IOException {
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int result = 0;
        
        for(int i=0; i<numCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            if(n%h==0) result = h*100 + n/h;
            else result = n%h*100 + n/h+1;
            
            sb.append(result).append('\n');
//            if(n%h == 0) sb.append(h);
//            else sb.append(n%h);
//            
//            if(n/h+1 < 10) sb.append('0');
//            
//            if(n%h == 0) sb.append(n/h).append('\n');
//            else sb.append(n/h+1).append('\n');
        }
        System.out.println(sb);
	}
}
