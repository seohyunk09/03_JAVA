package ch05.sec04;

public class NullPointerExceptionExample {

public static void main(String[] args){
    int[] intArray =new int[1];  // ✅ 배열 생성 후 사용
    intArray[0] = 10;
    String str = "Hello"; // null 안됨
    System.out.println("총 문자 수 : " + str.length());
        }
        }