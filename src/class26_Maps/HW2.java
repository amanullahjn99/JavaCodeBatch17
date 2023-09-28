package class26_Maps;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets
the highest salary. Output should be in the below format
John Smith=$100000
 */
public class HW2 {
    public static void main(String[] args) {
        Map<String, Double> employee = new TreeMap<>();
        employee.put("Aman Ahmad", 85000.0);
        employee.put("Samir wali", 90000.0);
        employee.put("John Smith", 100000.0);
        employee.put("Sara Jeki", 95000.0);

        System.out.println(employee);
        double HighSalary = (Collections.max(employee.values()));
        for (Map.Entry<String, Double> entry : employee.entrySet()) {
            if (entry.getValue() == HighSalary) {
                System.out.println(entry.getKey() +" =$"+ entry.getValue());
            }
        }
    }
}