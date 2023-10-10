package RiplitQuestions;

import java.util.ArrayList;

public class Riplt187 {
    public static void main(String [] args){
        ArrayList<String> value=new ArrayList<>();

        value.add("hi");
        value.add("yo");
        value.add("sup");
        value.add("yolo");
        value.add("boop");

        value.remove(0);
        value.remove(1);
        value.remove(2);

      for(String list:value){
            System.out.print(list+ " ");
        }

    }

}
