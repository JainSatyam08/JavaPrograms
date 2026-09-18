class demo{
    public demo(){
        System.out.println("Default constructor");
    }
    public void show(){
        System.out.println("Show method");
    }
}
public class anonymous {
    public static void main(String[] args) {
       new demo().show();
    }
    
}
