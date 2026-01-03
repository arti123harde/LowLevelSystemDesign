package com.study.solidPrinciples.dependencyInversion.nonviolating;

import com.study.solidPrinciples.dependencyInversion.Keyboard;
import com.study.solidPrinciples.dependencyInversion.Mouse;
import com.study.solidPrinciples.dependencyInversion.WiredKeyboard;
import com.study.solidPrinciples.dependencyInversion.WiredMouse;

/**
 * @author Arti Harde
 * <p>
 *     High-level module uses abstraction
 * </p>
 */
public class MacBook {

    private final Keyboard keyboard;
    private final Mouse mouse;

    // Abstraction - defines contract
    // Dependency injection through constructor
    // Works with any kind of keyboard and mouse
    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

}
