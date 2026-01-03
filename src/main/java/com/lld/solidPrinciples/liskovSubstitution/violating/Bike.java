package com.lld.solidPrinciples.liskovSubstitution.violating;

/**
 * @author Arti Harde
 *
 * BAD: This design violates LSP
 */
public interface Bike {

    void turnOnEngine();

    void turnOffEngine();

    void accelerate();

    void applyBrakes();
}
