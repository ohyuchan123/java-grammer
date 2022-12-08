package Condition;

import java.util.Scanner;

public class Bear {

    public static void order(int age){
        //18세 이상인 경우 메세지를 출력!
        if(age>=18){
            System.out.println("주문이 완료되었습니다!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        order(age);
    }

}
