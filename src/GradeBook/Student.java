public class Student {
    // private fields
    private String firstName;
    private String lastName;
    private String pantherID;
    private int score; // 0–100

    // constructor
    public Student(String firstName, String lastName, String pantherID, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pantherID = pantherID;
        this.score = score; // (you can add validation later)
    }

    // getter used by Gradebook
    public int getScore() {
        return score;
    }

    // used by Gradebook.printTable()
    public String toTabRow() {
        return pantherID + "\t" + lastName + ", " + firstName + "\t" + score;
    }
}

