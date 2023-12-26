package programers_level1;

public class LV1CodingTest11 {
    //문자열을 정수로 바꾸기
    /*
    s의 길이는 1 이상 5이하입니다.
    s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    s는 부호와 숫자로만 이루어져있습니다.
    s는 "0"으로 시작하지 않습니다.
     */
    public static void main (String [] args){

        Solution11 solution11 = new Solution11();
        System.out.println(solution11.solution("1234"));
        System.out.println(solution11.solution("-1234"));
    }

}

class Solution11{

    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

}