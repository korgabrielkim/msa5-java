package org.example.e10collection;
// 컬렉션 프레임워크
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrayList {
    // ArrayList를 사용하더라도 다형성 때문에 실제로는 List 타입으로 이용하는 게 일반적임.
    // List로 업캐스팅하면 다운 캐스팅을 통하여 활용도가 높아짐.
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(10);
        // → list 타입인데 왜 ArrayList를 선언했느지에 대한 의문 : 부모 자식 관계라고 보면 될 것 같음.(업캐스팅)
        // initialCapacity에 초기값을 입력해 줄 수 있음. 컬렉션 프레임워크는 수용력을 자동으로 늘려줌. / 단 이럴 경우, 작업이 느림 / 그렇기에 초기값을 넉넉히 측정함.
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1.get(0));
        System.out.println(list1.size());

        list1.forEach((i -> {
            System.out.println(i);
        }));

        List<String> list2 = new ArrayList<>(10);
        list2.add("철수");
        list2.add("영희");
        list2.add("민수");

        // List<String> names = Arrays.asList("철수", "영희", "민수"); -> 이 형식은 추가 삭제가 안됨.

        list2.forEach((i)->{
            System.out.println(i);
        });
    }
}
