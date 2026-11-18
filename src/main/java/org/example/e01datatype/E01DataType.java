package org.example.e01datatype;

public class E01DataType {
    public void execute(){
        //함수: 객체에 속하지않고 독립적으로  만들어진 함수
        //매서드: 객체에 속해 있고 객체의 동작을 정의 하는  함수
        boolean bool = true;
        bool = false;
        //bool = 1; 선언할때의 데이터 타입과 다를 경우, 타입에러가 발생한다.
        System.out.println(bool);
        System.out.println(bool);
        System.out.printf("현재 변수 bool의 값은 %s",bool);


        // 변수 선언
        int age;
        age = 1;
        char ch = 'a';
        String str = "a";

        // 상수
        final String USER_NAME = "길동이";

        // Underscore 표기법
        int num = 1_020_304_010;

        // 두 변수의 값을 스와핑
        int swap1 = 1;
        int swap2 = 2;
        int tmp = swap1;

        swap1 = swap2;
        swap2 = tmp;

        // 데이터 타입
        boolean bool2 = true;
        byte bt = -128;
        short sh = 32767;
        int integer = 2147483647;
        long longer = 2147483647L; // long 타입은 반드시 가장 뒤에 'L'을 붙여줄 것

        double db = 3.141592;
        float ft = 3.141592F; //  float 타입은 반드시 가장 뒤에 'F'를 붙여줄 것

        char ch1 = 'g';

    }
}