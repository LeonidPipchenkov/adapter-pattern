package net.happiness;

import net.happiness.adapter.SocketAdapter;
import net.happiness.adapter.impl.CompositionSocketAdapter;
import net.happiness.adapter.impl.InheritanceSocketAdapter;
import net.happiness.model.Voltage;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        testingCompositionAdapter();
        System.out.println();
        testingInheritanceAdapter();
    }

    private static void testingCompositionAdapter() {
        SocketAdapter socketAdapter = new CompositionSocketAdapter();

        Voltage voltage220 = socketAdapter.get220Voltage();
        Voltage voltage120 = socketAdapter.get120Voltage();
        Voltage voltage12 = socketAdapter.get12Voltage();

        test(220, voltage220.getVolts());
        test(120, voltage120.getVolts());
        test(12, voltage12.getVolts());
    }

    private static void testingInheritanceAdapter() {
        SocketAdapter socketAdapter = new InheritanceSocketAdapter();

        Voltage voltage220 = socketAdapter.get220Voltage();
        Voltage voltage120 = socketAdapter.get120Voltage();
        Voltage voltage12 = socketAdapter.get12Voltage();

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
