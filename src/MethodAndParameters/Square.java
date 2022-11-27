package MethodAndParameters;

public class Square {
    //void 타입의 printSquare 메소드
    public static void printSquare(int x/*파라미터*/){
        //int 타입의 x 파라미터를 가지고 있음.
        System.out.println(x*x);
    }

    //프로그램의 시작점
    public static void main(String[] args) {
        int value=2;
        printSquare(value); //printSquare() 호출!
        printSquare(3);
        printSquare(value*2);
    }
}
