package net.happiness.adapter;

import net.happiness.model.Voltage;

public interface SocketAdapter {
    Voltage get220Voltage();
    Voltage get120Voltage();
    Voltage get12Voltage();
    Voltage get3Voltage();
}
