package ch05.advancedprob;

public class num2_2 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { // 줄 수
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

