package ch05.sec05;

public class SubStringExample {

    public static void main(String[] args) {
        String ssn = "8808151234567";

        String firstNum = ssn.substring(0, 6);    // 0~5 인덱스 → 앞 6자리
        System.out.println(firstNum);

        String secondNum = ssn.substring(6);      // 인덱스 6부터 끝까지
        System.out.println(secondNum);
    }
}
