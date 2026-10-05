import java.util.*;
public class CourseRegistration {
    public static void registerCourse(Set<String> courses,String course) {
        // Write your code
        courses.add(course);
    }
    public static boolean isRegistered(Set<String> courses,String course) {
        // Write your code
        if(courses.contains(course)){
            return true;
        }
        return false;
    }
    public static void dropCourse(Set<String> courses,String course) {
        courses.remove(course);
         // Write your code
    }
    public static void displayCourses(Set<String> courses) {
        Iterator<String> it=courses.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        // Write your code
    }
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        registerCourse(courses, "Java");
        registerCourse(courses, "Python");
        registerCourse(courses, "DBMS");
        registerCourse(courses, "Java");
        System.out.println("Courses:");
        displayCourses(courses);
        System.out.println("Python registered: "
        + isRegistered(courses, "Python"));
        dropCourse(courses, "DBMS");
        System.out.println("After dropping DBMS:");
        displayCourses(courses);
    }
}
