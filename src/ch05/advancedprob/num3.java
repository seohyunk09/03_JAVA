package ch05.advancedprob;
/*중첩
for 문을 이용하여 방정식 4x + 5y = 60 의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작
성하세요 . 단 x 와 y 는 10 이하의 자연수 입니다*/
public class num3 {

    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}