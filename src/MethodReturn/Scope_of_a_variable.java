package MethodReturn;

public class Scope_of_a_variable {
    public static void printSquare(int x){
        System.out.println("printSquare x = "+x);
        //25
        x = x*x;
        System.out.println("printSquare x = "+x);
        //25
    }

    public static void main(String[] args) {
        int x =5;
        System.out.println("main x = "+x);
        //5
        printSquare(x);
        System.out.println("main x = "+x);
        //5
    }
}
