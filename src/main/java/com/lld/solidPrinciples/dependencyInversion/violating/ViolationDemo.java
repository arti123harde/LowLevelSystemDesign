package com.lld.solidPrinciples.dependencyInversion.violating;

import com.lld.solidPrinciples.dependencyInversion.BluetoothKeyboard;
import com.lld.solidPrinciples.dependencyInversion.BluetoothMouse;
import com.lld.solidPrinciples.dependencyInversion.WiredKeyboard;
import com.lld.solidPrinciples.dependencyInversion.WiredMouse;

/**
 * @author Arti Harde
 */
public class ViolationDemo {

    public static void main(String[] args) {

        // create keyboard and mouse objects
        WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "Dell", "F602", "Grey");
        WiredMouse wiredMouse = new WiredMouse("USB", "Dell", "F602", "Grey");
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("Bluetooth", "Logitech", "G102", "Black");
        BluetoothMouse bluetoothMouse = new BluetoothMouse("Bluetooth", "Logitech", "G102", "Black");

        // create macbook
        MacBook macBookWithWiredParts = new MacBook(wiredKeyboard, wiredMouse);
        macBookWithWiredParts.getKeyboard().getSpecifications();
        macBookWithWiredParts.getMouse().getSpecifications();

        /*
            Cannot create macbook with bluetooth keyboard and bluetooth mouse because,
            macbook depends on wired keyboard and mouse - tight coupling - violation of DIP
         */
        // MacBook macBookWithBluetoothParts = new MacBook(bluetoothKeyboard, bluetoothKeyboard);

    }
}
