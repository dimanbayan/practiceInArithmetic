package guru.qa;

public class ArithmeticPractice {
    public static void main(String[] args) {
        int number1 = 456;
        byte number2 = 123;

        System.out.println("Результат сложения");
        System.out.println(number1 + number2);

        System.out.println("Результат вычитания");
        System.out.println(number2 - number1);

        System.out.println("Результат умножения");
        System.out.println(number1 * number2);

        System.out.println("Результат деления");
        System.out.println(number1 / number2);

        System.out.println("Результат вычисления остатка от деления");
        System.out.println(number1 % number2);

        //Переполнение
        byte borderByte =  127;
        System.out.println((byte)(borderByte + 25));

        int halfInt = Integer.MAX_VALUE / 2;
        System.out.println(halfInt * 3);

        //if
        System.out.println(2 < 5
                ? "Два меньше пяти"
                : "Два больше пяти");


//        комбинации типов
        int testInt = Integer.MAX_VALUE / 2;
        double testDouble = 2147483648.0 * 10;
        System.out.println(testInt + testDouble);

        resultOfMultiplication(489, -999874);
    }

    static void resultOfMultiplication(int n1, double n2){
        double mult = n1 * n2;
        String posOrNeg = mult > 0
                ? "число положительное"
                : "число отрицательное";

        String type = "";
        if (mult > Integer.MAX_VALUE) {
            type = "в границах диапазона типа данных double";
        } else {
            type = "в границах диапазона типа данных int";
        }

        System.out.println("Результат умножения - " + posOrNeg + " " + type);

    }
}
