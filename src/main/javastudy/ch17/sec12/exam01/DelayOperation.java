package javastudy.ch17.sec12.exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DelayOperation{
    public static void main(String[] args) throws InterruptedException {

    /* 지연 연산
    * - 최종 연산이 수행되기 전까지 중간 연산은 실행되지 않음
    * */
    List<String> names = Arrays.asList("신짱구","훈이","유리","김철수");
    Stream<String> stream = names.stream() // 스트림 생성

            .filter(name -> {
                System.out.println("filter:" + name);
                    return name.length() >2;

})
            .map(name->{
            System.out.println("map:" + name);
            return name + "님";
            });
        // 여기까지 작성하고 실행해봤자  결과 출력 X
        Thread.sleep(3000);

        //최종 연산 호출
        stream.forEach(System.out::println);
}
            }


