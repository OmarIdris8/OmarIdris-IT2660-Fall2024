class Main {
  public static void main(String[] args) {
      // Create a map called creditHours
      MyHashMap<String, Integer> creditHours = new MyHashMap<>();

      // Add the specified key-value pairs to the map
      creditHours.put("IT-1025", 3);
      creditHours.put("IT-1050", 3);
      creditHours.put("IT-1150", 3);
      creditHours.put("IT-2310", 3);
      creditHours.put("IT-2320", 4);
      creditHours.put("IT-2351", 4);
      creditHours.put("IT-2650", 4);
      creditHours.put("IT-2660", 4);
      creditHours.put("IT-2030", 4);

      // Check for the presence of the following keys
      System.out.println("Contains key IT-1025: " + creditHours.containsKey("IT-1025")); // true
      System.out.println("Contains key IT-2110: " + creditHours.containsKey("IT-2110")); // false

      // Print all of the values in the map
      System.out.println("All values in the map:");
      for (int i = 0; i < creditHours.size(); i++) {
          for (String key : creditHours.keySet()) {
              System.out.println(key + ": " + creditHours.get(key));
          }
      }

      // Remove IT-2030 and IT-1150
      creditHours.remove("IT-2030");
      creditHours.remove("IT-1150");

      // Print all of the values in the map
      System.out.println("All values in the map after removal:");
      for (String key : creditHours.keySet()) {
          System.out.println(key + ": " + creditHours.get(key));
      }
  }
}
