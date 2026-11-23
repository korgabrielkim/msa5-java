package org.example.e09generics;

import java.util.Arrays;

public class Box <T> {
    // 컨퍼런스 할 때 T를 Object로 치환해서 작동 된다고 함.
    // Object가 최상위 객체라고 볼 수 있는데, 프리미티브 타입은 객체가 아니기에 넣을 수 없는 것임.
    public T arr;

    public Box(T arr) {
        this.arr = arr;
    }
}
