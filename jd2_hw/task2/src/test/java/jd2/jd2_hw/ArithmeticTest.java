package jd2.jd2_hw;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticTest extends TestCase {

    public void testGetResult() {
        List<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(10);

        Arithmetic arithmetic = new Arithmetic(list);

        assertEquals(4.0, arithmetic.getResult());
    }
}