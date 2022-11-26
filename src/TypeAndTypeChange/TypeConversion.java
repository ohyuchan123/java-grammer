package TypeAndTypeChange;

public class TypeConversion {
    public static void main(String[] args) {
        /*값을 대입시, 타입 불일치의 문제를 해결하는 방법은 타입을 변환하는 방법입니다.
        * 이러한 타입변환은 자동변환 되기도 하고, 캐스팅을 통해 변환 되기도 합니다.*/

        // 2->2
        int a = 2;
        System.out.println("a = "+a);

        // 2/3 -> 3.0;
        double b = 2/3;
        System.out.println("b = "+b);

         // 캐스팅 : 강제적으로 형을 변환 시킨다.
        int c = (int)1.5;
        System.out.println("c = "+c);

        //자동변환 : 0 -> 0.0
        double d = 2/3;
        System.out.println("d = "+d);

        //연산자 우선순위!
        double e = (double)2/3;
        System.out.println("e = "+e);

    }
}
