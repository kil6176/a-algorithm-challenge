package day2;

public class TextLoopPrint {
    public static String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //int []numbers = {1, 2, 3, 4, 5};
        String my_string = "hello";
        int n = 7;

        System.out.println(solution(my_string, n));
    }
}
