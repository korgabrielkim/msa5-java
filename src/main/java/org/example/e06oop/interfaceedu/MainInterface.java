package org.example.e06oop.interfaceedu;

public class MainInterface {
    public static void main(String[] args) {
        FlyingFish flyingFish = new FlyingFish();
        System.out.println(flyingFish.birth());
        System.out.println(flyingFish.flying());
        System.out.println("테스트");

        Whale whale = new Whale();
        System.out.println(whale.residence());
    }


}
