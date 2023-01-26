package day2;

public class HeightCheck {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for(int h : array) {
            if (h > height)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int []array = {149, 180, 192, 170};
        int height = 170;


        System.out.println(solution(array, height));
    }
}
