package com.example.common.util.Lambda.lumbdTest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
/**
 * @author : xianzhiyong
 * @Date: 2020/5/7
 * @Description :  lambda 根据对象属性去重
 */
public class distinctByKey {

    static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
