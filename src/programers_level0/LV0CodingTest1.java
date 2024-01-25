package programers_level0;

public class LV0CodingTest1 {
    /*
    짝수 홀수 개수
문제 설명
정수가 담긴 리스트 num_list가 주어질 때,
num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */

    public static void main(String [] args){
        LV0Solution1 solution1 = new LV0Solution1();
        int[] num_list1 = {1,2,3,4,5};
        System.out.println(solution1.solution(num_list1)[0]+" "+solution1.solution(num_list1)[1]);

        int[] num_list2 = {1, 3, 5, 7};
        System.out.println(solution1.solution(num_list2)[0]+" "+solution1.solution(num_list1)[1]);
    }
}

class LV0Solution1{
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int odd = 0;
        int even = 0;

        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        answer = new int[]{even,odd};
        return answer;
    }
}
