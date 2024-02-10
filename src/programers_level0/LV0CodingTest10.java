package programers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV0CodingTest10 {
    /*
    중앙값 구하기
제출 내역
문제 설명
중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
[1, 2, 7, 10, 11]	7
[9, -1, 0]	0
     */
    public static void main(String[] args){
        LV0Solution10 solution10 = new LV0Solution10();
        System.out.println(solution10.solution(new int[]{1,2,7,10,11}));
        System.out.println(solution10.solution(new int[]{9,-1,0}));
    }
}

class LV0Solution10{
    public int solution(int[] array) {
        int answer = 0;

        int pos = (int)Math.floor(array.length/2);
        Arrays.sort(array);
        answer = array[pos];

        return answer;
    }
}
