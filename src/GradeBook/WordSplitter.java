package GradeBook;



import java.util.Scanner;

public class WordSplitter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String line = in.nextLine();

            if (line.equals("end")) {
                break;
            }

            // split on whitespace
            String[] parts = line.split("\\s+");

            for (int i = 0; i < parts.length; i++) {
                System.out.println((i + 1) + ". " + parts[i]);
            }
        }
    }
}

