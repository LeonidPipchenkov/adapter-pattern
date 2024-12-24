package net.happiness.adapter.impl;

import net.happiness.adapter.SocketAdapter;
import net.happiness.model.Socket;
import net.happiness.model.Voltage;

public class CompositionSocketAdapter implements SocketAdapter {

    private final Socket socket;

    public CompositionSocketAdapter() {
        this.socket = new Socket();
    }

    @Override
    public Voltage get220Voltage() {
        return socket.getVoltage();
    }

    @Override
    public Voltage get120Voltage() {
        return convertVoltage(socket.getVoltage(), 120);
    }

    @Override
    public Voltage get12Voltage() {
        return convertVoltage(socket.getVoltage(), 12);
    }

    @Override
    public Voltage get3Voltage() {
        return convertVoltage(socket.getVoltage(), 3);
    }

    private Voltage convertVoltage(Voltage voltage, int value) {
        voltage.setVolts(value);
        return voltage;
    }

}
