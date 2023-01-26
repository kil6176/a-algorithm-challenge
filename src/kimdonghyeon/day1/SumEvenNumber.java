import java.util.Scanner;
//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
// 입출력 예 설명
//입출력 예 #1
//n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 return 합니다.
//입출력 예 #2
//n이 4이므로 2 + 4 = 6을 return 합니다.
public class SumEvenNumber
{

        public static int solution(int n) {
            int answer = 0;

            for(int i=0; i<=n; i++) answer += (i % 2 == 0) ? i : 0;

            return answer;
        }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();

        System.out.print(solution(inputNumber));

    }
}
