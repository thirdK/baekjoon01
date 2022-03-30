package baekjoon02_algoritm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//덱
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//0.5 초 (추가 시간 없음)	256 MB	41758	22718	19235	56.284%
//문제
//정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//명령은 총 여덟 가지이다.
//
//push_front X: 정수 X를 덱의 앞에 넣는다.
//push_back X: 정수 X를 덱의 뒤에 넣는다.
//pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 덱에 들어있는 정수의 개수를 출력한다.
//empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
//front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//입력
//첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
//주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
//
//출력
//출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

public class No10866 {
	public static void main(String[] args) throws IOException{
		System.out.println('a');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyDeque d = new MyDeque();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push_front":
                    d.push_front(Integer.parseInt(st.nextToken())); break;
                case "push_back":
                    d.push_back(Integer.parseInt(st.nextToken())); break;
                case "pop_front":
                    sb.append(d.pop_front() + "\n"); break;
                case "pop_back":
                    sb.append(d.pop_back() + "\n"); break;
                case "size":
                    sb.append(d.size() + "\n"); break;
                case "empty":
                    sb.append(d.empty() + "\n"); break;
                case "front":
                    sb.append(d.front() + "\n"); break;
                case "back":
                    sb.append(d.back() + "\n"); break;
            }
        }
        System.out.print(sb);
    }
}

class MyDeque {
    class Node{
        int data;
        Node left;	//양방향으로 링크필드
        Node right;
        
        Node(){}
        Node(int data){ this.data = data; }
    }
    Node front;    //포인터로 사용함
    Node back;
    int size;	//사이즈는 탐색하기 싫어서 미리 만들어서 계산
    
    void push_front(int data){
        Node node = new Node(data);
        size++;
        if(front == null) {
            front = node;
            back = node;
            return;
        }
        front.left = node;
        node.right = front;
        front = node;
    }
    
    void push_back(int data){
        Node node = new Node(data);
        size++;
        if(back == null) {
            front = node;
            back = node;
            return;
        }
        back.right = node;
        node.left = back;
        back = node;
    }
    
    int pop_front(){
        if(front == null) return -1;	//공백덱은 -1반환
        size--;
        int tmp = front.data;
        if(front.right == null) front = null; //뒤쪽에 노드가 없으면 빈 덱
        else {
        	front = front.right;
        	front.left = null;	//좌측노드와 연결 끊어줌
        }
        
        if(front == null) back = null;	//pop이후 빈 덱인지 확인
        return tmp;
    }
    
    int pop_back(){
        if(back == null) return -1;
        size--;
        int tmp = back.data;
        if(back.left == null) back = null;
        else {
        	back = back.left;
        	back.right = null;
        }
        
        if(back == null) front = null;
        return tmp;
    }
    
    int size(){ return this.size; }
    int empty(){
        if(size == 0) return 1;
        return 0;
    }
    
    int front(){
        if(front == null) return -1;
        return front.data;
    }
    
    int back() {
        if(back == null) return -1;
        return back.data;
    }
}

























