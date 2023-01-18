import java.util.Scanner;

public class SumEvenNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        int evenTotal = 0;
        if(0 < inputNumber && inputNumber <= 1000)
        {
            for(int i=0; i<=inputNumber; i++)
                evenTotal += (i % 2 == 0) ? i : 0;
        }
        System.out.print(evenTotal);

    }
}
