package org.example.e06oop.inheritance;

public class Animal {
// class 앞에 final을 붙이면 상속 자체를 막을 수 있음.
    protected String name;
    protected String residence;

    public Animal(String name, String residence) {
        this.name = name;
        this.residence = residence;
        System.out.println("동물 생성자");
    }

    public String breath() {
        return String.format("%s이/가 숨을 쉽니다.", this.name);
    }

    public String living() { // 앞에 final을 부팅면 자시쪽에서 오버라이딩이 안되도록 설정이 가능함.
        return String.format("%s이/가 %s에서 삽니다.", this.name,this.residence);
    }
    // final public String living() { // 앞에 final을 부팅면 자시쪽에서 오버라이딩이 안되도록 설정이 가능함.
    //     return String.format("%s이/가 %s에서 삽니다.", this.name,this.residence);
    // } -> 이렇게 코딩하고 자식에서 override를 사용하면 오류가 발생함.

}
