public class LambSkewers {
    public static int solution(int lamb, int drink) {
        return 12000 * lamb + 2000 * drink - (lamb / 10 * 2000);
    }
    public static void main(String[] args) {
        int lamb = 10, drink = 3;
//        int lamb = 64, drink = 6;

        System.out.println(solution(lamb, drink));
    }

}
