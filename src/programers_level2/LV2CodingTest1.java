package programers_level2;

import java.util.ArrayList;
import java.util.List;

public class LV2CodingTest1 {
    //LEVEL2 최대값과 최소 값
    /*
     * 문자열 s에는 공백으로 구분된 숫자들이 저장
     * str에 나타나는 숫자 중 최소값, 최대값을 차즌ㄴ다
     * (최소값) (최대값) 햐애의 문자열로 반환하는 함수 solution 완성하시오
     *
     * 채점 결과
        정확성: 100.0
        합계: 100.0 / 100.0
     */
    static String str = "1 2 3 4";
    static String str2 = "-1 -2 -3 -4";
    static String str3 = "-1 -1";
    public static void main(String[] args) {

        Solution1 sol = new Solution1();
        System.out.print("최종 출력 값 : ");
        System.out.println(sol.solution(str));
        System.out.println();
        System.out.println("=============================");
        System.out.println();

        System.out.print("최종 출력 값 : ");
        System.out.println(sol.solution(str2));
        System.out.println();
        System.out.println("=============================");
        System.out.println();

        System.out.print("최종 출력 값 : ");
        System.out.println(sol.solution(str3));
        System.out.println();
        System.out.println("=============================");
        System.out.println();

    }

}


//제한 조건 String s에는 둘 이상의 정수가 공백으로 구분되어 있다
// -> 공백을 기준으로다음 공백이 나올때까지 숫자를 받아서 파싱해야한다
//여러개가 들어 갈 수 있으니 split 사용
class Solution1{

    public String solution(String s) {
        String answer = "";

        // 문자열을 공백 기준으로 모두 잘라내서 배열로 받기
        String[] strNumber = s.split(" ");

        //다시 숫자로 받아
        List<Integer> numList = new ArrayList<>();

        for( String num : strNumber) {
            numList.add(Integer.parseInt(num));
        }

        Integer min= null;
        Integer max = null;

        for(Integer num : numList) {
            if(min==null&&max==null) {
                min= num;
                max= num;
            }
            if(num<min) {
                min=num;
            }

            if(num>max) {
                max = num;
            }

        }

        answer +=min+" "+ max;

        return answer;
    }
}
