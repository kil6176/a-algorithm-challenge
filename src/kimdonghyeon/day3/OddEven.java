package day3;

public class OddEven {
    public static int[] solution(int[] num_list) {
    int[] answer = new int[2];
    for(int i=0 ; i < num_list.length ;i++){
        if(num_list[i] % 2 ==0)
            answer[0]++;
        else
            answer[1]++;
    }
    return answer;
}

    public static void main(String[] args) {
        //int []numbers = {1, 2, 3, 4, 5};
        int []numbers = {1, 2, 3, 4, 5};

        System.out.println(solution(numbers));
    }
}
