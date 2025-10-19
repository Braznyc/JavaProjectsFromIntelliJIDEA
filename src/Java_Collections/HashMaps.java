package Java_Collections;


import java.util.HashMap;


public class HashMaps {
    public static void main(String[] args) {
        // Creating a hashmap. Noticed that "Integer" is capitalized and not only "int" to create a variable
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the hashmap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Accessing values
        System.out.println("Value for key apple: " + map.get("Apple")); // Output: 1

        // Iterate through the HashMap. This will show all key-value pairs
        for (String key : map.keySet()) {
            System.out.println("Key :" + map.get(key));

        }

        // Checking is a key exists
        if (map.containsKey("Banana")){
                System.out.println("Banana exists in the map.");
            }else{
            System.out.println("There's no bananas in the map");
        }

        // Removing a value-key pair

        map.remove("Cherry");

        for (String key : map.keySet()) {
            System.out.println("Key :" + map.get(key));

        }






        }




    }

