package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. x, y 입력받아 합 출력
        System.out.print("x 값 입력: ");
        int x = scanner.nextInt();

        System.out.print("y 값 입력: ");
        int y = scanner.nextInt();

        System.out.println("x + y: " + (x + y));

        scanner.nextLine(); // nextInt 이후 버퍼 정리용

        // 2. 문자열 입력 반복 (q 입력 시 종료)
        while (true) {
            System.out.print("입력 문자열: ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                System.out.println("종료합니다.");
                break;
            }

            System.out.println("출력 문자열: " + input);
        }

        scanner.close();
    }
}

