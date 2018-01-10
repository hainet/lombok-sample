package com.hainet.lombok.sample;

import lombok.Builder;
import lombok.NonNull;

public class BuilderSample {

    public static class ConstructorBuilderSample {

        private int id;

        private String name;

        @Builder
        public ConstructorBuilderSample(final int id, @NonNull final String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    @Builder
    public static class ClassBuilderSample {

        private int id;

        @NonNull
        private String name;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
