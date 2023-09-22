package GroupProject_2;
/*We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A
takes the marks in three subjects as its parameters and the marks in four subjects as its parameters
for student B. Test your code
 */
public abstract class T10_Marks {
    abstract double getPercentage();
}
class StudentA extends T10_Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;
    public StudentA(double subject1Marks, double subject2Marks, double subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    @Override
    double getPercentage() {
        return (subject1Marks + subject2Marks + subject3Marks) / 3.0;
    }
}

class StudentB extends T10_Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;
    private double subject4Marks;

    public StudentB(double subject1Marks, double subject2Marks, double subject3Marks, double subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }
    @Override
    double getPercentage() {
        return (subject1Marks + subject2Marks + subject3Marks + subject4Marks) / 4.0;
    }
}
class Main12 {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(85, 90, 78);
        StudentB studentB = new StudentB(75, 80, 92, 88);

        double percentageA = studentA.getPercentage();
        double percentageB = studentB.getPercentage();

        System.out.println("Student A's Average Percentage: " + percentageA + "%");
        System.out.println("Student B's Average Percentage: " + percentageB + "%");
    }
}