package programers_level0;

public class LV0CodingTest37 {
/*
피자 나눠 먹기 (1)
문제 설명
머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

제한사항
1 ≤ n ≤ 100
입출력 예
n	result
7	1
1	1
15	3
입출력 예 설명
입출력 예 #1

7명이 최소 한 조각씩 먹기 위해서 최소 1판이 필요합니다.
입출력 예 #2

1명은 최소 한 조각을 먹기 위해 1판이 필요합니다.
입출력 예 #3

15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.
 */

    public static void main(String[] args){
        LV0Solution37 solution37 = new LV0Solution37();
        System.out.println(solution37.solution(7));
        System.out.println(solution37.solution(1));
        System.out.println(solution37.solution(15));
    }
}

class LV0Solution37{
    public int solution(int n) {
        int answer = 0;
        double tmp = n;
        answer = (int)Math.ceil(tmp/7);
        if(answer ==0){
            answer =1;
        }
        return answer;
    }
}
