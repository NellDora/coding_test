package programers_level0;

public class LV0CodingTest2 {
    public static void main(String[] args){
        String my_string = "hello";
        LV0Solution2  solution2 = new LV0Solution2();
        System.out.println(solution2.solution(my_string,3));
    }

}

class LV0Solution2{
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}
