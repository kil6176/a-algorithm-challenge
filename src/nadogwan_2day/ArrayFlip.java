public class ArrayFlip {
    public static double solution(int[] numbers) {
        double answer = 0;

        for (int arr : numbers) answer += arr;

        return answer/numbers.length;
    }
    public static void main(String[] args) {
        //int []numbers = {1, 2, 3, 4, 5};
        int []numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println(solution(numbers));
    }
}
