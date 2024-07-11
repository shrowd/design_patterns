package composite;

public class Main {

    public static void main(String[] args) {
        Constant zero = new Constant(false);
        Constant one = new Constant(true);

        Expression expressionOne = new And(
                new Or(
                        new And(
                                zero,
                                one,
                                new Not(one),
                                zero
                        ),
                        one,
                        zero
                ),
                one
        );

        System.out.println("Expression one value: " + expressionOne.value());


        Variable x = new Variable('x', false);
        Expression expressionTwo = new Or(
                x,
                new Not(new Constant(true)),
                new Constant(false)
        );

        System.out.println("Expression two value: " + expressionTwo.value());
    }
}
