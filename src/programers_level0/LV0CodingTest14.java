package programers_level0;

public class LV0CodingTest14 {
    /*
    자릿수 더하기
문제 설명
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

제한사항
0 ≤ n ≤ 1,000,000
입출력 예
n	result
1234	10
930211	16
     */
    public static void main(String[] args){
        LV0Solution14 solution14 = new LV0Solution14();
        System.out.println(solution14.solution(1234));
        System.out.println(solution14.solution(930211));
    }
}

class LV0Solution14{
    public int solution(int n) {
        int answer = 0;
        String strNum = String.valueOf(n);

        for(int i=0; i<strNum.length(); i++){
            answer+=Character.getNumericValue(strNum.charAt(i));
        }
        return answer;
    }
}
