package baekjoon02_algoritm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
스택
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
0.5 초 (추가 시간 없음)	256 MB	144420	55196	39773	38.131%

문제
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
입력
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

출력
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
*/
public class No10828 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        MyStack myStack = new MyStack(size);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<size; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            switch(st.nextToken()){
            case "push":
            	myStack.push(Integer.parseInt(st.nextToken())); break;
            case "pop":
            	sb.append(myStack.pop() + "\n"); break;
            case "size":
            	sb.append(myStack.size() + "\n"); break;
            case "empty":
            	sb.append(myStack.empty() + "\n"); break;
            case "top":
            	sb.append(myStack.peek() + "\n"); break;
            }
        }
        
        System.out.print(sb);
    }
}

class MyStack{
    int[] stack;
    int top;
    
    MyStack(int size){
        stack = new int[size];
        top = -1;
    }
    
    public void push(int data) { stack[++top] = data; }
    
    public int pop(){
        if(top == -1) return -1;
        return stack[top--];
    }
    
    public int size() { return top+1; }
    
    public int empty() { 
        if(top == -1) return 1;
        else return 0;
    }
    
    public int peek() {
    	if(top == -1) return -1;
    	return stack[top]; 
    }
}
