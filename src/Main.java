public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
/*     Код не работает из-за деления на ноль, решение: 1. обернуть деление в try-catch,
                                        2. добавить проверку в лямбда выражении переменной devide
    1.    try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить нельзя");
       }

    2. BinaryOperator<Integer> devide = (x, y) -> {
        if (y != 0) {
            return x / y;
        }
        System.out.println("Ошибка! На ноль делить нельзя");
        return y;
    };
 */

    }
}