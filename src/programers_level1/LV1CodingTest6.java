package programers_level1;

import java.util.*;

public class LV1CodingTest6 {
    //정수 내림차순으로 배치하기
    /*
    함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    예를들어 n이 118372면 873211을 리턴하면 됩니다.
     */
    public static void main(String [] args){
        Solution6 solution6 = new Solution6();
        long test = 118372;
        long result = solution6.solution(test);
        System.out.println(result);

        }



}

class Solution6{

    public long solution(long n) {
        long answer = 0;
        List<Integer> intList =new ArrayList<>();
        String strArr = String.valueOf(n);
        for(int i=0; i< strArr.length(); i++){
            intList.add(Character.getNumericValue(strArr.charAt(i)));
        }
        Collections.sort(intList,Collections.reverseOrder());
        strArr="";
        for(int i : intList)strArr+=String.valueOf(i);
        answer =Long.parseLong(strArr);
        return answer;
    }
}
