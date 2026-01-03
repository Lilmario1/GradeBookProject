//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package GradeBook;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.isZeroToHundred("50"));     // true
        System.out.println(Utils.isZeroToHundred("101"));    // false
        System.out.println(Utils.isZeroToHundred("abc"));    // false

        System.out.println(Utils.isValidPantherId("1234567"));  // true
        System.out.println(Utils.isValidPantherId("12345"));    // false
        System.out.println(Utils.isValidPantherId("12a4567"));  // false
    }
}
