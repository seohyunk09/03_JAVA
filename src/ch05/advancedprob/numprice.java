package ch05.advancedprob;

import java.util.Scanner;

public class numprice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0; // 잔고 변수

        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------");
            System.out.print("선택> ");

            int choice = scanner.nextInt(); // 사용자 입력

            if (choice == 1) {
                System.out.print("예금액> ");
                int deposit = scanner.nextInt();
                balance += deposit;

            } else if (choice == 2) {
                System.out.print("출금액> ");
                int withdraw = scanner.nextInt();
                balance -= withdraw;

            } else if (choice == 3) {
                System.out.println("잔고> " + balance);

            } else if (choice == 4) {
                System.out.println("프로그램 종료");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        scanner.close();
    }
}
