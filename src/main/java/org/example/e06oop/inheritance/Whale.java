package org.example.e06oop.inheritance;

public class Whale extends Animal {
//     // 필드(field)
//     public String name = "고래"; // -> 인스턴스 변수 // name은 whale라는 클래스를 인스턴스화 해야지 접근할 수 있는 변수.(필드 or 프로파티 정도로 실무에서는 부름)
//     public static int age = 20; // 클래스 변수 or 클래스 메소드 -> static은 미리 메모리에 올려 둚. 그래서 외부에서 불러올 때 인스턴스화가 필요 없음.
//     // static은 보통 설정값, 외부서버 주소값 등 내가 수시로 사용해야하는 경우에만 사용하는 것이 좋음. why? 모두 static을 쓰면 메모리가 무거워지기 때문에.
//
//     // 메소드(Method)
//     public void swimming(){
//         System.out.println("고래가 헤엄칩니다.");
//     };


    // private String name;
    // private String residence;

    public Whale(String name, String residence) {
        super(name,residence);
        System.out.println("고래 생성자");
        // this.name = name;
        // this.residence = residence;
    }

    // public String breath() {
    //     return String.format("%s이/가 숨을 쉽니다.", this.name);
    //     // return String.format("② 여기에 들어감 이/가 숨을 쉽니다.", ① 이곳에 작성한 것이);
    //     // %s : 스트림 %d : 숫자 %n : 개행(줄바꿈) 스펠은 소문자로 작성.
    // }
    public String swimming() {
        return String.format("%s이/가 헤엄칩니다.", super.name);
    }
    // public String living() {
    //     return String.format("%s이/가 %s에서 삽니다.", this.name,this.residence);
    //     // return String.format(① "%s이/가 ② %s에서 삽니다.", ① this.name,② this.residence); -> 순서에 맞춰서.
    // }
}
