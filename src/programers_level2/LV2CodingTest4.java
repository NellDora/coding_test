package programers_level2;

public class LV2CodingTest4 {
    //피보나치 수
    /*
     * 피보나치 수란
     * F(0) = 0 , F(1) = 1 이상의 n에 대해서
     * F(n) = F(N01) + F(n-1)가 적용되는 형태
     *
     * ex)
     * F(2) = F(0) + F(1) = 0 + 1 = 1
     * F(3) = F(1) + F(2) = 1 + 1 = 2
     * F(4) = F(2) + F(3) = 1 + 2 = 3
     * F(5) = F(3) + F(4) = 2 + 3 = 5
     *
     * 2이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴
     */
    public static void main(String[] args) {

    Solution4 solution = new Solution4();

    System.out.println(solution.solution(3));
    System.out.println(solution.solution(4));
    System.out.println(solution.solution(5));
    }

}

// [생각하기]
// 위에 적혀있는 1234567로 나눈다는 그냥 의미없는 조건 -> 피보나치만 구현하면 된다.
// 가장 중요한 부분 자리수를 미리 선언 할 수 없으니 배열에 값이 입력되면 다음 배열 자체가
// 1. F(0)과 F(1)의 값만 고정시키면 되며 F(2)부터는 식을 적용할 수 있음
class Solution4{

    //처음 코드였던 것
//    public int solution(int n) {
//        int answer = 0;
//
//        //0번부터 시작하니까 n번째가 될려면 n+1을 입력해야함
//        int[] fibonacci = new int[n+1];
//        fibonacci[0] = 0;
//        fibonacci[1] = 1;
//        Integer tmp = null;
//
//
//        for (int i = 2; i <=n; i++) {
//            //위 조건 처럼 N = N-1 + N-2 그대로 적용
//            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//            answer = fibonacci[i]% 1234567;
//
//            System.out.println(i+"일떄의 피보나치 값 : "+fibonacci[i] );
//
//        }
//        System.out.println("피보나치 총 수 = " + tmp);
//
//        answer = tmp % 1234567;
//
//        System.out.println("최종 답안 = " + answer);
//        int x = 2;
//       return answer;
//    }

    //최종 결과인데 위에랑 차이가 나는데 왜 최종 결과를 이렇게 했는가? 1~6에서는 통과 되었지만 그 이후 7~14 통과 되지 않았음
    // 스텍 오버플로우의 발생으로 통과 실패
    // 스텍 오버플로우가 발생하는 것까지 계산을 해야해서 아래와 같이 수정하게 되었음
    public int solution(int n) {
        int answer = 0;

        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <=n; i++) {

            fibonacci[i] = fibonacci[i - 1]%1234567 + fibonacci[i - 2]%1234567;
            answer = fibonacci[i] ;
        }

        return answer;
    }

    //사전 준비


}
