package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args){
// 정수형 배열 3개 생성 (초기화 안함 → 기본값: 0)
        int[] arr1 = new int[3];

        // arr1 배열 출력
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        System.out.println(); // 구분선

        // 문자열 배열 3개 생성 (초기화 안함 → 기본값: null)
        String[] arr2 = new String[3];

        // arr2 배열 출력
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }
}