package programers_level1;

public class LV1CodingTest8 {
    //[하샤드의 수]
    /*
    양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
     */

    public static void main (String [] args){
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.solution(10));
        System.out.println(solution8.solution(12));
        System.out.println(solution8.solution(11));
        System.out.println(solution8.solution(13));
    }
}

class Solution8{

    public boolean solution(int x) {
        boolean answer = true;
        //각 자리수를 합하기 위한 문자열 변환
        String strX =  String.valueOf(x);
        //각 자리수의 합 구하기
        int posSum =0;
        for(int i=0; i<strX.length(); i++){
            posSum += Character.getNumericValue(strX.charAt(i));
        }
        answer = (x%posSum==0) ?true:false;


        return answer;
    }


}
