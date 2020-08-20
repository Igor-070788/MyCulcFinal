public class Main {
    public static void main(String[] args) throws IncorrectMyInput {
        MyInput inputOutput = new MyInputConsole();
        DataVerification verification = new ArabicRomanRegex();
        ConverterNumber converterNumber = new RomanToArabic();
        Calc calc = new Calculator();
        Parsing calculator = new Parsing(inputOutput, verification, converterNumber, calc);
        calculator.start();
    }
}
