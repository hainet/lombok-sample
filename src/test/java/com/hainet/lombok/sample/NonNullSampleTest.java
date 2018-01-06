package com.hainet.lombok.sample;

import org.junit.Test;

public class NonNullSampleTest {

    @Test(expected = NullPointerException.class)
    public void nonNullConstructor() {
        // コンストラクタ引数にnullが指定された時点でNullPointerExceptionが発生する。
        new NonNullSample(null);
    }

    @Test(expected = NullPointerException.class)
    public void nonNullSetter() {
        // メソッド引数にnullが指定された時点でNullPointerExceptionが発生する。
        NonNullSample nonNullSample = new NonNullSample("nonNullSetter");
        nonNullSample.setNonNull(null);
    }
}
