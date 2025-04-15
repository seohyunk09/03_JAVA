package ch04.sec05;

import java.util.Scanner;
public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = 0;
        boolean run = true;

        while (run) {
            System.out.println("---------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("---------------------------");
            System.out.print("선택: ");

            int input = scanner.nextInt();

            if (input == 1) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (input == 2) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (input == 3) {
                run = false;
                System.out.println("프로그램 종료");
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        scanner.close();
    }
}