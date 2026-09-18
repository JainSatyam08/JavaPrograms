import java.util.Scanner;
public class operation {
    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void diff(int a, int b){
        System.out.println(a-b);
    }

    public void mul(int a, int b){
        System.out.println(a*b);
    }

    public void divide(int a,int b){
        System.out.println(a/b);
    }



    
}
class Main{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int a=s1.nextInt();
        int b=s1.nextInt();
        operation obj=new operation();
        obj.sum(a,b);
        obj.diff(a, b);
        obj.mul(a, b);
        obj.divide(a,b);
        s1.close();
    }
}
