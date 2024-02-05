package programers_level0;

public class LV0CodingTest4 {
/*
제곱수 판별하기
문제 설명
어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때,
n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

144	1
976	2
 */
    public static void main(String[] args){
        LV0Solution4 solution4 = new LV0Solution4();
        System.out.println(solution4.solution(144));
        System.out.println(solution4.solution(976));
    }

}

class LV0Solution4{
    public int solution(int n) {
        int answer = 0;
        if(n==(int)Math.sqrt(n)*Math.sqrt(n)) answer=1;
        else answer=2;
        return answer;
    }
}
