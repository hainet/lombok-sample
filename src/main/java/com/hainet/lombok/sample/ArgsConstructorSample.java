package com.hainet.lombok.sample;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class ArgsConstructorSample {

    @NoArgsConstructor
    public static class NoArgsConstructorSample {

        private int id;

        public NoArgsConstructorSample(final int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

    @NoArgsConstructor(force = true)
    public static class NoArgsConstructorForceSample {

        private final int id;
        private final String name;
        private final boolean deleted;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public boolean isDeleted() {
            return deleted;
        }
    }

    @RequiredArgsConstructor
    public static class RequiredArgsConstructorSample {

        private int id;
        private final String name;
        @NonNull private String password;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }
    }

    @AllArgsConstructor
    public static class AllArgsConstructorSample {

        private int id;
        private final String name;
        @NonNull private String password;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }
    }
}
