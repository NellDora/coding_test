package programers_level1;

public class LV1CodingTest12 {
    /*
    [수박수박수박수박수박수?]
    길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
     */

    public static void main(String[]args){
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.solution(4));
        System.out.println(solution12.solution(17));
    }
}

class Solution12{
    public String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++) {
            if (i % 2 == 1) answer += "수";
            else answer += "박";
        }
        return answer;
    }
}