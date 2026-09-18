import java.util.*;

public class CourseAnalysis {

    public static Set<Integer> commonStudents(Set<Integer> javaStudents,Set<Integer> pythonStudents) {

        Set<Integer> common = new HashSet<>(javaStudents);
        common.retainAll(pythonStudents);

        return common;
    }

    public static Set<Integer> allStudents(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        // Write your code
        Set<Integer> all=new HashSet<>();
        all.addAll(javaStudents);
        all.addAll(pythonStudents);
        return all;
    }

    public static Set<Integer> onlyJava(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        // Write your code
        javaStudents.removeAll(pythonStudents);
        return javaStudents;
    }

    public static void main(String[] args) {

        Set<Integer> javaStudents =
                new HashSet<>(
                    Arrays.asList(101, 102, 103, 104));

        Set<Integer> pythonStudents =
                new HashSet<>(
                    Arrays.asList(103, 104, 105, 106));

        System.out.println("Both: "
                + commonStudents(javaStudents, pythonStudents));

        System.out.println("Either: "
                + allStudents(javaStudents, pythonStudents));

        System.out.println("Only Java: "
                + onlyJava(javaStudents, pythonStudents));
    }
}