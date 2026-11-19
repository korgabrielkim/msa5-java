package org.example.e06oop.inheritance;

// IS-A: 개는 동물이다.
public class AiDog extends AiAnimal {
    // HAS-A: 개는 꼬리를 가지고 있다.
    private final AiTail tail = new AiTail();

    public void wagTail() {
        tail.wag();
    }
}
