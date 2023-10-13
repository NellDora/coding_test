package programers_level2;

import java.util.ArrayList;
import java.util.List;

public class LV2CodingTest2 {
    //올바른 괄호
    /*
     * 1. '('또는 ')'로 이루어진 괄호 S가 주어진다
     * 2. 문자열 s가 올바른 괄호면 true , 올바르지 않으면 false을 반환하는 solution
     * ex)
     * 올바른괄호 : ()()
     * 올바르지 않은 괄호 : )()()(
     *
     *
     * 채점 결과
        정확성: 65.7
        효율성: 15.2
        합계: 80.9 / 100.0
        *
        * [다시 도전해보기]
     */
    public static void main(String[] args) {
        char test1 = '(';
        char test2 = ')';
        System.out.println((int)test1);
        System.out.println((int)test2);


        System.out.println("======================================");

        Solution2 sol = new Solution2();

        String s1 = new String("()()");
        System.out.println("s1의 결과는 = "+sol.solution(s1));

        String s2 = new String("(())()");
        System.out.println("s2의 결과는 = "+sol.solution(s2));

        String s3 = new String(")()(");
        System.out.println("s3의 결과는 = "+sol.solution(s3));

        String s4 = new String("(()(");
        System.out.println("s4의 결과는 = "+sol.solution(s4));
    }


}

/*
 * [생각해보기]
 * 올바른 괄호를 만들려면 아래 조건 3개를 만족하면 된다
 * 1. 첫번째 시작점이 반드시 (이어야한다
 * 2. 마지막 괄호가 반드시 )이여야한다.
 * 3. 임의의 매개변수 N을 0으로 지정하고
 * 	 시작점으로부터 마지막까지 (의 값이 증가할때마다 N이 1씩 증가 할때 도달할때 '(' 0이어야한다
 *		그리고 중간에 -1이 되어서는 안된다
 *
 *    (A)  (((=>3  ))) =>  : N이 연속으로 증가하면 연속한 만큼 감소해야한다
 *    (B)  ( ( ) ( ) ) => 1 2 1 2 1 0  : N이
 *    (C)  ( ( ( () () ) () ) ) => 1 2 3 4 3 4 3 2 3 2 1 0
 * 위 3가지 조건을 만족하면 된다.
 * [3번]을 좀더 생각 하자만 ((( 의 값은 3
 */

class Solution2{
    boolean solution(String s) {
        boolean answer = true;

        //사전작업 1. 입력받은 ())()의 길이 구하기
        int pos = s.length();

        //사전작업 2. ()()() 따로 담을 배열 구현
        char[] arr = new char[s.length()];

        //사전작업 3. '(' 카운터용 숫자 선언
        int count = 0;

        //사전작업 4. String 잘라내기
        for(int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        //---------------------------[테스트 출력]------------------------
        for(char c : arr) {
            System.out.println(c);
        }
        //---------------------------[테스트 출력 끝]--------------------------

        // 조건 1. 첫번째 값이 '('이 아니면 올바르지 않은 괄호임
        // 조건 2. 마지막 값이 ')'이 아니면 올바르지 않은 괄호임
        if(arr[0]!='('   ||  arr[pos-1]!=')') {
            answer=false;
        }else {
            count+=1;
            //첫번째 입력, 마지막 입력이 정상일 때 마지막 숫자까지 반복

            for(int i=1; i<pos; i++) {
                //만약 값이 '('이라면  +1 카운트
                if(arr[i]=='(') {
                    count+=1;

                    //만약 값이 ')'이라면 -1 카운트
                }else if(arr[i]==')') {
                    count-=1;
                }

                //구간별로 결과에서 총 카운트 값이 -1이 되면  false
                if(count==-1) {
                    answer=false;
                }
            }
        }


        return answer;

    }

}
