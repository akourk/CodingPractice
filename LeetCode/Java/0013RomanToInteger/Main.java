public class Main {

    public static void main(String[] args) {



        System.out.println("\"");
        System.out.println("Simple answers:");
        System.out.println("I = " + Solution.romanNumeralConverter("I"));
        System.out.println("V = " + Solution.romanNumeralConverter("V"));
        System.out.println("X = " + Solution.romanNumeralConverter("X"));
        System.out.println("L = " + Solution.romanNumeralConverter("L"));
        System.out.println("C = " + Solution.romanNumeralConverter("C"));
        System.out.println("D = " + Solution.romanNumeralConverter("D"));
        System.out.println("M = " + Solution.romanNumeralConverter("M"));

        System.out.println("\nCombination answers:");
        System.out.println("VI = " + Solution.romanNumeralConverter("VI"));
        System.out.println("XVI = " + Solution.romanNumeralConverter("XVI"));
        System.out.println("LXVI = " + Solution.romanNumeralConverter("LXVI"));
        System.out.println("CLXVI = " + Solution.romanNumeralConverter("CLXVI"));
        System.out.println("DCLXVI = " + Solution.romanNumeralConverter("DCLXVI"));
        System.out.println("MDCLXVI = " + Solution.romanNumeralConverter("MDCLXVI"));

        System.out.println("\nTricky Answers:");
        System.out.println("IV = " + Solution.romanNumeralConverter("IV"));
        System.out.println("VX = " + Solution.romanNumeralConverter("VX"));
        System.out.println("XL = " + Solution.romanNumeralConverter("XL"));
        System.out.println("LC = " + Solution.romanNumeralConverter("LC"));
        System.out.println("CD = " + Solution.romanNumeralConverter("CD"));
        System.out.println("DM = " + Solution.romanNumeralConverter("DM"));
        System.out.println("IVXLCDM = " + Solution.romanNumeralConverter("IVXLCDM"));

        System.out.println("\nLeetCode Examples:");
        System.out.println("III = " + Solution.romanNumeralConverter("III"));
        System.out.println("IV = " + Solution.romanNumeralConverter("IV"));
        System.out.println("IX = " + Solution.romanNumeralConverter("IX"));
        System.out.println("LVIII = " + Solution.romanNumeralConverter("LVIII"));
        System.out.println("MCMXCIV = " + Solution.romanNumeralConverter("MCMXCIV"));



    }
}
