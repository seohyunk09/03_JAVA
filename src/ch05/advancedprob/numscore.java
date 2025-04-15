package ch05.advancedprob;

import java.util.Scanner;

public class numscore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = null;
        int studentCount = 0;

        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentCount = scanner.nextInt();
                scores = new int[studentCount];

            } else if (selectNo == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = scanner.nextInt();
                }

            } else if (selectNo == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]> " + scores[i]);
                }

            } else if (selectNo == 4) {
                int max = scores[0];
                int sum = 0;

                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }

                double avg = (double) sum / scores.length;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);

            } else if (selectNo == 5) {
                System.out.println("프로그램 종료");
                break;

            } else {
                System.out.println("올바른 번호를 선택하세요.");
            }
        }

        scanner.close();
    }
}
