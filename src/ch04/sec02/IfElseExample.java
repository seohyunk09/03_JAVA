package ch04.sec02;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 점수 입력받기
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        // 1. if-else: 90점 초과 여부 판단
        if (score > 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }

        System.out.println(); // 구분선

        // 2. if-else if-else: 구간별 등급 출력
        if (score >= 90 && score <= 100) {
            System.out.println("점수가 90~100입니다.");
            System.out.println("등급은 A입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 0~69입니다.");
            System.out.println("등급은 D입니다.");
        }

        scanner.close();
    }
}

