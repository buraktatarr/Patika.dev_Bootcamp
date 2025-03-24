package Examples;
import java.util.HashMap;
import java.util.Map;

public class JavaMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Ali", 85);
        students.put("Ayşe", 75);
        students.put("Burak", 96);
        students.put("Selin", 100);
        students.put("Mert", 88);

        for (Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
