package org.example.e05array;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 길이 3의 인트 배열을 생성 및 초기화
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr2 = {1, 2, 3}; // 선언하면서 각 인트의 값까지 넣어서 초기화 하는 것임. 즉, 위의 과정을 1줄로 줄였다고 보면 됨.
        System.out.println(Arrays.toString(arr));

        // 배열의 복사
        int[] originArr = {1, 5, 9};
        // int[] copyArr = originArr; -> 이렇게 하면 copyArr를 변경하면 originArr도 변경되어 버림. (얕은 복사)

        // 배열의 깊은 복사
        // system.arraycopy();를 이용해서 깊은 복사를 할 수 있음.
        int[] originArrSystem = {1, 2, 3};
        int[] copyArrSystem = new int[originArrSystem.length * 2]; // .length -> 배열의 길이를 반환해 줌 / * 2는 안전하게 두배를 부여한 거임
        // new는 새로운 객체를 생성하겠다는 명령어임.
//        System.arraycopy(
//                복사할 변수,
//                인덱스 몇번 부터 복사,
//                복사 받아올 변수,
//                받아올 변수에 몇번 부터 복사 시킬 건지,
//                어디까지 복사해 올건지
//        );
        System.arraycopy(
                originArrSystem,
                0,
                copyArrSystem,
                0,
                originArrSystem.length
        );
        copyArrSystem[0] = 999;
        // Arrays.copyof() 이용해서 깊은 복사
        int[] originArrArays = {1,2,3};
        int[] copyArrArrays = new int[originArrArays.length *2];
        copyArrArrays = Arrays.copyOf(originArrArays,originArrArays.length);
//        copyArrArrays = Arrays.copyOf(원본, 원본 길이);
        copyArrArrays[0] = 999;

        // Arrays.copyOf를 직접 구현했을 때 형태
        int[] originFor = {1,2,3};
        int[] copyFor = new int[originFor.length*2];
        for (int i = 0; i < originFor.length; i++) {
            copyFor[i] = originFor[i];
        }
//        ↑↑↑↑↑ 위의 결과 값과 동일한 새로운 방식.
        int idx = 0;
        for(int val : originFor){
            copyFor[idx] = val;
            idx++;
        }

        // 다차원 배열
        int[][] multiArr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(multiArr[1][1]);

        // <배열의 API>
        int[] arr3 = {1,2,3};
        int[] arr4 = {1,2,3};

        // 배열의 길이
        System.out.println(arr.length);

        // 배열이 같은지 비교
        System.out.println(Arrays.equals(arr3, arr4));
        // arrays.deepEquals(arr1, arr2) : 다차원 배열의 비교
        int[][] deepArr1 = {{1,2,3},{4,5,6}};
        int[][] deepArr2 = {{1,2,3},{4,5,7}};
        System.out.println(Arrays.deepEquals(deepArr1,deepArr2));

        // Arrays.sort(arr) : 배열의 정렬 ※ 성능 이슈가 많이 나기 때문에 사용을 지양해야함.
        int[] sortArr = {154,562,487,2,156,215};
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr));
    }
}
