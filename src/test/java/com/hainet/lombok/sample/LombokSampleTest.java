package com.hainet.lombok.sample;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class LombokSampleTest {

    private LombokSample sample;

    @Before
    public void before() {
        sample = new LombokSample();
    }

    @Test
    public void arrayListAsVal() {
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
    public void hashMapAsVal() {
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
