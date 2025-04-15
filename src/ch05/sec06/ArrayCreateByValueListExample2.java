package ch05.sec06;

public class ArrayCreateByValueListExample2 {

    public static void main(String[] args){
    int[] scores = new int[] { 83, 90, 87 };
    printItem(scores);
}
    public static void printItem(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("scores[" + i + "] : " + array[i]);
        }
    }

}
