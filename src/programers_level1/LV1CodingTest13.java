package programers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LV1CodingTest13 {

    /* 없는 숫자 더하기
    0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
    numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
     */
    public static void main(String[] args){
        Solution13 solution13 = new Solution13();



    }
}
//이게 맞나?
class Solution13 {
    public int solution(int[] numbers) {
        int answer = -1;
        //일단 0부터 9까지의 값은 전부 꺼내놔야하는듯
        int[] tmp = {0,1,2,3,4,5,6,7,8,9};

        //ArrayList에 넣어서 stream으로 매칭시켜서 빼야할 듯?
        return answer;
    }
}