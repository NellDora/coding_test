package programers_level0;

public class LV0CodingTest33 {

    /*
    대문자와 소문자
문제 설명
문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
입출력 예
my_string	result
"cccCCC"	"CCCccc"
"abCdEfghIJ"	"ABcDeFGHij"
입출력 예 설명
입출력 예 #1

소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다.
입출력 예 #2

소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다.
     */

    public static void main(String[] args){
        LV0Solution33 solution33 = new LV0Solution33();
        System.out.println(solution33.solution("cccCCC"));
        System.out.println(solution33.solution("abCdEfghIJ"));
    }

}

class LV0Solution33{
    public String solution(String my_string) {
        String answer = "";

//        char A = 'A';//65
//        char Z = 'Z';//90
//        char a = 'a';//97
//        char z = 'z';//122

        for(int i=0; i<my_string.length(); i++){
            if((int)my_string.charAt(i)>=65&&(int)my_string.charAt(i)<=90){
                answer +=(char)(my_string.charAt(i)+32);
            }else if((int)my_string.charAt(i)>=97&&(int)my_string.charAt(i)<=122){

                answer +=(char)(my_string.charAt(i)-32);
            }
        }

        return answer;
    }

}