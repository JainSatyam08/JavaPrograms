import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/** Helllo this is the program**/
class Student{
    String name;
    int rollno;
    int tmarks;
    public Student(String name,int rollno,int tmarks){
        this.name=name;
        this.rollno=rollno;
        this.tmarks=tmarks;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+rollno);
        System.out.println("Total Marks: "+tmarks);
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        List<Student> students=new LinkedList<>();
        students.add(new Student("A",1 ,90));
        students.add(new Student("B",2 ,97));
        students.add(new Student("C",3 ,89));
        Iterator<Student> it=students.iterator();
        while(it.hasNext()){
            it.next().display();
        }
    }
    
}
