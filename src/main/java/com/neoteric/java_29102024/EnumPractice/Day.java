package com.neoteric.java_29102024.EnumPractice;

public enum Day {
        // Enum constants
        MONDAY("Weekday"),
        TUESDAY("Weekday"),
        WEDNESDAY("Weekday"),
        THURSDAY("Weekday"),
        FRIDAY("Weekday"),
        SATURDAY("Weekend"),
        SUNDAY("Weekend");
        private String type;
        Day(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }

        public static Day fromString(String dayName) {
            return Day.valueOf(dayName.toUpperCase());
        }
        public String activity() {
            switch (this) {
                case SATURDAY:
                case SUNDAY:
                    return "Rest";
                default:
                    return "Work";
            }
        }

        // Main method to test the enum
        public static void main(String[] args) {
            System.out.println(Day.MONDAY.getType());       // Output: Weekday
            System.out.println(Day.SATURDAY.activity());    // Output: Rest
            System.out.println(Day.fromString("monday"));   // Output: MONDAY
        }
    }


