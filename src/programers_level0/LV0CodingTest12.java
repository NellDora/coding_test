package programers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV0CodingTest12 {
    /*
    짝수는 싫어요
문제 설명
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100
입출력 예
n	result
10	[1, 3, 5, 7, 9]
15	[1, 3, 5, 7, 9, 11, 13, 15]
     */

    public static void main(String[] args){
        LV0Solution12 solution12 = new LV0Solution12();

    }
}

class LV0Solution12{
    public Integer[] solution(int n) {
        Integer[] answer = {};
        List<Integer> intList = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%2==0) continue;
            intList.add(i);
        }
        Collections.sort(intList);
        answer = intList.toArray(new Integer[0]);

        return answer;
    }
}