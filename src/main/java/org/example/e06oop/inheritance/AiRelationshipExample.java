package org.example.e06oop.inheritance;

public class AiRelationshipExample {
    public static void main(String[] args) {
        AiDog dog = new AiDog();

        AiAnimal animal = dog;
        animal.breathe();

        dog.wagTail();
    }
}
