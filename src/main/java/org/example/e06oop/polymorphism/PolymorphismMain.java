package org.example.e06oop.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Whale whale1 = new Whale();
        Mammal whale2 = new Whale();

        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();

        Saba saba1 = new Saba();
        // Mammal saba2 = new Saba();

        Mammal[] arr = new Mammal[5];
        arr[0] = new Whale();
        arr[1] = new Monkey();

        // -------------------
        Mammal upCasting1 = new Whale();
        // 캐스팅이 형변환을 의미함. 위의 경우 자식 클래스가 부모 클래스 타입으로 캐스팅 되는 상태 => 업캐스팅!
        // 부모클래스로 캐스팅 되면 자식 클래스에 있는 멤버에는 접근이 불가능.
        // upCasting1.swimming(); -> 자식클래스의 swimming() 접근 안됨.

        // -------------------
        // 위의 문제를 해결하기 위해서 다운캐스팅이 있음.
        // 다운캐스팅 : 업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅하는 것.
        Whale downCasting1 = (Whale) upCasting1;
        // 다운캐스팅을 했다고 상속 관계가 끊어지는 것은 아님.

        Mammal Mammal1 = new Mammal();
        // Whale whale3 = (Whale) Mammal1; -> 보모를 자식이 다운캐스팅 하는 것은 안됨.
    }
}
