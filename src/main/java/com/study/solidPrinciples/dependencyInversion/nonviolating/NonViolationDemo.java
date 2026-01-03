package com.study.solidPrinciples.dependencyInversion.nonviolating;

import com.study.solidPrinciples.dependencyInversion.BluetoothKeyboard;
import com.study.solidPrinciples.dependencyInversion.BluetoothMouse;
import com.study.solidPrinciples.dependencyInversion.WiredKeyboard;
import com.study.solidPrinciples.dependencyInversion.WiredMouse;

/**
 * @author Arti Harde
 */
public class NonViolationDemo {

    public static void main(String[] args) {

        // create keyboard and mouse objects
        WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "Dell", "F602", "Grey");
        WiredMouse wiredMouse = new WiredMouse("USB", "Dell", "F602", "Grey");
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("Bluetooth", "Logitech", "G102", "Black");
        BluetoothMouse bluetoothMouse = new BluetoothMouse("Bluetooth", "Logitech", "G102", "Black");

        // Can easily create MacBooks with different combinations of keyboard and mouse

        // create macbook with wired keyboard and mouse
        MacBook macBookWithWiredParts = new MacBook(wiredKeyboard, wiredMouse);
        macBookWithWiredParts.getKeyboard().getSpecifications();
        macBookWithWiredParts.getMouse().getSpecifications();

        // create macbook with bluetooth keyboard and mouse
        MacBook macBookWithBluetoothParts = new MacBook(bluetoothKeyboard, bluetoothMouse);
        macBookWithBluetoothParts.getKeyboard().getSpecifications();
        macBookWithBluetoothParts.getMouse().getSpecifications();
    }

}
