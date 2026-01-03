package com.lld.solidPrinciples.dependencyInversion;

/**
 * @author Arti Harde
 * <p>
 *     Low-level module - concrete implementation
 * </p>
 */
public class BluetoothMouse implements Mouse {
    private final String connectionType;
    private final String company;
    private final String modelVersion;
    private final String color;

    public BluetoothMouse(String connectionType, String company, String modelVersion, String color) {
        this.connectionType = connectionType;
        this.company = company;
        this.modelVersion = modelVersion;
        this.color = color;
    }

    public void getSpecifications() {
        System.out.println("------------ Bluetooth Mouse ------------");
        String description = """
                    |   "Connection Type: " {%s}
                    |   "Company: " {%s}
                    |   "Model Version: " {%s}
                    |   "Color: " {%s}
                """.formatted(connectionType, company, modelVersion, color);
        System.out.println(description);
    }
}
