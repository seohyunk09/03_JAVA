package ch05.sec09;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = { 1, 2, 3 };
        int[] newIntArray = new int[5];

        // 복사
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        // 출력
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i]);
            if (i < newIntArray.length - 1) System.out.print(", ");
        }
    }
}