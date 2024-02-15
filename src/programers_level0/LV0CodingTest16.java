package programers_level0;

public class LV0CodingTest16 {
    /*
    편지

문제 설명
머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며,
편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
     */
    public static void main(String[] args){
        LV0Solution16 solution16 = new LV0Solution16();
        System.out.println(solution16.solution("happy birthday!"));
        System.out.println(solution16.solution("I love you~"));
    }
}

class LV0Solution16{
    public int solution(String message) {
        int answer = 0;
        answer = message.length()*2;

        return answer;
    }
}