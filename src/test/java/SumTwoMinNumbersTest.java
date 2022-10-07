import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Проверка суммы двух минимальных чисел массива")
class SumTwoMinNumbersTest {
    SumTwoMinNumbers testSumTwoMinNumbers = new SumTwoMinNumbers();
    int[] arraySumNumbers = {1, 2, 3, 4};
    int[] arrayEmpty = {};
    int[] arrayBig = new int[100000000];

    @Test
    @DisplayName("Сумма 2 минимальных чисел массива")
    void sumNumbers() {
        int actual = 3;
        int expected = testSumTwoMinNumbers.sumNumbers(arraySumNumbers);
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Массив пустой и без цифр")
    void sumNumbersArrayEmpty() {
        int actual = 0;
        int expected = testSumTwoMinNumbers.sumNumbers(arrayEmpty);
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Массив большого объема")
    void sumNumbersBigArray() throws OutOfMemoryError {
        int actual = 0;
        int expected = testSumTwoMinNumbers.sumNumbers(arrayBig);
        assertEquals(actual, expected);
    }
}