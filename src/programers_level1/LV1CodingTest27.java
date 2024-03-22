package programers_level1;

public class LV1CodingTest27 {
    /*
    x만큼 간격이 있는 n개의 숫자

문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
입출력 예
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]
     */

    public static void main(String [] args){
        LV1Solution27 solution27 = new LV1Solution27();
        solution27.solution(2,5);
    }
}

class LV1Solution27{
    public long[] solution(int x, int n) {
        long[] answer = {};

        long tmp = x;
        answer = new long[n];

        for(int i=0; i<n; i++) {
            answer[i] =tmp*(i+1);
        }

        return answer;
    }
}