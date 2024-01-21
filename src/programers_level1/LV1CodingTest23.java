package programers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV1CodingTest23 {
    /*
    문자열 내림차순으로 배치하기
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
Zbcdefg"	"gfedcbZ"
     */
    public static void main(String [] args){

        Solution23 solution23 = new Solution23();
        System.out.println(solution23.solution("Zbcdefg"));
    }

}

class Solution23{
    public String solution(String s) {
        String answer = "";
        List<Integer> chArr = new ArrayList();
        for(int i=0; i<s.length(); i++){
            chArr.add((int)s.charAt(i));
        }
        Collections.sort(chArr,Collections.reverseOrder());
        for(int j: chArr){
            answer+=(char)j;
        }
        return answer;
    }
}
