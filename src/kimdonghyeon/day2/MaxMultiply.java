package day2;

import java.util.Arrays;
import java.util.Collections;

public class MaxMultiply {
    public static int solution(int[] numbers) {
        int answer = 0;
        Integer[] tmp = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());
        answer = tmp[0] * tmp[1];
        return answer;
    }

    public static void main(String[] args) {
        int []numbers = {1, 2, 3, 4, 5};


        System.out.println(solution(numbers));
    }
}
