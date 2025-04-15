package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75; // 원하는 점수로 변경 가능
        System.out.println("점수: " + score);

        if (score >= 90 && score <= 100) {
            System.out.println("점수가 90~100입니다.");
            System.out.println("등급은 A등급입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B등급입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C등급입니다.");
        } else {
            System.out.println("점수가 0~69입니다.");
            System.out.println("등급은 D등급입니다.");
        }
    }
}

