import java.util.*;
public class AttendanceSystem {
    public static void markAttendance(Set<Integer> attendance,int studentId) {
        // Write your code
        attendance.add(studentId);
    }
    public static boolean isPresent(Set<Integer> attendance,int studentId) {
        // Write your code
        if(attendance.contains(studentId)){
            return true;
        }
        return false;
    }
    public static int getAttendanceCount(Set<Integer> attendance) {
        // Write your code
        int count=0;
        Iterator<Integer> it=attendance.iterator();
        while(it.hasNext()){
            count++;
            it.next();
        }
        
        return count;
    }
    public static void displayAttendance(Set<Integer> attendance) {
        // Write your code
        Iterator<Integer> it=attendance.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void main(String[] args) {
        Set<Integer> attendance = new LinkedHashSet<>();
        markAttendance(attendance, 105);
        markAttendance(attendance, 102);
        markAttendance(attendance, 108);
        markAttendance(attendance, 105);
        markAttendance(attendance, 101);
        displayAttendance(attendance);
        System.out.println("Student 108 present: "
        + isPresent(attendance, 108));
        System.out.println("Total Present: "
        + getAttendanceCount(attendance));
    }
}
