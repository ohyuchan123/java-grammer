package Condition;

import java.util.Scanner;

public class Bear {

    public static void order(int age){
        //18세 이상인 경우 메세지를 출력!
        if(age>=18){
            System.out.println("주문이 완료되었습니다!");
        }else{
            System.out.println("주문을 할 수 없는 나이입니다!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        order(age);
    }

}
