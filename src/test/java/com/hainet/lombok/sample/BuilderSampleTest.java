package com.hainet.lombok.sample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BuilderSampleTest {

    @Test(expected = NullPointerException.class)
    public void constructorBuilderSampleTest() {
        BuilderSample.ConstructorBuilderSample sample = BuilderSample.ConstructorBuilderSample.builder()
                .id(1)
                .name("hainet")
                .build();

        assertThat(sample.getId(), is(1));
        assertThat(sample.getName(), is("hainet"));

        BuilderSample.ConstructorBuilderSample.builder()
                .name(null)
                .build();
    }

    @Test(expected = NullPointerException.class)
    public void classBuilderSampleTest() {
        BuilderSample.ClassBuilderSample sample = BuilderSample.ClassBuilderSample.builder()
                .id(1)
                .name("hainet")
                .build();

        assertThat(sample.getId(), is(1));
        assertThat(sample.getName(), is("hainet"));

        BuilderSample.ClassBuilderSample.builder()
                .name(null)
                .build();
    }
}
