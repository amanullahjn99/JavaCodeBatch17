package class26_Maps;

import java.util.Collection;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks",22.0);
        makeUp.put("BlushOn",40.0);
        makeUp.put("Base",50.5);
        makeUp.put("Foundation",90.5);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("Concealer",35.5);
        makeUp.put("EyeLiner",25.5);

        System.out.println(makeUp);
        Collection<String> onlyKeys=makeUp.keySet();
        Collection<Double>onlyValue=makeUp.values();
        System.out.println(onlyKeys);
        System.out.println(onlyValue);

    }
}
