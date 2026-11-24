package org.example.e13methodreference;

import java.util.Arrays;
import java.util.List;

// 메소드 참조(람다식을 축약해서 쓰는 것)
public class MainMethodReferece {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("호랑이","사자","독수리","쌍둥이","공룡","거인","곰","와이번");

        // 람다식을 이용하여 list를 출력하기.
        list.forEach((name)->{
            System.out.println(name);
        });

        // 메소드 참조
        list.forEach(System.out::println);

    }
}
