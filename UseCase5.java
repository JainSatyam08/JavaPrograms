public class UseCase5{
    public static void main(String [] args){
        MyThread thre = new MyThread();
        Thread t1 = new Thread(thre);
        Thread t2 = new Thread(thre);
        t2.setPriority(10);
        t1.setName("counter1");
        t2.setName("counter2");
        t1.start();
        t2.start();
    }
}

class MyThread implements Runnable{
    int availableTickets=10;
   
    public void run(){
        while(availableTickets>0){
            bookTickets();
        }
    }
    synchronized void bookTickets(){
        
        if (availableTickets>0){
            
            availableTickets--;
            System.out.println("Ticket booked by "+ Thread.currentThread().getName());
        }
        else{
            System.out.println("Tickets not available for "+ Thread.currentThread().getName());
        }
        
    }
}