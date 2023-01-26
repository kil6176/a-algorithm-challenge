package day2;

public class IceCoffee {
    public static int[] solution(int money) {
        int coffeePrice = 5500;
        int[] answer = {money/coffeePrice, money%coffeePrice};
        return answer;
    }

    public static void main(String[] args) {
        //int []numbers = {1, 2, 3, 4, 5};
        int money = 5500;

        System.out.println(solution(money));
    }
}
