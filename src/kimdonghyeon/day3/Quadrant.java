package day3;

public class Quadrant {
    public static int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if(x > 0 && y > 0)
            answer = 1;
        else if(x < 0 && y > 0)
            answer = 2;
        else if(x < 0 && y < 0)
            answer = 3;
        else if(x > 0 && y < 0)
            answer = 4;
        return answer;
    }

    public static void main(String[] args) {
        //int []numbers = {1, 2, 3, 4, 5};
        int[] numbers = {2, 4};

        System.out.println(solution(numbers));
    }
}
