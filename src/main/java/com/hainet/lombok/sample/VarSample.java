package com.hainet.lombok.sample;

import lombok.experimental.var;
import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarSample {

    public List<String> arrayListAsVar() {
        var list = new ArrayList<String>();
        list = new ArrayList<>();

        list.add("val");

        return list;
    }

    public Map<String, Object> hashMapAsVar() {
        var map = new HashMap<String, Object>();
        map = new HashMap<>();

        map.put("key", "value");

        return map;
    }
}
