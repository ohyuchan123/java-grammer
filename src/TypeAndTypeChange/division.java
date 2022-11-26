package TypeAndTypeChange;

public class division {
    //int/int 형태의 나눗셈 연산은 소수점이하가 버려집니다.

    public static void main(String[] args) {
        double a = 5.0 / 2.0;
        System.out.println("a = " + a);

        int b = 4 / 2;
        System.out.println("b = " + b);

        int c = 5 / 2;
        System.out.println("c = " + c);

        double d = 5 / 2;
        System.out.println("d = " + d);
    }
}
