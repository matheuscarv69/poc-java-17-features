package com.matheuscarv69.poc_java_17_features.sealedclasses;

public record Square(Double side) implements Shape {

    @Override
    public Double area() {
        return side * side;
    }

}
