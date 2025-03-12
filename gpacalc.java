package gpacalculation;
public class gpacalc {
    int id;
    String course;
    String name;
    double gpa;
    double[] grades = new double[6];
    String[] coursename = new String[6];
    String[] letterGrades = new String[6];
    double total;
    static final int Ch = 3;
    public void calculateGPA() {
        total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += convertToGPA(grades[i]) * Ch;
            letterGrades[i] = convertToLetterGrade(grades[i]);
        }
        gpa = total / (grades.length * Ch);
    }
    private double convertToGPA(double score) {
        if (score >= 95) return 4.0;
        if (score >= 90) return 3.7;
        if (score >= 85) return 3.3;
        if (score >= 80) return 3.0;
        if (score >= 75) return 2.7;
        if (score >= 70) return 2.3;
        if (score >= 65) return 2.0;
        if (score >= 60) return 1.7;
        if (score >= 55) return 1.3;
        if (score >= 50) return 1.0;
        return 0.0;
    }

    private String convertToLetterGrade(double score) {
        if (score >= 95) return "A*";
        if (score >= 90) return "A";
        if (score >= 85) return "A-";
        if (score >= 80) return "B+";
        if (score >= 75) return "B";
        if (score >= 70) return "B-";
        if (score >= 65) return "C+";
        if (score >= 60) return "C";
        if (score >= 55) return "C-";
        if (score >= 50) return "D";
        return "F";
    }

    public void printinfo() {
        System.out.println("-----------------------------");
        System.out.println("Hello " + name);
        System.out.println("Your bachelor is in " + course);
        System.out.println("Your course grades:");
        for (int i = 0; i < coursename.length; i++) {
            System.out.println(coursename[i] + ": " + grades[i] + "% (" + letterGrades[i] + ")");
        }
        System.out.println("Your total GPA is " + String.format("%.2f", gpa));
        if (gpa > 3.0)
            System.out.println("You did such a fantastic job " + name + "! I'm so proud of you!!!!");
        else
            System.out.println("I'm sorry you didn't achieve the marks you wanted " + name + ", but you can learn from this failure and strive to be a better student in the future inshallah.");
        System.out.println("-----------------------------");
    }
}
