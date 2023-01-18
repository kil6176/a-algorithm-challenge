public class ArrayAverage {
    public static void main(String[] args) {
        //int []arrInt = {1, 2, 3, 4, 5};
        int []arrInt = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        int totalNum = 0;


        for (int arr : arrInt)
            totalNum += arr;


        System.out.println((float) totalNum/arrInt.length);
    }
}
