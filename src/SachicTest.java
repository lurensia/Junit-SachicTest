import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SachicTest {

    private Sachic sachic = new Sachic();

    @Test
    public void add_테스트() {
        // given
        int num1 = 9;
        int num2 = 2;

        // when
        int result = sachic.add(num1, num2);
        System.out.println(result);

        // then
        assertEquals(11, result);
    }

    @Test
    public void sub_테스트() {
        // given
        int num1 = 9;
        int num2 = 2;

        // when
        int result = sachic.sub(num1, num2);
        System.out.println(result);

        // then
        assertEquals(7, result);
    }

    @Test
    public void mul_테스트() {
        // given
        int num1 = 9;
        int num2 = 2;

        // when
        int result = sachic.mul(num1, num2);
        System.out.println(result);

        // then
        assertEquals(18, result);
    }

    @Test
    public void div_테스트() {
        // given
        int num1 = 9;
        int num2 = 2;

        // when
        int result = sachic.div(num1, num2);
        System.out.println(result);

        // then
        assertEquals(4, result);
    }
}
