public class GradeAStud {
    public static void main(String[] args) {
        // Total number of students
        int totalStudents = 90;

        // Number of boys
        int boys = 45;

        // Number of students who secured grade 'A'
        int gradeAStudents = (int) (0.5 * totalStudents);

        // Number of boys who secured grade 'A'
        int boysGradeA = 20;

        // Number of girls who secured grade 'A'
        int girlsGradeA = gradeAStudents - boysGradeA;

        // Output the result
        System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);
    }
}
