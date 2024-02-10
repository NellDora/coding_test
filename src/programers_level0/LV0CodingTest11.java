package programers_level0;

public class LV0CodingTest11 {
    /*
    가위 바위 보
제출 내역
문제 설명
가위는 2 바위는 0 보는 5로 표현합니다.
가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
     */

    public static void main (String [] args){
        LV0Solution11 solution11 = new LV0Solution11();
        System.out.println(solution11.solution("2"));
        System.out.println(solution11.solution("205"));
    }
}

class LV0Solution11{
    public String solution(String rsp) {
        String answer = "";

        for(int i=0; i<rsp.length(); i++){
            switch (rsp.charAt(i)){
                case '0':
                    answer+="5";
                    break;
                case '2':
                    answer+='0';
                    break;
                case '5':
                    answer+='2';
                    break;
            }
        }

        return answer;
    }
}
