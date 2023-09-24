package class26_Maps;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks",22.0);
        makeUp.put("BlushOn",40.0);
        makeUp.put("Base",50.5);
        makeUp.put("Foundation",90.5);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("Concealer",35.5);
        makeUp.put("EyeLiner",25.5);
//Both keys and values
       // makeUp.forEach((k,v)-> System.out.println(k+" "+v));
        //prints only keys
       // makeUp.forEach((k,v)-> System.out.println(k));
       //only values
      // makeUp.forEach((k,v)-> System.out.println(v));
        //whenever you need more than one parameter you need to put parentheses (k,v)
        // similarly if we want to have more than one line of code we need to have curly brackets as well
    makeUp.forEach((k,v)-> System.out.println(v));

        System.out.println("===================================");
        makeUp.forEach((k,v)-> System.out.println(k+" "+v)
        );
    }
}
