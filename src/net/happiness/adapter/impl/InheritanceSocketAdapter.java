package net.happiness.adapter.impl;

import net.happiness.adapter.SocketAdapter;
import net.happiness.model.Socket;
import net.happiness.model.Voltage;

public class InheritanceSocketAdapter extends Socket implements SocketAdapter {

    @Override
    public Voltage get220Voltage() {
        return getVoltage();
    }

    @Override
    public Voltage get120Voltage() {
        return convertVoltage(getVoltage(), 120);
    }

    @Override
    public Voltage get12Voltage() {
        return convertVoltage(getVoltage(), 12);
    }

    @Override
    public Voltage get3Voltage() {
        return convertVoltage(getVoltage(), 3);
    }

    private Voltage convertVoltage(Voltage voltage, int value) {
        voltage.setVolts(value);
        return voltage;
    }

}
