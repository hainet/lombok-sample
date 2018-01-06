package com.hainet.lombok.sample;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LombokSample {

    public List<String> arrayListAsVal() {
        val list = new ArrayList<String>();

        // 再代入を行おうとすると、コンパイラが以下のエラーを発生させる。
        // 「final変数listに値を代入することはできません」
        // list = new ArrayList<String>();
        list.add("val");

        return list;
    }

    public Map<String, Object> hashMapAsVal() {
        val map = new HashMap<String, Object>();

        // 再代入を行おうとすると、コンパイラが以下のエラーを発生させる。
        // 「final変数mapに値を代入することはできません」
        // map = new HashMap<String, Object>();
        map.put("key", "value");

        return map;
    }
}
