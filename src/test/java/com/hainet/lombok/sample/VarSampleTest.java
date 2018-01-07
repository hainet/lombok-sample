package com.hainet.lombok.sample;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VarSampleTest {

    private VarSample sample;

    @Before
    public void before() {
        sample = new VarSample();
    }

    @Test
    public void arrayListAsValTest() {
        assertThat(
                sample.arrayListAsVar(),
                is(instanceOf(ArrayList.class))
        );
        assertThat(
                sample.arrayListAsVar().get(0),
                is("val")
        );
    }

    @Test
    public void hashMapAsValTest() {
        assertThat(
                sample.hashMapAsVar(),
                is(instanceOf(HashMap.class))
        );
        assertThat(
                sample.hashMapAsVar().get("key"),
                is("value")
        );
    }
}
