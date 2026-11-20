package org.example.e08date;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // (로컬의) 현재 시간 획득.
        // System.out.println(now);

        LocalDateTime targentDate = LocalDateTime.of(2026, 11,27, 15,30,00);
        // System.out.println(targentDate);

        // ISO 표준 시계열 문자열 -> 날짜 객체로 변경
        LocalDateTime parsedDate = LocalDateTime.parse("2026-11-07T11:30:12");
        // System.out.println(parsedDate);

        // ISO 표준 시계열 이외의 문자열 -> 날짜 객체로 변경(포멧터를 이용)
        String date = "2026-11-01 11:30:12"; // <- MySql에서 데이터를 넘어 올 때 예상되는 형태.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDate2 = LocalDateTime.parse(date, dateTimeFormatter);
        // System.out.println(parsedDate2);

        LocalDate now2 = LocalDate.now();
        // System.out.println(now2);

        String date2 = "2026-11-01"; // <- MySql에서 데이터를 넘어 올 때 예상되는 형태.
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate3 = LocalDate.parse(date2, dateFormatter);
        // System.out.println(parsedDate3);

        // <날짜 계산>

        // 오늘로 부터 하루 뒤 날짜 계산
        LocalDateTime addOneDayFromNow = now.plusDays(1L); // 숫자뒤에 대문자 L을 붙인 이유는 Loing 타입이기 때문에.
        // now는 원본이 절대로 변하지 않는 것이기에 불변객체(immutable).
        // System.out.println(now);
        // System.out.println(addOneDayFromNow);

        LocalDateTime delOneDayFromNow = now.minusDays(1L);
        // System.out.println(delOneDayFromNow);

        // 상대적(특정) 날짜를 계산(TemporalAdjusters)
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        // System.out.println(firstDayOfMonth);
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        // System.out.println(lastDayOfMonth);
        // System.out.println(firstDayOfMonth.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));

        // 기준 일로 부터 일정 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2025,9,10);
        System.out.println(d1.isBefore(d2)); // -> d1이 d2보다 과거인지를 확인하는 메소드.
        System.out.println(d1.isAfter(d2)); // -> d1이 d2보다 미래인지를 확인하는 메소드.
        System.out.println(d1.isEqual(d2)); // -> d1이 d2와 같은지를 확인하는 메소드.
        // period 객체 : 두 날짜의 연/월/일을 단위로 분해해서 각각의 차를 구하는 객체 -> 사용에 주의가 필요함.
        Period p1 = Period.between(d1, d2);
        System.out.println(Math.abs(p1.getYears())); // => 결과 값 : 1
        System.out.println(Math.abs(p1.getMonths())); // => 결과 값 : 2
        System.out.println(Math.abs(p1.getDays())); // => 결과 값 : 10
        System.out.println(p1.toString()); // toString()을 생략해도 해당 메소드가 자동으로 실행이 됨.
        // ChronoUnit 객체
        long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untilDays)+"일");
        LocalDate d3 = LocalDate.of(2026,9,28);
        long classDays = d1.until(d3, ChronoUnit.DAYS);
        System.out.println(classDays);
        // LocalDateTime -> LocalDate 추출.
        LocalDate extractLocalDateFromNow = now.toLocalDate();
        System.out.println(extractLocalDateFromNow);
    }
}
