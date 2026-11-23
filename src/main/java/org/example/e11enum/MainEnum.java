package org.example.e11enum;
// 상수를 관리하는 방법.
public class MainEnum {
    public static void main(String[] args) {
        Weeks monday = Weeks.MONDAY;
        System.out.println(monday);
        System.out.println(monday.name());
        System.out.println(monday.getKrday());

        Weeks tuesday = Weeks.TUESDAY;
        System.out.println(tuesday.getKrday());

        System.out.println(Weeks.FRIDAY.getKrday());

        System.out.println(Weeks.SUNDAY.ordinal()); // 연산에서 사용하기 위한 값 X, 단순히 작성된 순서이기에 순서를 보장하지 않음.
    }
}

// ↓↓↓↓↓ enum을 사용하지 않았을 때.
// public class MainEnum {
//     final String test = "test";
//
//     // main 메서드를 추가해 MainEnum을 직접 실행할 수 있게 한다.
//     public static void main(String[] args) {
//         // 같은 패키지의 Weeks 상수를 참조하고, getDay()로 한글 요일 이름을 가져온다.
//         // System.out.println(Weeks.MONDAY.getDay());
//         // System.out.println(Weeks.TUESDAY.getDay());
//         System.out.println(Weeks.MONDAY);
//         System.out.println(Weeks.TUESDAY);
//     }
// }
