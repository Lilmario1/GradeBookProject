public class Gradebook {
    // ---- fields ----
    private Student[] roster;   // array of Student (NOT ArrayList)

    // ---- constructor ----
    public Gradebook(Student[] roster) {

        this.roster = roster;
    }

    // ---- average score ----
    public double averageScore() {
        int sum = 0;
        for (Student s : roster) {
            sum += s.getScore();
        }
        return (double) sum / roster.length;
    }
    // ---- minimum score ----
    public int minScore() {
        if (roster == null || roster.length == 0)
            throw new IllegalStateException("No students in gradebook.");

        int min = Integer.MAX_VALUE;
        for (Student s : roster) {
            int val = s.getScore();
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    // ---- maximum score ----
    public int maxScore() {
        if (roster == null || roster.length == 0)
            throw new IllegalStateException("No students in gradebook.");

        int max = Integer.MIN_VALUE;
        for (Student s : roster) {
            int val = s.getScore();
            if (val > max) {
                max = val;
            }
        }
        return max;
    }


    // ---- print table with tabs ----
    public void printTable() {
        System.out.println("PantherID\tName\tScore\tLetter");
        for (Student s : roster) {
            System.out.println(s.toTabRow() + "\t" + toLetterGrade(s.getScore()));
        }
    }

    // ---- score -> letter (use YOUR syllabus ranges) ----
    public static String toLetterGrade(int score) {
        if (score >= 95) return "A";
        else if (score >= 90) return "A-";
        else if (score >= 87) return "B+";
        else if (score >= 83) return "B";
        else if (score >= 80) return "B-";
        else if (score >= 77) return "C+";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";


        // TODO: Replace with your course policy exactly.
        // Example shape (don’t use these cutoffs unless your syllabus matches):
        // if (score >= 90) return "A";
        // else if (score >= 80) return "B";
        // ...

    }

    // ---- TEMP main for testing Gradebook ----
    public static void main(String[] args) {
        // Create some students to test (include edge cases)
        Student s1 = new Student("Romario", "Destine", "1234567", 95);
        Student s2 = new Student("Alex", "Lee", "2345678", 88);
        Student s3 = new Student("Jordan", "Reid", "3456789", 73);

        Student[] arr = {s1, s2, s3};
        Gradebook gb = new Gradebook(arr);

        gb.printTable();                     // Should print rows with tabs
        System.out.println("Average: " + gb.averageScore());  // Quick check
        System.out.println("Minimum score = " + gb.minScore());
        System.out.println("Maximum score = " + gb.maxScore());

    }
}


