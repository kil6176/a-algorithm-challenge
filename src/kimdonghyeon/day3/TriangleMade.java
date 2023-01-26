package day3;

import java.util.Arrays;

public class TriangleMade {
    public static int solution(int[] sides) {
        int answer = 0;
        int[] triangle = Arrays.stream(sides).sorted().toArray();
        if(triangle[2] >= triangle[0] + triangle[1])
            answer = 2;
        else
            answer = 1;
        return answer;

    }

    public static void main(String[] args) {
        //int []numbers = {1, 2, 3, 4, 5};
        int[] sides = {1,2,3};

        System.out.println(solution(sides));
    }
}
