package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//기초수학1 문제
//무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
//
//1/1	1/2	1/3	1/4	1/5	…
//2/1	2/2	2/3	2/4	…	…
//3/1	3/2	3/3	…	…	…
//4/1	4/2	…	…	…	…
//5/1	…	…	…	…	…
//…	…	…	…	…	…

//이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 
//지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
//
//X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
//
//출력
//첫째 줄에 분수를 출력한다.


//분수 i/j 가 있을때 대각선 칸 수 k=1
//i=k, j=1
//i--/j++  i는 1까지/j는 k까지 그리고 k++
//주어진 시간이 추가시간 없는 0.5초라서 반복문으로 X번반복은 힘들듯함

//총 분수 수      1 -> 3 -> 6 -> 10 -> 15 -> 21
//k == 증가량  1 -> 2 -> 3 ->  4 ->  5 ->  6

//분수가 지그재그로 순서를 가지게됨 칸의 수(k)로 기준을 나눠보면
//홀수 : 우상단방향  / 짝수 : 좌하단방향  --> 표를 보면 그냥 i,j의 순서만 바꾸면 될듯하다.

public class No1193 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        int numLoop = Integer.parseInt(br.readLine());
        int total=0, k=0;
        
        while(total < numLoop){ //우선 찾으려는 값 근처지점을 k을 통해 찾는다.
            total += ++k;
        }
        total -= k;	//마지막 k는 제외시킨다.(해당 k범위 내에 target이 존재하므로)
        
        for(int i=k,j=1 ; i>=1 ; i--,j++){ 
            total++;
            if(total==numLoop){ //일치하는 순서를 찾으면
                if(k%2!=0) sb.append(i).append('/').append(j); //k의 홀/짝 여부에따라 결과가 나옴
        		else sb.append(j).append('/').append(i);
                break;
            }
        }
        System.out.print(sb);        
	}
}

























