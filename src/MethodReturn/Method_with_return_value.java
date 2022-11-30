package MethodReturn;

public class Method_with_return_value {
    //double 타입 square 메소드
    //파라미터 : double x
    //x*x를 반환
    public static double square(double x){
        return x*x;
    }
    //main:프로그램의 시작점
    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(square(2));
    }
}
