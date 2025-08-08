package Day01;

public class Day01 {
    public static void main(String[] args) {

        // System.out.println("Java 기초");
        // System.out.println("인사하기");
        // System.out.println("줄바꿈 없이 출력 1");
        // System.out.println("줄바꿈 없이 출력\n");

        // System.out.println("기본 시스템 출력 코드");

        /**
         * 변수와 데이터 타입
         */

        // 정수형 변수
        byte smallNumber = 127; // -128 ~127
        short mediumNumber = 30000; // -32,768 ~ 32,767
        int normalNumber = 2100000000; // 가장 많이 사용
        long BigNumber = 9223372036854775807L; // 뒤에 L 붙임

        // 실수형 변수
        float price = 3.14f; // 뒤에 f 붙임
        double score = 95.5; // 가장 많이 사용

        // 문자형과 문자열
        char grade = 'A'; // 작은따음표, 한 글자만
        String name = "홍길동"; // 큰따옴표, 여러 글자, 가장 많이 사용

        // 논리형
        boolean isStudent = true; // true 또는 false
        boolean isGraduated = false;

        // 출력해보기
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
        System.out.println("등급 : " + grade);
        System.out.println("학생인가? : " + isStudent);
        System.out.println("큰 숫자 : " + BigNumber);

        // 변수 값 변경
        score = 87.5;
        System.out.println(score);
    }

}
