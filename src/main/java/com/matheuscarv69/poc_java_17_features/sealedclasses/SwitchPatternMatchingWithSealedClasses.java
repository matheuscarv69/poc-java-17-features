package com.matheuscarv69.poc_java_17_features.sealedclasses;

public class SwitchPatternMatchingWithSealedClasses {

    public static void main(String[] args) {

        SwitchPatternMatchingWithSealedClasses switchPatternMatchingWithSealedClasses = new SwitchPatternMatchingWithSealedClasses();

        switchPatternMatchingWithSealedClasses.switchPatternMatchingJava17WithSealedClasses(new Square(5.0));
        switchPatternMatchingWithSealedClasses.switchPatternMatchingJava17WithSealedClasses(new Rectangle(4.0, 5.0));
    }

    /*
     * Método simples que:
     * - Recebe um objeto `Shape`.
     * - Usa um `switch` com pattern matching para:
     *     • tratar o caso `null`,
     *     • identificar se é um `Square` ou `Rectangle`,
     *     • calcular a área correspondente e montar uma mensagem.
     * - Imprime a mensagem resultante.
     *
     * Observação: pattern matching em `switch` é recurso em preview no Java 17.
     */
    void switchPatternMatchingJava17WithSealedClasses(Shape shape) {

        String result = switch (shape) {
            case null -> "null value received"; // java 17 preview
            case Square s -> "Square area: " + s.area(); // java 17 preview
            case Rectangle r -> "Rectangle area: " + r.area(); // java 17 preview
        };

        System.out.println("Result: " + result);

    }

}


