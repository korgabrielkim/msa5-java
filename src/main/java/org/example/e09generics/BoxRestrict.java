package org.example.e09generics;

public class BoxRestrict<T extends App & Goods> { // 둘다 만족해야 함. implements라도 제너릭에서는 extends로 연결한다고 함.
    public T media;



}
