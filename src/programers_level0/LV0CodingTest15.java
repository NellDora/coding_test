package programers_level0;

/*
flag에 따라 다른 값 반환하기

문제 설명
두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
 */

public class LV0CodingTest15 {

    public static void main(String []args) {
        LV0Solution15 solution15 = new LV0Solution15();
        System.out.println(solution15.solution(-4,7,true));
        System.out.println(solution15.solution(-4,7,false));
    }

}

class LV0Solution15{
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag==true) answer = a+b;
        else answer = a-b;
        return answer;
    }
}
