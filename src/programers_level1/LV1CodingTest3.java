package programers_level1;

public class LV1CodingTest3 {
    //x만큼 간격이 있는 n개의 숫자
    /*
    정수 X와 자연수 N을 받는다.
    x부터 시작해서 x씩 증가하는 숫자 n개 지니는 리스트 리턴
    -> 단순 등차수열
     */
    //다시 확인해야함 채점 실패
    public static void main(String[] args) {
        Solution3 solution7 = new Solution3();

        System.out.print("첫번째 입출력 확인 : ");
        for(long num : solution7.solution(2, 5)) {
            System.out.print(num+ " ");
        }
        System.out.println();

        System.out.print("두번째 입출력 확인 : ");
        for(long num : solution7.solution(4, 3)) {
            System.out.print(num+ " ");
        }
        System.out.println();

        System.out.print("세번째 입출력 확인 : ");
        for(long num : solution7.solution(-4, 2)) {
            System.out.print(num+ " ");
        }
        System.out.println();
    }

}

class Solution3{

    public long[] solution(int x, int n) {
        long[] answer = {};

        answer = new long[n];
        //x를 n개만큼 반복해야하니 0부터 반복값 n-1까지
        // 등차수열이니 개수만큼 더하면된다 => x와 n의 곱
        for(int i=0; i<n; i++) {
            answer[i] =x*(i+1); //+1말고 i를 1부터 시작해서 i<=n으로 하면 +1 필요없음
        }

        return answer;
    }
}