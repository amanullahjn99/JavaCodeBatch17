package RiplitQuestions;

public class Constrctor {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    Constrctor() {
        schoolName=null;
        batch=0;
        year=0;
        lastDayOfClass=null;
    }
    Constrctor(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    void display(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}
class Mains {

    public static void main(String[] args) {

        Constrctor obj1 = new Constrctor();
        obj1.schoolName = "Syntax";
        obj1.batch = 6;
        obj1.year = 2020;
        obj1.lastDayOfClass = "07/30/2020";
        obj1.display();

        Constrctor obj2 = new Constrctor();
        obj2.display();

    }
}
