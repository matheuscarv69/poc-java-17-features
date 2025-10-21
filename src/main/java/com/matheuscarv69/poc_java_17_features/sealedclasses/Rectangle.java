package com.matheuscarv69.poc_java_17_features.sealedclasses;

public record Rectangle(Double width, Double height) implements Shape {

    @Override
    public Double area() {
        return width * height;
    }

}
