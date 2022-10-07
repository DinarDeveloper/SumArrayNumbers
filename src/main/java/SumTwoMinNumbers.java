import java.util.Arrays;

public class SumTwoMinNumbers {

    public int sumNumbers(int[] array) {
        return Arrays.stream(array).sorted().limit(2)
                .reduce(0, Integer::sum);
    }
}
