// class mobile{
//     String brand;
//     int price;
//     static String name;
//     static{
//         name="Mobile";
//         System.out.println("Static block");
//     }
//     public mobile(){
//         brand="";
//         price=20000;
//         System.out.println("Default constructor");

//      }
//     public void show(){
//         System.out.println("Brand: "+brand);
//         System.out.println("Price: "+price);
//         System.out.println("Name: "+name);
// 	}
// }

// public class understanding_static {
//     public static void main(String[] args) {
//         try {
//             Class.forName("mobile");
//         } catch (ClassNotFoundException e) {
            
//             e.printStackTrace();
//         }
//         // mobile obj1=new mobile();
// 		// obj1.brand="Oppo";
// 		// obj1.price=50000;
// 		// obj1.name="Smart Phone";
//         // mobile obj2=new mobile();
//         // obj2.brand="Samsung";
//         // obj2.price=30000;
//         // obj2.name="Phone";
//         // mobile obj3=new mobile();
//         // obj3.brand="Apple";
//         // obj3.price=600000;
//         // obj3.name="Iphone";
//         // obj1.show();
//         // obj2.show();
//         // obj3.show();
//     }
    
// }
class mobile{
    String brand;
    int price;
    static String name;
    static{
        name="Mobile";
        System.out.println("Static block");
    }
    public mobile(){
        brand="";
        price=20000;
        System.out.println("Default constructor");

     }
    public void show(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Name: "+name);
	}
    public static void show1(mobile obj){
       System.out.println("Brand: "+obj.brand);
        System.out.println("Price: "+obj.price);
        System.out.println("Name: "+name);
    }
}

public class understanding_static {
    public static void main(String[] args) {
       
        mobile obj1=new mobile();
		obj1.brand="Oppo";
		obj1.price=50000;
		obj1.name="Smart Phone";
        mobile obj2=new mobile();
        obj2.brand="Samsung";
        obj2.price=30000;
        obj2.name="Phone";
        obj1.show();
        obj2.show();
        mobile.show1(obj1);
    }
    
}
