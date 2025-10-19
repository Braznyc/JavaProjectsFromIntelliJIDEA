package Java_Collections.HashSet_vs_TreeSet;

// This program will show what ordered and unordered mean
// Ordered are used by lists... They way you enter items, that's the way they will be printed in the output.
// Unordered are used by Sets and Maps. Here in the example of sets (HashSet and TreeSets) the way you enter the items will not be the way the items will be printed. In the HashSets they will be printed randomly. The TreeSet will sort them by their values.
// Do not confuse sorted to ordered. TreeSets will sort by the value, it means it is unordered because the output is not the same as the items were entered, the value is what's used to sort them.


import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_vs_TreeSet {
    public static void main(String[] args){
        // Set demonstration using HashSet

        Set<Integer> hashSet = new HashSet<>();
        // Adding elements to the HashSet
        hashSet.add(23);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(10);
        hashSet.add(15);
        hashSet.add(45);


        // To show the items
        System.out.println(hashSet); // The output = [4, 23, 10, 45, 15]
                                     // Duplicates will be eliminated and the items will not follow and order (by value or what item was entered first). The output will be random.

        Set<Integer> treeSet = new TreeSet<>();
        // Adding elements to the TreeSet
        treeSet.add(23);
        treeSet.add(4);
        treeSet.add(4);
        treeSet.add(4);
        treeSet.add(15);
        treeSet.add(10);
        treeSet.add(45);

        // To show the items
        System.out.println(treeSet); // The output = [4, 10, 15, 23, 45]
                                                    // Like the in the HashSet duplicated will be eliminated and the items will be ordered by the value and not the order the items were created. Sorted by the value started from the smallest.




    }

}
