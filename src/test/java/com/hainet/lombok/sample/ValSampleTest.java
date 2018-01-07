package com.hainet.lombok.sample;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ValSampleTest {

    private ValSample sample;

    @Before
    public void before() {
        sample = new ValSample();
    }

    @Test
    public void arrayListAsValTest() {
        assertThat(
                sample.arrayListAsVal(),
                is(instanceOf(ArrayList.class))
        );
        assertThat(
                sample.arrayListAsVal().get(0),
                is("val")
        );
    }

    @Test
    public void hashMapAsValTest() {
        assertThat(
                sample.hashMapAsVal(),
                is(instanceOf(HashMap.class))
        );
        assertThat(
                sample.hashMapAsVal().get("key"),
                is("value")
        );
    }
}
