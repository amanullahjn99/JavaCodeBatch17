package RiplitQuestions;

class SyntaxStudentException extends Exception {
    public SyntaxStudentException(String message) {
        super(message);
    }
}

class MainClass {
    public static void gradeCheck(int grade) throws SyntaxStudentException {
        if (grade > 90) {
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        } else {
            System.out.println("You are a great student");
        }
    }

    public static void main(String[] args) {
        try {
            int studentGrade = 95;
            gradeCheck(studentGrade);
        } catch (SyntaxStudentException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}