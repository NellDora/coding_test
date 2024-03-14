package programers_level0;

public class LV0CodingTest22 {

    public static void main(String[] args){
        LV0Solution22 solution22 = new LV0Solution22();
        int[] testBox1 = new int[] {1,1,1};
        int[] testBox2 = new int[] {10,8,6};

        System.out.println(solution22.solution(testBox1,1));
        System.out.println(solution22.solution(testBox2,3));
    }
}

class LV0Solution22{
    public int solution(int[] box, int n) {
        int answer = 0;
        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
        return answer;
    }
}
