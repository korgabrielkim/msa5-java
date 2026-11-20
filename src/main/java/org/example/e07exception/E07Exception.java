package org.example.e07exception;

import java.io.FileWriter;
import java.io.IOException;

public class E07Exception {
// error : 수습할 수 없는 강력한 오류. / 작동이 안되는 오류.
// exception : 수습할 수 있는 경미한 오류. / 작동은 되는 오류. -> 대부분은 사람에 의한 오류임.
    public static void main(String[] args) {
        try{
            System.out.println("트라이 시작");
            // double result = 10/0;
            throw new Exception("고의 익셉션");
            // System.out.println("트라이 끝");
        } catch(ArithmeticException e){ //상위 Exception 위에 디테일한 Exception을 작성하는 것이 일반적임. 왜냐면 Try Catch문은 위에서 부터 순서에 따라 실행되기에.
            System.out.println("ArithmeticException 발생");
        } catch (Exception e) {
            System.out.println("캐치 시작");
            System.out.println(e.getMessage());
            System.out.println("캐치 끝");
        } finally {
            System.out.println("파이널리");
        }
        // -----------------------------------------------------------------
        // Try with Resource
        FileWriter file = null; // 외부데이터 저장할 공간 만들기. // 스코프 이슈 때문에 트라이 문 밖에 작성을 해야함.
        // 리소스 처리들은 외부 파일과 연결하기 위한 길을 오픈해야함. 그리고 작업 중에는 오픈 상태를 유지해 줘야함.
        // 그렇기에 작업이 끝났을 경우에는 오픈해둔 상태를 닫아 줘야 함.
        try {
            file = new FileWriter("text.txt"); // 파일을 쓰기 모드로 불러오기.
            file.write("안녕. 자바!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(file != null) {
                   file.close(); // 리소스를 닫아주는 명령어.
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // -----------------------------------------------------------------
        // try with resource 문법 (위의 코드와 동일한 작업값이 도출됨)
        try(FileWriter file1 = new FileWriter("text.txt")){
            file1.write("안녕! 안녕!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
