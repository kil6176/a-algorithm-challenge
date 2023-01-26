package day2;

public class Pizza1 {
    public static int solution(int n) {
        int answer = 0;
        answer = (int) (Math.ceil((double) n / 7));
        return answer;
    }

    public static void main(String[] args) {
        //int []numbers = {1, 2, 3, 4, 5};
        int n = 7;

        System.out.println(solution(n));
    }
}
