package day3;

public class StrReverse {
    public static String solution(String my_string) {
        String answer = my_string;
        StringBuffer strReverse = new StringBuffer(answer);
        answer = strReverse.reverse().toString();
        return answer;

    }

    public static void main(String[] args) {
        //int []numbers = {1, 2, 3, 4, 5};
        String my_string = "jaron";

        System.out.println(solution(my_string));
    }
}
