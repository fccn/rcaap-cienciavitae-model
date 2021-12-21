package pt.rcaap.cienciavitae.curriculum.client;

public class CienciaVitaeUtils {
    public static enum ORDER {
        Ascending, Descending
    }
    
    public static enum LANG {
        PT, EN
    }
    
    public static boolean isValidCienciaID(String cid) {

        cid = cid.trim();
        // CID must have 14 char including "-"
        if (cid.length() != 14 || !cid.contains("-"))
            return false;

        // Get cid Number
        String cidNumber = cid.substring(0, cid.length() - 1).replaceAll("-", "");

        // TODO: CID ARE WITHOUT "-" 12 numbers only. - See again another form to verify
        // an ORCID as this is only a workaround
        if (cidNumber.length() != 11)
            return false;

        // Get validation digit form provided cid
        String cidCheckDigit = cid.substring(cid.length() - 1);

        // String check generator
        String generatedCheckDigit = generateCienciaIDCheckDigit(cidNumber);

        // System.out.println("orcid: " + cid + " ONumber: " + cidNumber + "
        // CheckDigitProvided: " + cidCheckDigit + " Generated: " +
        // generatedCheckDigit);
        return generatedCheckDigit.equals(cidCheckDigit);
    }

    /*
     * Generates check digit as per ISO 7064 17,16.
     *
     */
    private static String generateCienciaIDCheckDigit(String baseDigits) {
        int total = 0;
        int intermediateSum = 0;
        int adjustedIntermediateSum = 0;
        int adjustedProduct = 0;
        boolean firstStep = true;

        for (int i = 0; i < baseDigits.length(); i++) {
            int digit = Integer.parseInt(baseDigits.charAt(i) + "", 16);
            if (firstStep) {
                firstStep = false;
                intermediateSum = digit + 16;
            } else {
                intermediateSum = digit + adjustedProduct;
            }
            if (intermediateSum >= 16) {
                adjustedIntermediateSum = intermediateSum - 16;
                if (adjustedIntermediateSum == 0)
                    adjustedIntermediateSum = 16;
            } else {
                adjustedIntermediateSum = intermediateSum;
            }
            total = adjustedIntermediateSum * 2;
            adjustedProduct = total % 17;
        }

        int reminder = (17 - adjustedProduct) % 16;
        return Integer.toHexString(reminder).toUpperCase();
    }
}
