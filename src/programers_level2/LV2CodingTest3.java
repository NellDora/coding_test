package programers_level2;

import java.util.Arrays;
import java.util.Collections;

public class LV2CodingTest3 {
    //[최소값 만들기]

    /*
     * 길이가 같은 배열 A,B 두개가 있다.
     * 각 배열은 자연수로 만들어져 있다.
     * 배열 A,B에서 각각 한개의 숫자를 뽑아서 두 수를 곱한다.
     * 배열의 길이만큼 곱함
     * 이때 최종적으로 누적된 값이 최소가 되도로 만드는 것이 이번 문제의 핵심
     * =??
     * 한번 뽑은 값은 더이상 뽑을 수 없다.
     *
     *
     * 채점 결과
        정확성: 69.6
        효율성: 30.4
        합계: 100.0 / 100.0
     */
    public static void main(String[] args) {

        int [] A;
        int [] B;

        A = new int[] {1,4,2};
        B = new int[] {5,4,4};

        Solution12 sol = new Solution12();
        System.out.println("solution을 이용한 진짜 최종 출력 = "+sol.solution(A, B));

        A = new int[] {1,2};
        B = new int[] {3,4};
        System.out.println("solution을 이용한 진짜 최종 출력 = "+sol.solution(A, B));

        //정상동작
    }

}
/*
 *입출력 예시
 * 배열 A [1, 4, 2] / 배열 B [5, 4, 4]  : 최종값 : 29
 * 배열 A [1, 2] / 배열 B [3, 4] : 최종 값 : 10
 *
 * [생각해볼 것]
 * 최종값이 가장 작은수가 될려면 어떻게 해야되는가?
 *  -> 각 배열 내에서 가장 큰 수가 가장 작은 수와 곱해져야 최종 값이 작아진다.
 *  -> ex) 배열 A : [1,3,5,7,9] / 배열 B : [2, 4, 6, 8, 10]이라고 생각하면
 *  	A에서 가장 큰 값 : 9  / B에서 가장 작은 값  : 2 두개가 곱해져야 가장 숫자가 작아진다.
 *  	마찬가지로 A에서 가장 작은 값 1 / B에서 가장 큰 값 : 10이 곱해져야 가장 숫자가 작아진다는 걸 알 수 있음
 *
 *  [해결방안]
 * 	1. 각 배열의 값을 다시 오름차순으로 재배열 한다.
 *  2. 각 배열 A는 내림차순으로 / B는 오름차순으로 서로 곱한다 혹은 A오름차순으로 B는 내림 차순으로 서로 곱한다.
 *  => 그러면 가장 숫자가 작아짐
 *
 *   컬랙션 프레임워크를 사용해서 간단하게 재배열 하는 것이 좋아보임
 */

class Solution12{

    public int solution(int[] A, int[] B ) {
        int answer = 0;


        //배열 A의 오름차순으로 정렬
        Arrays.sort(A);

        //Collection 프레임워크를 사용하기 위해 원시함수에서 래퍼함수로 변경
        Integer[] refferB = new Integer[B.length];

        for(int i=0; i<B.length; i++) {
            refferB[i] = B[i];
        }

        //배열 B의 내림차순 정렬 적용
        Arrays.sort(refferB, Collections.reverseOrder());


        //A는 오름차순 / B는 내림차순배열로 각각 최소값, 최대값을 서로 곱해서 반환값에 합을 누적시킨다.
        for(int i=0; i<A.length; i++) {
            answer +=A[i]*refferB[i];
        }

        System.out.println("최종 출력 값 = " + answer);

        return answer;
    }
}