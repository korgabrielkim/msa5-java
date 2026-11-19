package org.example.e06oop.interfaceedu;

class Whale extends Mammal implements Swim {
    Whale() {
        super("고래", "바다");
    }

    @Override
    public String residence() {
        return String.format("%s가 %s에 삽니다", super.name, super.residence);
        // 부모에 사용한 필드명은 자식에게서 동일한 필드명으로 사용하는 것을 지양해야함.
        // 참고로 위의 super 자리에 this를 사용해도 현재 코드에서는 동일한 결과가 나옴.
        // but, 만약 자식에서 필드명이 겹치게 되면 this를 사용했을 때 결과 값이 다름.
    }
    public String swimming() {
        return String.format("%s가 헤엄칩니다.",super.name);
    }
}
