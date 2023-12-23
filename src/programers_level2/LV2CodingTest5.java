package programers_level2;

import java.util.Arrays;

public class LV2CodingTest5 {
    /*
    영어 끝말잇기

    설명
    1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 함
    1. 1번부터 번호순서대로 한사람씩 차례대로 단어를
    2. 마지막 사람이 단어 말한 후 다시 1번부터 리턴
    3. 앞사람이 말한 단어의의 자미가 단어로 말해야함
    4. 이전에 사용한 단어는 사용 불가능
    5, 한글자는 인정 X

     */
    public static void main(String[] args) {
        String[] arr = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int n=3;

        System.out.println();
//        Character last = null;
//
//
//
//        int num;
//        int pos=0;
//        for(int i=1; i<arr.length; i++){
//            //마지막 문자가 없으면 => 첫단어일 경우
//            if(last==null){
//
//                last = arr[i].charAt(arr[i].length()-1);
//            }else{//마지막 문자가 있을 때
//                //마지막 문자가 첫문자와 동일하지 않으면
//               if(arr[i].charAt(0)!=last){
//                    //탈락자 검거
//                   if(i%n==0){
//                       pos=n;
//                   }else{
//                       pos=i%n;
//                   }
//               }else if(arr[i].charAt(0)==last){
//
//               }
//            }
//
//
//       }

    }


}
/*
[생각해보기]
우선 해야할 것.
배열의 길이가 1이 아닌지 확인을 해야함
2. 전 배열의 마지막과 현 배열의 처음과 동일한지 확인해야함 -> 전 단어의 마지막 단어를 저장
 */

class Solution5{

    public int[] solution(int n, String[] word){
        int result=0;
        int seq =0;
        int[] answer ={};

        for(int i=1; i<word.length; i++) {

            for (int j = 0; j < i; j++) {
                if (word[i].equals(word[j])) {
                    if ((i + 1) % n == 0) {
                        result = n;
                        seq = i / n + 1;
                    } else {
                        result = i % n;
                        seq = i / n + 1;
                    }
                } else if (word[i].charAt(word[i].length() - 1) != word[i - 1].charAt(word[i - 1].length() - 1)) {
                    if ((i + 1) % n == 0) {
                        result = n;
                        seq = i / n + 1;
                    } else {
                        result = i % n;
                        seq = i / n + 1;
                    }

                } else {
                    result = 0;
                    seq = 0;
                }
                ;

            }


        }

        return answer = new int[]{result,seq};
    }
}
