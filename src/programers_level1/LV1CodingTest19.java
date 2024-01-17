package programers_level1;

public class LV1CodingTest19 {
    /*
    정수 제곱근 판별
    문제 설명
    임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
     */

    public static void main( String[] args){
        Solution19 solution19 = new Solution19();
        System.out.println(solution19.solution(121));
        System.out.println(solution19.solution(3));
    }
}

class Solution19{
    public long solution(long n) {
        long answer = 0;
        long sqrtN = (long)Math.sqrt(n);
        if((sqrtN*sqrtN)==n){
            answer = (sqrtN+1)*(sqrtN+1);
        }else{
            answer=-1;
        }

        return answer;
    }
}
