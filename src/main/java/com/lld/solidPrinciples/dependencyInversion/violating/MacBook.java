package com.lld.solidPrinciples.dependencyInversion.violating;

import com.lld.solidPrinciples.dependencyInversion.Keyboard;
import com.lld.solidPrinciples.dependencyInversion.Mouse;
import com.lld.solidPrinciples.dependencyInversion.WiredKeyboard;
import com.lld.solidPrinciples.dependencyInversion.WiredMouse;

/**
 * @author Arti Harde
 * <p>
 *     High-level module directly depending on low-level module
 * </p>
 */
public class MacBook {

    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    // Direct dependency on concrete class
    public MacBook(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        keyboard = wiredKeyboard; // Tight coupling
        mouse = wiredMouse; // Tight coupling
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

}
