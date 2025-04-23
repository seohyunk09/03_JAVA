package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength (String data){
    int result = data.length();
    System.out.println("문자 수 : " + result);
}
public static void main(String[] args){
System.out.println ("[프로그램 시작]\n");
printLength ("ThisIsJava");
printLength(null);
System.out.println("[프로그램 종료]");
}
}
/*클래스 'ExceptionHandlingExample1'은(는) public이며, 이름이 'ExceptionHandlingExample1.java'인 파일에 선언되어야 합니다*/