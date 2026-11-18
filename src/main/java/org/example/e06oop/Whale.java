package org.example.e06oop;

public class Whale {
    // 필드(field)
    public String name = "고래"; // -> 인스턴스 변수 // name은 whale라는 클래스를 인스턴스화 해야지 접근할 수 있는 변수.(필드 or 프로파티 정도로 실무에서는 부름)
    public static int age = 20; // 클래스 변수 or 클래스 메소드 -> static은 미리 메모리에 올려 둚. 그래서 외부에서 불러올 때 인스턴스화가 필요 없음.
    // static은 보통 설정값, 외부서버 주소값 등 내가 수시로 사용해야하는 경우에만 사용하는 것이 좋음. why? 모두 static을 쓰면 메모리가 무거워지기 때문에.

    // 메소드(Method)
    public void swimming(){
        System.out.println("고래가 헤엄칩니다.");
    };
}
