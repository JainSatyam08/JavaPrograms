import java.util.*;

public class RemoveDuplicates {

    public static Set<String> removeDuplicates(List<String> names) {
        // Write your code
        Set<String> uniqueNames = new HashSet<>(names);
        //uniqueNames.addAll(names);
        // for(String name:names){
        //     uniqueNames.add(name);
        // }
        return uniqueNames;
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        names.add("Aman");
        names.add("Riya");
        names.add("Simran");
        names.add("Karan");

        Set<String> uniqueNames = removeDuplicates(names);

        System.out.println("Original List: " + names);
        System.out.println("Unique Names: " + uniqueNames);
    }
}