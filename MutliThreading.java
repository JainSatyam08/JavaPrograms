public class MutliThreading {
        public static void main(String [] args){
        counter obj=new counter();
        MyThread thre = new MyThread(obj);
        Thread t1 = new Thread(thre);
        Thread t2 = new Thread(thre);
        Thread t3 = new Thread(thre);
        Thread t4 = new Thread(thre);
        //t2.setPriority(10);
        t1.setName("counter1");
        t2.setName("counter2");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class counter{
    int count=0;
    synchronized void increment(){
        count++;
        System.out.println("Count is "+count+" by "+Thread.currentThread().getName());
    }

}
class MyThread implements Runnable{
    counter obj=new counter();
    MyThread(counter obj){
        this.obj=obj;
    }
    public void run(){
        obj.increment();
    }
    
}
    

