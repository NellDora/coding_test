package programers_level1;

public class LV1CodingTest2 {
    //프로그래머스 LV1 짝수와 홀수
    /*
     * 정수 num이 짝수일 경우 Even반환, 홀수인 경우 Odd 반환
     *
     */
    public static void main(String[] args) {
        /*
         * 정수 num이 짝수일 경우 Even반환, 홀수인 경우 Odd 반환
         *
         */
        Solution2 solution = new Solution2();
        System.out.println("첫번 째 입력 값 2는 ="+solution.solution(2));
        System.out.println("첫번 째 입력 값 3은 ="+solution.solution(3));
        System.out.println("첫번 째 입력 값 8은 ="+solution.solution(8));
        System.out.println("첫번 째 입력 값 9는 ="+solution.solution(9));
        System.out.println("첫번 째 입력 값 0은 ="+solution.solution(0));
    }
}

class Solution2{
    public String solution(int num) {
        String answer="";
        answer = num%2==0 ? "Even" :"Odd";
        return answer;
    }
}