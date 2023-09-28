package class26_Maps;

import java.util.Map;
import java.util.TreeMap;

public class HW_PersonTester {

        public static void main(String[] args) {
            Map<Integer, HW_Person> personMap = new TreeMap<>();

            // Creating Person objects and adding them to the map
            HW_Person person1 = new HW_Person("Aman", "Ahmad", 30, 50000.0);
            HW_Person person2 = new HW_Person("Ali", "Mohammad", 25, 60000.0);
            HW_Person person3 = new HW_Person("John", "Sena", 35, 75000.0);

            personMap.put(1, person1);
            personMap.put(2, person2);
            personMap.put(3, person3);

            for (Map.Entry<Integer, HW_Person> entry : personMap.entrySet()) {
                int personId = entry.getKey();
                HW_Person person = entry.getValue();

                System.out.println("Person ID: " + personId);
                person.printInfo();
                System.out.println();
            }
        }
    }
