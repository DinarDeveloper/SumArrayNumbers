public class Main {
    public static void main(String[] args) {
        int[] array = {4, 0, 3, 19, 492, -10, 1};
        try {
            SumTwoMinNumbers sumTwoMinNumbers = new SumTwoMinNumbers();
            System.out.println(sumTwoMinNumbers.sumNumbers(array));
        } catch (OutOfMemoryError exception) {
            System.out.println("Ваш массив превысел граничные условия");
        }
    }
}
