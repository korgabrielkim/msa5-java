package org.example.e14record;
// 레코드는 객체를 정의하는 방법 중 하나임.

// public class EduRecord {

    // // 기존 클래스 방식의 DTO 생성
    // private final String name;
    // private final int age;
    //
    //
    // public EduRecord(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }
    //
    // public String getName() {
    //     return name;
    // }
    //
    // public int getAge() {
    //     return age;
    // }
    //

    // 레코드 방식의 DTO 생성
// }

    public record EduRecord(
            String name,
            int age
    ){}
