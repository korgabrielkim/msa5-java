package org.example.e12stream;

import org.example.e06oop.inheritance.Whale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        List<Integer> list1 = Arrays.asList(10,20,30,40,50,60,70,80,90);


        List<Integer> listCopy = new ArrayList<>();
        list.forEach(integer -> {
            listCopy.add(integer + 3);
        });
            System.out.println(listCopy);


        for(int idx = 0; idx <list.size(); idx++){
            listCopy.add(list.get(idx)+3);
        }
         System.out.println(listCopy);

        List<Whale> whaleList = new ArrayList<>();
        whaleList.add(new Whale("핑크고래","바다"));
        whaleList.add(new Whale("블루고래","바다"));
        whaleList.forEach((item)->{
            System.out.println(item.living());
        });
    // 스트림을 활용하기!
        List<Integer> result1 = list1.stream() // 일단, stream을 사용했다고 보이면 루프(반복) 작업을 했다고 보면 됨.
                .map((i)-> {
                    return i + 3;
                })
                .toList();
        System.out.println(result1);

    // 짝수의 개수를 구해주세요!
        int cnt = 0;
        for(int idx2 = 0; idx2<list.size(); idx2++){
            if(list.get(idx2) % 2 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);

        long result2 = list.stream()
                .filter((i) -> i % 2 == 0)
                .count(); // 반환되는 결과값의 형태 및 성질에 따라서 최종 연산자를 선택(이때 데이터 타입도 맞춰줘야함)해서 사용해야함.
    }
}
