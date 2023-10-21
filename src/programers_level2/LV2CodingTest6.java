package programers_level2;

import java.lang.reflect.Array;

public class LV2CodingTest6 {
    /*[다음큰 숫자]
    자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같다
    1. n의 다음 큰 숫자는 n보다 큰 자연수
    2. n의 다음 큰 숫자와 n은 2진수를 변환했을 때 1의 갯수가 같다
    3. n의 다음 쿤 숫자는 조건 1,2를 만족하는 가장 작은 수
     */

    public static void main(String[] args){

        Solution6 solution = new Solution6();
        solution.solution(78);
        solution.solution(15);



    }

}


/*

[결과]
채점 결과
정확성: 70.0
효율성: 30.0
합계: 100.0 / 100.0
 */
class Solution6{
    public int solution(int n){

        String fBin = Integer.toBinaryString(n);
        int fCount = 0;
        for(int i=0; i<fBin.length(); i++) {
            if (fBin.charAt(i) == '1') {
                fCount++;
            }

        };
        int sNum=n;
        String sBin ="";
        int sCount = 0;
        boolean result=false;

        while(result!=true){
            System.out.println("sNum : "+sNum);
            sBin = Integer.toBinaryString(sNum);
            int sTCount = 0;

            for(int i=0; i<sBin.length(); i++){
                if(sBin.charAt(i)=='1'){
                    sTCount++;
                };
            }

            if(n<sNum && fCount==sTCount){
                result = true;
                sCount=sTCount;
            }

            sNum++;
        }

        System.out.println("최종 다음번 숫자는 :" +(sNum-1) + " , 1의 개수는 : "+sCount + " 2진수 : "+sBin);

        return sNum-1;
    }
}
