package programers_level1;

public class LV1CodingTest10 {
    public static void main (String [] args){
        Solution10 solution10 = new Solution10();
        System.out.println(solution10.solution("abcde"));
        System.out.println(solution10.solution("qwer"));
    }

}

class Solution10{
    public String solution(String s) {
        String answer = "";

        if(s.length()%2==1)answer += s.charAt(s.length()/2);
        else{
            answer +=s.charAt((s.length()/2)-1);
            answer +=s.charAt(s.length()/2);
        }

        return answer;
    }
}
