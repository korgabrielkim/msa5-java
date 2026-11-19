package org.example.e06oop;

public class ConstructOOP {
    // 생성자 (Constructor) 메소드
    // 크래스를 인스턴스화 할때, 최초 1회만 실행되는 메소드.
    // 주로 이 객체를 생성하면서, 그와 동시에 초기값으로 세팅하고 싶을 때, 이런 상황에 주로 사용.
    // -> 객체의 초기화 또는 인스턴스 생성 시, 실해오디어야 할 작업을 위해 사용.

    // 기본 생성자(defualt Constructor) : 개발자가 생성자를 별도로 정의하지 않으면 자동으로 생성되는 생성자.
    // 생성자는 기본적으로 클래스 명과 동일하게 감.
    private String name;
    private int age;
    private final char gender;
    public ConstructOOP() { // <- 기본 생성자 형태.
        this("무명", 20, 'M');
      }

        // 커스텀 생성자
        public ConstructOOP(String name) {
            // this(); // 기본생성자 호출이 생략되어 있음.
            // this 참조 변수 : 클래스 자기 자신을 지칭함.
            // this.name = name;
            this(name, 20);
        }
        public ConstructOOP(String name, int age) {
            // this(name);
            // this.age = age;
            this(name, age, 'M');
        }
        public ConstructOOP(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            // this(name, age);
            // this.gender = gender;
        }
}

// public class Unit(){ -> 캐릭 케릭터를 예로 활용을 보여주는 예시.
//
//     private String name;
//     private int hp;
//     private int attack;
//     private int armor;
//     private int upgrde;
//
//     Unit() {
//         this.name = "마린";
//         this.hp = 40;
//         this.attack = 6;
//         this.armor = 0;
//         this.upgrde = 0;
//     }
//     Unit(String name) {
//         this.name = name;
//         this.hp = 40;
//         this.attack = 6;
//         this.armor = 0;
//         this.upgrde = 0;
//     }
//     Unit(String name, int hp) {
//         this.name = name;
//         this.hp = hp;
//         this.attack = 6;
//         this.armor = 0;
//         this.upgrde = 0;
//     }
// }


