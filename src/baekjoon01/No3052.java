package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] isArr = new boolean[42];
		int cnt = 0;

		for (int i = 0; i < 10; i++) {
			int index = Integer.parseInt(br.readLine()) % 42;
			isArr[index] = true;
		}

		for (boolean i : isArr) {
			if (i)
				cnt++;
		}
		System.out.print(cnt);
	}
}
