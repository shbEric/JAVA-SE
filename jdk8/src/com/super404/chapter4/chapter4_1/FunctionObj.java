package com.super404.chapter4.chapter4_1;

import java.util.function.Function;

public class FunctionObj implements Function {
    @Override
    public Object apply(Object o) {
        return o+"经过apply处理拼接";
    }
}
