package org.example.e06oop.inheritance;

public class FlyingFish extends Animal {
       // private String name;
       // private String residence;

       public FlyingFish(String name, String residence) {
              super(name, residence);
              // 자바는 상속 관계일 때 부모의 인스턴스를 먼저 생성한 후 자식의 인스턴스를 만듦.
              System.out.println("날치 생성자");
       }

       // public String breath() {
       //        return String.format("%s이/가 숨을 쉽니다.", this.name);
       //        // return String.format("② 여기에 들어감 이/가 숨을 쉽니다.", ① 이곳에 작성한 것이);
       //        // %s : 스트림 %d : 숫자 %n : 개행(줄바꿈) 스펠은 소문자로 작성.
       // }
       public String flying() {
              return String.format("%s이/가 날아갑니다.", super.name);
       }
       // public String living() {
       //        return String.format("%s이/가 %s에서 삽니다.", this.name,this.residence);
       //        // return String.format(① "%s이/가 ② %s에서 삽니다.", ① this.name,② this.residence); -> 순서에 맞춰서.
       // }

       // 수정 전: 오버라이딩(Overriding) : 부모에게서 상속받은 메소드를 자식이 저정의 하여 사용.
       // 오버라이딩(Overriding) : 부모에게서 상속받은 메소드를 자식이 재정의하여 사용.
       @Override
       public String living() {
              return "수정했음!";
       }
}
// 추상화를 위해서는 일단 제일 밑에 깔려서 필요한 객체들을 나열한다.
