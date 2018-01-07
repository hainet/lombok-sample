package com.hainet.lombok.sample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ToStringSampleTest {

    @Test
    public void withNoToStringTest() {
        ToStringSample.WithNoToString withNoToString = new ToStringSample.WithNoToString(1, "hainet");
        System.out.println(withNoToString.toString());

        assertThat(
                withNoToString.toString(),
                is(containsString(withNoToString.getClass().getName()))
        );
    }

    @Test
    public void withToStringTest() {
        ToStringSample.WithToString withToString = new ToStringSample.WithToString(1, "hainet");
        System.out.println(withToString.toString());

        assertThat(
                withToString.toString(),
                is(containsString(withToString.getClass().getSimpleName()))
        );
        // getterがない場合はフィールドの値にアクセス
        assertThat(
                withToString.toString(),
                is(containsString("id=1"))
        );
        // getterがある場合はgetterでアクセス
        assertThat(
                withToString.toString(),
                is(containsString("name=I'm hainet"))
        );
        // staticなフィールドは出力されない
        assertThat(
                withToString.toString(),
                is(not(containsString("password=password")))
        );
    }

    @Test
    public void doNotUseGetters() {
        ToStringSample.DoNotUseGetters doNotUseGetters = new ToStringSample.DoNotUseGetters(1, "hainet");
        System.out.println(doNotUseGetters.toString());

        assertThat(
                doNotUseGetters.toString(),
                is(not(containsString("name=I'm hainet")))
        );
        assertThat(
                doNotUseGetters.toString(),
                is(containsString("name=hainet"))
        );
    }

    @Test
    public void includeFieldNamesTest() {
        ToStringSample.IncludeFieldNames includeFieldNames = new ToStringSample.IncludeFieldNames(1, "hainet");
        System.out.println(includeFieldNames.toString());

        assertThat(
                includeFieldNames.toString(),
                is(not(containsString("id=1")))
        );
        assertThat(
                includeFieldNames.toString(),
                is(containsString("1"))
        );
        assertThat(
                includeFieldNames.toString(),
                is(not(containsString("name=hainet")))
        );
        assertThat(
                includeFieldNames.toString(),
                is(containsString("hainet"))
        );
    }

    @Test
    public void callSuperTest() {
        ToStringSample.CallSuper callSuper = new ToStringSample.CallSuper(1, "hainet");
        System.out.println(callSuper.toString());

        assertThat(
                callSuper.toString(),
                is(containsString("super=" + callSuper.getClass().getName()))
        );
    }

    @Test
    public void excludeTest() {
        ToStringSample.Exclude exclude = new ToStringSample.Exclude(1, "hainet");
        System.out.println(exclude.toString());

        assertThat(
                exclude.toString(),
                is(not(containsString("id=1")))
        );
        assertThat(
                exclude.toString(),
                is(containsString("name=hainet"))
        );
    }

    @Test
    public void ofTest() {
        ToStringSample.Of of = new ToStringSample.Of(1, "hainet");
        System.out.println(of.toString());

        assertThat(
                of.toString(),
                is(containsString("id=1"))
        );
        assertThat(
                of.toString(),
                is(not(containsString("name=hainet")))
        );
    }
}
