package ch08.temp;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {


        List<String> list  = new ArrayList<String>();
      /*  List<String> = new LinkedList<String>();*/



            // 인터페이스를 상속받는 객체들은
            // 같은 이름의 메서드를 지니고 있다.(오버라이딩 강제화)
            // 인터페이스 타입 변수 = new 상속 받은 자식 클래스();
            //=> 다형성(업캐스팅)+ 동적 바인딩
            //=> 실제 참조 중인 객체(ArrayList 또는 LinkedList)의 add()와 연결

            // 3.인터페이스 제공 메서드를 호출
            // (모든 자식 클래스는 인터페이스에서 제공받은 메서드를 가지고 있다.
            //-> 인터페이스 타입 변수 = new 상속 받은 자식 클래스();에서
            // 자식 클래스 (A) 를 다른 자식 클래스 (B)로 변경할 수 있다.
            
            list.add("짬뽕");
            list.add("짜장");
            list.add("탕수육");
            list.add(1,"간짜장");
            list.add(0, "크림 새우");
            list.add(0, "크림 새우");
            list.add(0, "크림 새우");
            list.add(0, "크림 새우");


    }
}
