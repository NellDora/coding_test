package programers_level0;

public class LV0CodingTest5 {
    /*
    아이스 아메리카노
문제 설명
머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

입출력 예
money	result
5,500	[1, 0]
15,000	[2, 4000]
     */
    public static void main(String [] args){
        LV0Solution5 solution5 = new LV0Solution5();
        System.out.println(solution5.solution(5500)[0]+", "+solution5.solution(5500)[1]);
        System.out.println(solution5.solution(15000)[0]+", "+solution5.solution(15000)[1]);
    }
}

class LV0Solution5{
    public int[] solution(int money) {
        int[] answer = {};
        int coffee =0;
        while(money>=5500){
            money-=5500;
            coffee++;
        }
        answer = new int[]{coffee,money};
        return answer;
    }
}