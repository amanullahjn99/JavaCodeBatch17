package RiplitQuestions;

public class riple129StaticMethod {
    static String countryName;
    static String continent;

    public void value(){
        System.out.println(countryName+" located on "+continent+" contient");
    }

    public static void main (String[] args){

        riple129StaticMethod obj=new riple129StaticMethod();
        obj.countryName="Morocco";
        obj.continent="Africa";
        obj.value();


    }

}

