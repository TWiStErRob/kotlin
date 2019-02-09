package test;

public class ArithmeticExpressionInParam {
    public @interface Anno {
        double value();
    }

    @Anno(-1.0/0.0)
    public static class Class1 {}
    @Anno(1.0/0.0)
    public static class Class2 {}
    @Anno(0.0)
    public static class Class3 {}
}
