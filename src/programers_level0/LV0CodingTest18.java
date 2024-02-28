package programers_level0;

public class LV0CodingTest18 {

    /*
    점의 위치 구하기
제출 내역
문제 설명
사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
스크린샷 2022-07-07 오후 3.27.04 복사본.png

x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
     */

    public static void main (String[] args){
        LV0Solution18 solution18 = new LV0Solution18();
        System.out.println(solution18.solution(new int[]{2,4}));
        System.out.println(solution18.solution(new int[]{-7,9}));
    }
}

class LV0Solution18{
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0]>0 && dot[1]>0) answer =1;
        else if(dot[0]<0 && dot[1]>0) answer =2;
        else if(dot[0]<0 && dot[1]<0) answer =3;
        else if(dot[0]>0 && dot[1]<0) answer =4;
        return answer;
    }
}