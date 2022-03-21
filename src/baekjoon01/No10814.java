package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
정렬문제
온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 
이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)

둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 
나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 
길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.

출력
첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 
나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
 */

//N을 입력받는다.
//N만큼 회원 정보를 입력받는다. -> 나이 이름
//정렬하여 출력한다.
//		1. 나이
//		2. 가입 순서	-> 어차피 입력받은대로 저장하면 가입순서는 해결됨

//정보를 어떤 자료형으로 받을 것인가? -> 문자열 / 객체

class Info{
	String name;
	int age;
	
	public Info(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return age + " " + name + "\n";
	}
}
public class No10814 {
	public static void main(String[] args) throws IOException{
		System.out.println('i');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Info[] arr = new Info[len];
		
		for(int i=0; i<len; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new Info(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		Arrays.stream(arr)
		.sorted((o1, o2) -> {return o1.age-o2.age;})
		.forEach(i -> sb.append(i.toString()));
		
		System.out.print(sb);
		
		
		//======================================================================
		//클래스 사용하지 않고 다른방식
//		Scanner sc = new Scanner(System.in);
//		StringBuilder[] p = new StringBuilder[201]; //입력되는 나이의 범위 1~200
//		for(int i=0; i<p.length; i++) {
//			p[i] = new StringBuilder();
//		}
//		for(int i=0; i<len; i++) {
//			int age = sc.nextInt();
//			String name = sc.next();
//			//카운팅 정렬 : 나이를 index로 하여 해당 배열에 나이와 이름을 append
//			p[age].append(age).append(' ').append(name).append('\n');
//		}
//		
//		StringBuilder r = new StringBuilder();
//		for(StringBuilder val : p) {
//			r.append(val);
//		}
//		
//		System.out.println(r);
		//같은 나이여도 해당 문자열에 이어서 써지므로 상관없다 ->출력 결과물만 나오면 되므로 무관하다
	}
}





















 