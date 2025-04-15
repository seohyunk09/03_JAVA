package ch05.advancedprob;
/*주어진
배열 항목에서 최대값을 출력하는 코드를 작성하세요 (for 문 이용*/
public class num5 {
    public static void main(String[] args) {
    int[] array= {1,5,3,8,2};
    int max = array[0]; // 첫 번째 요소를 기준으로 시작
        for(int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
        System.out.println("최대값: " + max);
}
}

