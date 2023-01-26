package day3;

public class StrLength {
    public static int[] solution(String[] strlist) {
    int[] answer = new int[strlist.length];
        System.out.println(strlist.length);
    for(int i=0 ; i < strlist.length ;i++){
        answer[i] = strlist[i].length();
    }
    return answer;
}

    public static void main(String[] args) {
        //int []numbers = {1, 2, 3, 4, 5};
        String []numbers = {"We", "are", "the", "world!"};

        System.out.println(solution(numbers));
    }
}
