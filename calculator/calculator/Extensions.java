package calculator;

public class Extensions {
    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new ExtendedInterpreter(engine);
    }
}
