package RiplitQuestions;

public class Riple107ReverseStringBuffer {
    public static void main (String []args){
        String value="Hello Friends";

        StringBuffer stringBuffer = new StringBuffer(value);

        stringBuffer.reverse();
        String reversedString = stringBuffer.toString();
        System.out.println(reversedString);
    }
}
