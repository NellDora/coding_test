package programers_level1;

public class LV1CodingTest4 {
    //나머지가 1이 되는 수 찾기
    /*
     * 자연수 n이 매개변수로 주어진다.
     * n을 X로 나눈 ㅏ머지가 1이 되도록 하는 가장 작은 자연수 X
     */
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        System.out.println("10의 값은 = "+solution.solution(10));
        System.out.println("12의 값은 = "+solution.solution(12));
    }

}

class Solution4{
    public int solution(int n) {
        int answer = 0;
        //1을 제외한 최소 약수 (임시) temp를 2로 선언
        int temp=2;
        //일단 나머지가 1이 되어야하니까 입력값 n에서 -1이 되어야한다.
        //나머지 값이 1이 되어야한다 아닐 때에는 -> 약수 +1 (나머지가 1이 될때까지)
        while((n)%temp!=1) {

            temp+=1;
        }
        answer = temp;
        return answer;
    }
}
