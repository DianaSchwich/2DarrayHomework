package TwoArrayHomework;

public class NamesGrades {
    public static void main(String[] args) {


        String[][] studentsGrades = {
                {"Diana", "Marcela", "Nata", "Eli"},
                {"A", "B", "C", "D"}
        };

        for (int i = 0; i < studentsGrades[0].length; i++) {
            // for (int j = 0; j < 1; j++) { // need for repeat the code
            if (studentsGrades[1][i].equals("A") || studentsGrades[1][i].equals("B"))

                System.out.println(studentsGrades[0][i] + " " + studentsGrades[1][i]);
        }
        // }
        System.out.println();
    }
}