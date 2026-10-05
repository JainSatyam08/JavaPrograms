class TicketCounter implements Runnable{
    int availableTickets=3;
    public void run(){
        bookTicket();

    }
    synchronized void bookTicket(){
        System.out.println("Ticket Number sold: "+ availableTickets);
        availableTickets--;
    }
}
public class TicketTest {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
        Thread t1 = new Thread(counter, "Counter-1");
        Thread t2 = new Thread(counter, "Counter-2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}