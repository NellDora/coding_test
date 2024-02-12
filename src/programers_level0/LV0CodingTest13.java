package programers_level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LV0CodingTest13 {
    /*
    모음 제거
문제 설명
영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
my_string은 소문자와 공백으로 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
입출력 예
my_string	result
"bus"	"bs"
"nice to meet you"	"nc t mt y"
     */
    public static void main(String[] args){
        LV0Solution13 solution13 = new LV0Solution13();
        System.out.println(solution13.solution("bus"));
        System.out.println(solution13.solution("nice to meet you"));
    }
}

class LV0Solution13{
    public String solution(String my_string) {
        String answer = "";
        List<Character> myStrList =  new ArrayList<>();

        for(int i=0; i<my_string.length(); i++){
            myStrList.add(my_string.charAt(i));
        }


        List<Character> removeList = new ArrayList<>();
        for(int i=0; i<myStrList.size(); i++){
            if(myStrList.get(i).equals('a')||myStrList.get(i).equals('e')
                    ||myStrList.get(i).equals('i')||myStrList.get(i).equals('o')||myStrList.get(i).equals('u')){
                removeList.add(myStrList.get(i));
            }
        }
        myStrList.removeAll(removeList);
        for(char ch : myStrList){
            answer += ch;
        }

        return answer;
    }

}
