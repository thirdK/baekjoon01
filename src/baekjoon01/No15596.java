package baekjoon01;

//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
//작성해야 하는 함수는 다음과 같다.

//Java: long sum(int[] a); (클래스 이름: Test)
//a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//리턴값: a에 포함되어 있는 정수 n개의 합

class Test01 {
    long sum(int[] a) {
        long ans = 0;
        for(int i : a){
            ans += i;
        }
        return ans;
    }
}
//Arrays.stream(a).sum(); 가 안되는 이유는 a[] 은 int이므로 
//Arrays.stream(a)의 타입은 IntStream이며 IntStream.sum()은 연산을 Int로 하게됨
//이 문제는 결과로 나오는 최대값이 3,000,000,000,000이므로
//int로는 제대로된 결과가 나올 수 없으며 이미 망가진 data를 long으로 바꿔봤자 결과는 틀렸다고 나온다.

public class No15596 {

}
