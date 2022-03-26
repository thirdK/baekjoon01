package baekjoon02_algoritm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10845 {
	public static void main(String[] args) throws IOException{
		System.out.println("a");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		MyQueue q = new MyQueue();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				q.push(Integer.parseInt(st.nextToken())); break;
			case "pop":
				sb.append(q.pop()+"\n"); break;
			case "size":
				sb.append(q.size() + "\n"); break;
			case "empty":
				sb.append(q.empty() + "\n"); break;
			case "front":
				sb.append(q.front() + "\n"); break;
			case "back":
				sb.append(q.back() + "\n");
			}
		}
		
		System.out.println(sb);
	}
}

class MyQueue {
	class Node{
		int data;
		Node link;
		
		public Node() {}
		public Node(int data) { this.data = data; }
	}
	
	private Node front;
	private Node rear;
	
	public MyQueue() {
		front = new Node();	//포인터로만 사용할것임
		rear = new Node();
	}
	
	void push(int data) {
		Node node = new Node(data);
		if(rear.link != null) {
			rear.link.link = node;
		}
		rear.link = node;
		if(front.link == null) {
			front.link = node;
		}
	}
	
	int pop() {
		if(front.link == null) return -1;
		int tmp = front.link.data;
		front.link = front.link.link;
		if(front.link == null) rear.link = null;
		
		return tmp;
	}
	
	int empty() {
		if(front.link == null) return 1;
		return 0;
	}
	
	int size() {
		if(this.empty() == 1) return 0;
		Node p = front;
		int size = 0;
		while(p.link != null) {
			p = p.link;
			size++;
		}
		
		return size;
	}
	
	int front() {
		if(this.empty() == 1) return -1;
		return front.link.data;
	}
	
	int back() {
		if(this.empty() == 1) return -1;
		return rear.link.data;
	}
	
}
























