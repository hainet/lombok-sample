package com.hainet.lombok.sample;

import lombok.NonNull;
import lombok.Setter;

public class NonNullSample {

    // Lombokの@Setterを利用する場合@NonNullはフィールドに付与する。
    // @Setter
    // @NonNull
    private String nonNull;

    public NonNullSample(@NonNull final String nonNull) {
        this.nonNull = nonNull;
    }

    public void setNonNull(@NonNull final String nonNull) {
        this.nonNull = nonNull;
    }
}
