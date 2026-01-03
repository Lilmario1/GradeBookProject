package GradeBook;

public class Utils {

    // check if string is a number 0–100
    public static boolean isZeroToHundred(String s) {
        if (s == null) return false;
        s = s.trim();
        if (!s.matches("\\d+")) return false;  // only digits allowed
        try {
            int n = Integer.parseInt(s);       // turn text into number
            return n >= 0 && n <= 100;         // check range
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // check if string is a 7-digit Panther ID
    public static boolean isValidPantherId(String s) {
        return s != null && s.matches("\\d{7}");
    }

}





