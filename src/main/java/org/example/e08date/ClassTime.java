package org.example.e08date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;


public class ClassTime {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2026, 9, 28);
        LocalDate today = LocalDate.now(ZoneId.of("Asia/Seoul"));

        // 2026년 9월 28일 이후의 공휴일입니다.
        LocalDate[] holidays = {
                LocalDate.of(2026, 10, 3),  // 개천절
                LocalDate.of(2026, 10, 5),  // 개천절 대체공휴일
                LocalDate.of(2026, 10, 9),  // 한글날
                LocalDate.of(2026, 12, 25)  // 성탄절
        };

        int classDays = 0;
        int totalHours = 0;

        // 시작일부터 오늘까지 하루씩 이동합니다.
        for (LocalDate date = startDate; !date.isAfter(today); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                // 주말에는 수업을 계산하지 않습니다. 바깥 반복문이 다음 날짜로 넘어갑니다.
            } else {
                boolean isHoliday = false;
                for (LocalDate holiday : holidays) {
                    if (date.isEqual(holiday)) {
                        isHoliday = true;
                        // 공휴일을 찾았으므로 공휴일 목록을 검사하는 반복문을 끝냅니다.
                        break;
                    } else {
                        // 날짜가 다르면 목록의 다음 공휴일을 검사합니다.
                    }
                }

                if (isHoliday) {
                    // 공휴일이면 수업일 수와 총 수업 시간을 그대로 둡니다.
                } else {
                    // 공휴일이 아닌 평일이면 수업 1일과 8시간을 더합니다.
                    classDays++;
                    totalHours += 8;
                }
            }
        }

        System.out.println("계산 기간 (한국 시간)  " + startDate + " ~ " + today);
        System.out.println();
        System.out.println("수업일 수  " + classDays + "일");
        System.out.println("총 수업 시간  " + totalHours + "시간");
    }
}
