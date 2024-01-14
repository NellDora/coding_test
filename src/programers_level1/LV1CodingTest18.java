package programers_level1;

public class LV1CodingTest18 {
    /*
    약수의 개수와 덧셈
    문제 설명
    두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
    약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
     */

    public static void main (String [] args){
        Solution18 solution18 = new Solution18();
        System.out.println(solution18.solution(13,17));
        System.out.println(solution18.solution(24,27));
    }
}

class Solution18 {
    public int solution(int left, int right) {
        int answer = 0;
        //약수인걸 먼저 찾음
        for(int i=left; i<=right; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count%2==0) answer += i;
            else answer -=i;
        }

        return answer;
    }
}