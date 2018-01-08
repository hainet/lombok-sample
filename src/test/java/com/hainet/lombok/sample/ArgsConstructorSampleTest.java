package com.hainet.lombok.sample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class ArgsConstructorSampleTest {

    @Test
    public void noArgsConstructorTest() {
        // 宣言していないコンストラクタが生成されている。
        new ArgsConstructorSample.NoArgsConstructorSample();

        // 宣言したコンストラクタも問題なく利用可能。
        assertThat(
                new ArgsConstructorSample.NoArgsConstructorSample(1).getId(),
                is(1)
        );
    }

    @Test
    public void noArgsConstructorForceTest() {
        ArgsConstructorSample.NoArgsConstructorForceSample sample = new ArgsConstructorSample.NoArgsConstructorForceSample();

        assertThat(sample.getId(), is(0));
        assertThat(sample.getName(), is(nullValue()));
        assertThat(sample.isDeleted(), is(false));
    }

    @Test(expected = NullPointerException.class)
    public void requiredArgsConstructorTest() {
        // final修飾子または@NonNullが付与されたフィールドをパラメータとするコンストラクタが生成されている。
        ArgsConstructorSample.RequiredArgsConstructorSample sample = new ArgsConstructorSample.RequiredArgsConstructorSample("hainet", "password");

        assertThat(sample.getId(), is(0));
        assertThat(sample.getName(), is("hainet"));
        assertThat(sample.getPassword(), is("password"));

        // @NonNullが付与されたパラメータにnullが指定されるとNullPointerExceptionが発生する。
        new ArgsConstructorSample.RequiredArgsConstructorSample("hainet", null);
    }

    @Test(expected = NullPointerException.class)
    public void allArgsConstructorTest() {
        ArgsConstructorSample.AllArgsConstructorSample sample = new ArgsConstructorSample.AllArgsConstructorSample(1, "hainet", "password");

        assertThat(sample.getId(), is(1));
        assertThat(sample.getName(), is("hainet"));
        assertThat(sample.getPassword(), is("password"));

        // @NonNullが付与されたパラメータにnullが指定されるとNullPointerExceptionが発生する。
        new ArgsConstructorSample.AllArgsConstructorSample(1, "hainet", null);
    }
}
