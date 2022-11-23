package Variable;

public class Type {
    public static void main(String[] args) {
        //변수의 형태
        int score=96; //정수 int 타입
        double weight = 82.4; //실수 double 타입 (float 도 가능)
        boolean isMale = true; //참/거짓을 가지는 타입
        String name = "자바";//문자열을 자장하는 타입

        //출력하는 방법
        System.out.println("점수 = "+score); //변수를 그대로 대입하면 됨
        System.out.println("무게 = "+weight);
        System.out.println("참 or 거짓 = "+isMale);
        System.out.println("이름 = "+name);
    }
}
