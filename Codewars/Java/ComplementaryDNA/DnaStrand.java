public class DnaStrand {

    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }
        return new String(chars);
    }
    private static char getComplement(char c) {
        switch(c) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
        }
        return c;
    }

    //this works too.
//    public static String makeComplement(String dna) {
//        String result = "";
//        for (int i = 0; i < dna.length(); i++) {
//            if (dna.charAt(i) == 'A') {
//                result += 'T';
//            } else if (dna.charAt(i) == 'T') {
//                result += 'A';
//            } else if (dna.charAt(i) == 'C') {
//                result += 'G';
//            } else if (dna.charAt(i) == 'G') {
//                result += 'C';
//            }
//        }
//        return result;
//    }
}
