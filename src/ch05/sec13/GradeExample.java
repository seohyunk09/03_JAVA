package ch05.sec13;

public class GradeExample {

    public static void main(String[] args) {

        Grade myGrade = Grade.A;
        System.out.println("myGrade = " + myGrade);
        System.out.println("점수는 "+myGrade.getScore());
        System.out.println("설명 " + myGrade.getDescription());

     /*   for(Grade grade : Grade.values()) {
            System.out.printf("%s=%d점 (%s)%n",
                    grade) // 등급이름
                    // );
        }*/


    }
}
