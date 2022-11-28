package MethodAndParameters;

public class Multiply {
    public static void times(double a,double b){
        System.out.println(a*b);
    }

    //프로그램의 시작점
    public static void main(String[] args) {
        times(2,2);//int값을 넣어 주었지만 자동으로 double(실수)로 형변환을 시켜줌
        times(3,4);
    }
}
