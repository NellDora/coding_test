package programers_level1;

import java.util.ArrayList;
import java.util.List;

public class LV1CodingTest15 {
    /*
문자열 내 p와 y의 개수
문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.

"pPoooyY"	true
"Pyy"	false
     */

    public static void main(String [] args){
        Solution15 solution15 = new Solution15();
        System.out.println(solution15.solution("pPoooyY"));
        System.out.println(solution15.solution("Pyy"));
    }

}

class Solution15{
    public boolean solution(String s) {
        boolean answer = false;
        int countp = 0;
        int county=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p' ||s.charAt(i)=='P'){
                countp++;
            }else if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
                county++;
            }
        }
        if(county==countp){
            answer=true;
        }else if(county!=countp){
            answer=false;
        }

        return answer;
    }
}