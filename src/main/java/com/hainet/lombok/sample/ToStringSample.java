package com.hainet.lombok.sample;

import lombok.ToString;

public class ToStringSample {

    public static class WithNoToString {

        private int id;
        private String name;

        public WithNoToString(final int id, final String name) {
            this.id = id;
            this.name = name;
        }
    }

    @ToString
    public static class WithToString {

        private int id;
        private String name;
        private static String password = "password";

        public WithToString(final int id, final String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return "I'm " + name;
        }
    }

    @ToString(doNotUseGetters = true)
    public static class DoNotUseGetters {

        private int id;
        private String name;

        public DoNotUseGetters(final int id, final String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return "I'm " + name;
        }
    }

    @ToString(includeFieldNames = false)
    public static class IncludeFieldNames {

        private int id;
        private String name;

        public IncludeFieldNames(final int id, final String name) {
            this.id = id;
            this.name = name;
        }
    }

    @ToString(callSuper = true)
    public static class CallSuper {

        private int id;
        private String name;

        public CallSuper(final int id, final String name) {
            this.id = id;
            this.name = name;
        }
    }

    @ToString(exclude = {"id"})
    public static class Exclude {

        private int id;
        private String name;

        public Exclude(final int id, final String name) {
            this.id = id;
            this.name = name;
        }
    }

    @ToString(of = {"id"})
    public static class Of {

        private int id;
        private String name;

        public Of(final int id, final String name) {
            this.id = id;
            this.name = name;
        }
    }
}
