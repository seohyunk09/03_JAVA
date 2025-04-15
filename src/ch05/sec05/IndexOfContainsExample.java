package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args){
    String subject = "자바 프로그래밍";
        // "프로그래밍" 단어의 시작 위치 출력
        int index = subject.indexOf("프로그래밍");
        System.out.println(index);

        // "자바"가 포함되어 있는지 검사
        if (subject.contains("자바")) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }
}