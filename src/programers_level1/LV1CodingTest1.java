package programers_level1;

public class LV1CodingTest1 {
    //약수의 합
    /*
     * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수
     * solution을 완성
     */
    public static void main (String [] args){

        Solution1 solution = new Solution1();
        System.out.println("n(12) 약수의 합 = "+solution.solution(12));
        System.out.println("n(5)의 약수의 합 = "+solution.solution(5));
    }
}

class Solution1{
    //약수를 더해야한다.
    public int solution(int n) {
        int answer =0;
        //약수 구할 때 사용할 임시 값
        int temp=1;

        //약수의 합
        int sum=0;
        //나누는 값이 입력받은 값 n 그자체가 될 때까지 진행 (약수는 1과 자신은 항상 포함)
        //->n 자체도 포함되어야 하기 때문에 n+1
        while((n+1)!=temp) {
            if(n%temp==0) {
                sum+=temp;
            }
            temp+=1;
        }
        answer=sum;
        return answer;
    }
}
