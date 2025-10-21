package com.matheuscarv69.poc_java_17_features.instanceofpatternmatching;

public class InstanceOfPatternMatching {

    public static void main(String[] args) {

        InstanceOfPatternMatching instanceOfTest = new InstanceOfPatternMatching();

        Object obj1 = "Hello, World!";
        instanceOfTest.instanceOfWithoutPatternMatchingUntilJava16(obj1);

        Object obj2 = "Hi!";
        instanceOfTest.instanceOfWithPatternMatching(obj2);

        Object obj3 = "Java 17 Pattern Matching";
        instanceOfTest.instanceOfWithPatternMatchingFromJava17(obj3);

    }

    void instanceOfWithoutPatternMatchingUntilJava16(Object obj) {

        if (obj instanceof String) {
            String text = (String) obj;

            if (text.length() > 3) {
                System.out.println("without pattern matching: " + text);
            }

        }

    }

    void instanceOfWithPatternMatching(Object obj) {

        if (obj instanceof String text) {

            if (text.length() > 3) {
                System.out.println("with pattern matching: " + text);
            }
        }

    }

    void instanceOfWithPatternMatchingFromJava17(Object obj) {

        if (obj instanceof String text && text.length() > 3) {
            System.out.println("with pattern matching from Java 17: " + text);
        }

    }

}