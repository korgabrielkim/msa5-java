package org.example.e06oop;

import org.example.e06oop.inheritance.FlyingFish;
import org.example.e06oop.inheritance.Whale;

public class MainOOP {

    public static void main(String[] args) {
        // Whale whale = new Whale();
        // System.out.println(whale.name);
        // // FlyingFish flyingfish = new FlyingFish();
        // FlyingFish flyingfish = new FlyingFish("날치", "바다");
        //
        // whale.swimming();
        // whale.name = "돌고래";
        // System.out.println(whale.name);
        // System.out.println(Whale.age);

        AccessModifier accessmodifer = new AccessModifier();
        System.out.println(accessmodifer.strDefault);
        accessmodifer.fnPublic();
        accessmodifer.fnProtected();

        // 오버로딩(Overloading)
        // 메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의하는  기술
        // 시그니처 : 메소드의 파라미터 부분을 시그니처라고 칭함. -> 파라미터의 데이터 타입이 다르거나, 갯수가 다르거나를 의미.
        System.out.println();
        System.out.println(OverloadingOOP.add(1));
        System.out.println(OverloadingOOP.add(1,2));
        // 유저가 보내주는 형식이 제각각일 수 있기 때문에 개발자는 데이터 타입을 다양하게 고려하고 말들어야 함.

        ConstructOOP constructOOP = new ConstructOOP();

        // <상속>
        FlyingFish flyingFish = new FlyingFish("날치","바다");
        System.out.println(flyingFish.breath());
        System.out.println(flyingFish.flying());
        System.out.println(flyingFish.living());

        Whale whale = new Whale("고래","바다");
        System.out.println(whale.swimming());
        System.out.println(whale.breath());
        System.out.println(whale.living());
    }
}
