package com.matheuscarv69.poc_java_17_features.switchpatternmatching;

public class SwitchPatternMatching {

    public static void main(String[] args) {

        SwitchPatternMatching switchPatternMatching = new SwitchPatternMatching();

        switchPatternMatching.getWeekDayOrWeekendJava14(Days.MONDAY);
        switchPatternMatching.getWeekDayOrWeekendJava14(Days.SATURDAY);

        switchPatternMatching.switchPatternMatchingJava17(null);
        switchPatternMatching.switchPatternMatchingJava17(42);
        switchPatternMatching.switchPatternMatchingJava17("Hello, World!");
        switchPatternMatching.switchPatternMatchingJava17(Days.FRIDAY);

    }

    /*
     * Java 14 Switch Expression
     * multi case labels
     */
    void getWeekDayOrWeekendJava14(Days day) {

        String result = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
            case SATURDAY, SUNDAY -> "Weekend";
        };

        System.out.println("The day " + day + " is a " + result);

    }

    /*
     * Java 17 Switch Pattern Matching
     */
    void switchPatternMatchingJava17(Object obj) {

        String result = switch (obj) {
            case null -> "null value received"; // java 17 preview
            case Integer i -> "Integer value: " + i; // java 17 preview
            case String s -> "String value: " + s; // java 17 preview
            case Days day &&day == Days.FRIDAY ->"It's Friday!"; // java 17 preview
            default -> "Unknown type";
        };

        System.out.println("Result: " + result);

    }

    public enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

}


