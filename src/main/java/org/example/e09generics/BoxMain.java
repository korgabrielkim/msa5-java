package org.example.e09generics;

public class BoxMain {
    public static void main(String[] args) {
        Box<int[]>boxIntArr = new Box<>(new int[1]);
        Box<String[]>boxStringArr = new Box<>(new String[2]);
        Box<Integer>boxInt = new Box<>(3);

        int[] arr2;
        arr2 = new int[]{1,2,3,4,5};
        int[] arr3 = {4,5,6,7,8,9,10};

        // BoxRestrict<Tv> boxRestrictTv = new BoxRestrict<>();
        BoxRestrict<Mobile> boxRestrictMobile = new BoxRestrict<>();
        // BoxRestrict<Novel> boxRestrictNovel = new BoxRestrict<>();
        // App이라는 특정 상위 클래스만 사용할 수 있도록 extends를 주었기에 오류가 발생하는 것임.
    }
}
