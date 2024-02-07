package programers_level0;

public class LV0CodingTest7 {
    /*
    문자열 뒤집기
문제 설명
문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

입출력 예
my_string	return
"jaron"	"noraj"
"bread"	"daerb"
     */
    public static void main( String[] args){
        LV0Solution7 solution7 = new LV0Solution7();
        System.out.println(solution7.solution("jaron"));
        System.out.println(solution7.solution("bread"));
    }
}

class LV0Solution7{
    public String solution(String my_string) {
        String answer = "";
        for(int i= my_string.length()-1; i>=0; i--){
            answer +=my_string.charAt(i);
        }

        return answer;
    }
}
