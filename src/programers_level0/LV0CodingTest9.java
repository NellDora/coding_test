package programers_level0;

public class LV0CodingTest9 {
/*
제출 내역
문제 설명
머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.

제한사항
10 ≤ price ≤ 1,000,000
price는 10원 단위로(1의 자리가 0) 주어집니다.
소수점 이하를 버린 정수를 return합니다.
입출력 예
price	result
150,000	142,500
580,000	464,000
 */

    public static void main(String[] args){
        LV0Solution9 solution9 = new LV0Solution9();
        System.out.println(solution9.solution(150000));
        System.out.println(solution9.solution(580000));
    }
}

class LV0Solution9{
    public int solution(int price) {
        int answer = 0;
        if(price>=500000){
            answer = (int)(Math.floor(price*0.8));
        }else if(price>=300000){
            answer = (int)(Math.floor(price*0.9));
        }else if(price>=100000){
            answer = (int)(Math.floor(price*0.95));
        }else{
            answer = price;
        }
        return answer;
    }
}
