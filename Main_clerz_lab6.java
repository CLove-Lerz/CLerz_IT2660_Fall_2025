import java.util.HashMap;
import java.util.Map;

class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    Map<String, Integer> creditHours = new HashMap<>();
        creditHours.put("IT-1025", 3);
        creditHours.put("IT-1050", 3);
        creditHours.put("IT-1150", 3);
        creditHours.put("IT-2310", 3);
        creditHours.put("IT-2320", 4);
        creditHours.put("IT-2351", 4);
        creditHours.put("IT-2650", 4);
        creditHours.put("IT-2660", 4);
        creditHours.put("IT-2030", 4);

     System.out.println("Map has Key IT-1025: " + creditHours.containsKey("IT-1025"));

     System.out.println("Map has Key IT-2110: " + creditHours.containsKey("IT-2110"));

     System.out.println("\nAll content of map");
     for (Map.Entry<String, Integer> entry : creditHours.entrySet()) {
       System.out.println(entry.getKey() + ": " + entry.getValue());
     }
     creditHours.remove("IT-2030");
     creditHours.remove("IT-1150");

     System.out.println("\nAll values now in map:");
     for (Integer value : creditHours.values()) {
       System.out.println(value);
     }
  }
}