package programers_level1;

import java.util.ArrayList;
import java.util.List;

public class LV1CodingTest5 {
    //자연수 뒤집어 배열로 만들기
    /*
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열의 형태로 리턴
     * ex) n이 12345이면
     * 5,4,3,2,1를 리턴
     */
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        long n = 113355;
        int[] numList = s.solution(n);
        for(int num : numList){
            System.out.println(num);
        }
    }

}

class Solution5{

    public int[] solution(long n) {
        int[] answer = {};

        //숫자를 뒤집어서 입력 받을 배열리스트 선언
        List<Integer> temp = new ArrayList<>();


        while(n!=0) {
            //나머지를 넣으면 뒤집을 수 있음
            temp.add((int)(n%10));
            n = n/10; //(n /=10;)으로 표현 가능하지만 그냥 이렇게 해둠
        }

        //answer 배열 길어 선언
        answer = new int[temp.size()];

        //answer에 집어넣는 작업
        for(int i=0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}