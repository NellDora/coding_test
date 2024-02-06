package programers_level0;

public class LV0CodingTest6 {
    /*
    369게임
문제 설명
머쓱이는 친구들과 369게임을 하고 있습니다.
369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
     */

    public static void main(String[] args){
        LV0Solution6 solution6 = new LV0Solution6();
        System.out.println(solution6.solution(3));
        System.out.println(solution6.solution(29423));
    }
}

class LV0Solution6{
    public int solution(int order) {
        int answer = 0;
        String strOrder= String.valueOf(order); //order 전체를 String 변환
        for(int i=0; i<strOrder.length(); i++) { //strOrder 1개씩 반복
            if (strOrder.charAt(i) == '3' || strOrder.charAt(i) == '6' || strOrder.charAt(i) == '9') {
                //charAt으로 1개씩 비교 후 3,6,9이면 answer +1
                answer++;
            }
        }
        return answer;
    }
}