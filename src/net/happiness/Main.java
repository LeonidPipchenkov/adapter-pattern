package net.happiness;

import net.happiness.adapter.SocketAdapter;
import net.happiness.adapter.impl.CompositionSocketAdapter;
import net.happiness.model.Voltage;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        SocketAdapter compositionAdapter = new CompositionSocketAdapter();

        Voltage voltage220 = compositionAdapter.get220Voltage();
        Voltage voltage120 = compositionAdapter.get120Voltage();
        Voltage voltage12 = compositionAdapter.get12Voltage();

        test(220, voltage220.getVolts());
        test(120, voltage120.getVolts());
        test(12, voltage12.getVolts());
    }

    private static void test(Integer expected, Integer actual) {
        if (Objects.equals(expected, actual)) {
            System.out.printf("Test passed. Expected = %d and Actual = %d are equal.\n", expected, actual);
        } else {
            System.out.printf("Test failed. Expected = %d and Actual = %d are not equal.\n", expected, actual);
        }
    }

}
