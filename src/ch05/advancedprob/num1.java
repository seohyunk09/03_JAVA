package ch05.advancedprob;
/*for문을 이용해서 1 부터 100 까지의 정수 중에서 3 의 배수의 총합을 출력하는 코드를 작성하세요*/
public class num1 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수의 총합: " + sum);
    }
}