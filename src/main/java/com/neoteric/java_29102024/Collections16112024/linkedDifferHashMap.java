package com.neoteric.java_29102024.Collections16112024;

import java.util.Objects;

public class linkedDifferHashMap {
        private String name;
        private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public linkedDifferHashMap(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            linkedDifferHashMap person = (linkedDifferHashMap) obj;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }

}
