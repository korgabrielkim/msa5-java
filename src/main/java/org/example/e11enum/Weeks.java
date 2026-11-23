package org.example.e11enum;

public enum Weeks {
    MONDAY("월요일", 1), // = Weeks MONDAY = new Weeks("월요일");
    TUESDAY("화요일", 2),
    WEDNESDAY("수요일", 3),
    THURSDAY("목요일", 4),
    FRIDAY("금요일", 5),
    SATURDAY("토요일", 6),
    SUNDAY("일요일", 0);

    private final String krDay;
    private final int dayNum;

    Weeks(String krDay, int dayNum){
        this.krDay = krDay;
        this.dayNum = dayNum;
    }
    // getter of krDay
    public String getKrday() {
        return this.krDay;
    }
    // getter of dayNum
    public int getDayNum() {
        return dayNum;
    }
}


// ↓↓↓↓↓ enum을 사용하지 않았을 때.
// public class Weeks {
//     // Enum : 상수의 집함을 편리하게 선언하고 사용하기 위해서 만든 객체
//     // → 공통성 있는 상수를 모아 둔다고 쉽게 생각하면 될 듯.
//     // 상수들을 한 곳에 모아서 관리하기에 type의 안정성도 확보 할 수 있음.
//
//     // public static final String MONDAY = "월요일"; -> 데이터 변경의 리스크 있음.
//     // public static final Weeks MONDAY = new Weeks("월요일");
//     // public static final Weeks TUESDAY = new Weeks("화요일");
//
//     public final static String MONDAY = "월요일";
//     public final static String TUESDAY = "화요일";
//
//     public static String convertKrtoEn(String day) {
//         switch (day) {
//             case Weeks.MONDAY:
//                 return "MONDAY";
//             case Weeks.TUESDAY:
//                 return "TUESDAY";
//             default:
//                     return "";
//         }
//     }
//
//     private final String day;
//
//     private Weeks(String day) {
//         this.day = day;
//     }
//
//     public String getDay() {
//         return this.day;
//     }
// }
// // 클래스가 이미 닫혔으므로, 컴파일 오류를 일으키는 원본 닫는 중괄호를 주석으로 보존한다.
// // }
