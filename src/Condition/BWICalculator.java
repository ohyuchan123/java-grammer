package Condition;

public class BWICalculator {
    public static double calculateBMI(double weight,double tall){
        /*bmi 지수를 계산하여 반환하시오.*/
        return weight/(tall*tall);
    }

    //비만도를 출력
    public static void printBMIClassification(double bmi){
        System.out.printf("BMI : %.2f\n",bmi);
        if(bmi>30)
            System.out.println("비만입니다.");
        else if(bmi>=25)
            System.out.println("과체중입니다.");
        else if(bmi>=18.5)
            System.out.println("정상입니다.");
        else
            System.out.println("저체중입니다.");
    }

    //프로그램의 시작점
    public static void main(String[] args) {
        //체중, 키 입력
        double weight = Double.parseDouble(args[0]+"."+args[1]);
        double tall = Double.parseDouble(args[2]+"."+args[3]);

        //BMI 지수 계산
        double bmi = calculateBMI(weight,tall);

        //비만도 결과 출력
        printBMIClassification(bmi);
    }
}

