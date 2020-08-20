import java.util.regex.Matcher;

class Parsing {
    private MyInput inputOutput;
    private DataVerification verification;
    private ConverterNumber converterNumber;
    private Calc calc;

    Parsing(MyInput inputOutput, DataVerification verification, ConverterNumber converterNumber, Calc calc) {
        this.inputOutput = inputOutput;
        this.verification = verification;
        this.converterNumber = converterNumber;
        this.calc = calc;
    }

    void start() throws IncorrectMyInput {
        String str;
        while (!(str = inputOutput.input()).equals("exit")) {
            if (verification.isArabicNumber(str)) {
                Matcher resultMatch = verification.getMatcherArabicNumber(str);
                int a1 = Integer.parseInt(resultMatch.group(1));
                int b1 = Integer.parseInt(resultMatch.group(3));
                char c = resultMatch.group(2).charAt(0);
                inputOutput.output(calc.calc(a1, b1, c).toString());
            } else if (verification.isRomanNumber(str)) {
                Matcher resultMatch = verification.getMatcherRomanNumber(str);
                int a1 = converterNumber.convert(resultMatch.group(1));
                int b1 = converterNumber.convert(resultMatch.group(3));
                char c = resultMatch.group(2).charAt(0);
                inputOutput.output(converterNumber.reverseConvert(calc.calc(a1, b1, c).intValue()));
            } else throw new IncorrectMyInput("Неверный формат данных!");
        }
    }
}
