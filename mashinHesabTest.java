package mashinhesabProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mashinHesabTest {
    @Test
    void should_be_add() {
        //Given
        int number_1 = 5;
        int number_2 = 3;
        //when
        int result = sum(number_1, number_2);
        //then
        assertEquals(8, result);
    }

    @Test
    void should_be_multiply() {
        //Given
        int number_1 = 8;
        int number_2 = 4;
        //when
        int result = multyply(number_1, number_2);

        //then
        assertEquals(32, result);


    }

    @Test
    void should_be_minus() {
        //Given
        int number_1 = 10;
        int number_2 = 2;
        //when
        int result = minus(number_1, number_2);
        //then
        Assertions.assertEquals(8, result);
    }

    @Test
    void should_be_divid() {
        //Given
        int number_1 = 10;
        int number_2 = 2;
        //when
        int result = divid(number_1, number_2);
        //then
        Assertions.assertEquals(5, result);
    }

    private static int divid(int number_1, int number_2) {
        int result = number_1 / number_2;
        return result;
    }

    private static int minus(int number_1, int number_2) {
        int result = number_1 - number_2;
        return result;
    }

    private static int multyply(int number_1, int number_2) {
        return number_1 * number_2;
    }

    private static int sum(int number_1, int number_2) {
        int result = number_1 + number_2;
        return result;
    }

}
