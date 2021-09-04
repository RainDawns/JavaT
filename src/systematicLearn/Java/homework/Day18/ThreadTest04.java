package systematicLearn.Java.homework.Day18;

/**
 * @author lnh
 * @date 2021年06月24日 20:27
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        Tickets tickets = new Tickets(50);
        Thread t1 = new Thread(new BTickets(tickets), "窗口1");
        Thread t2 = new Thread(new BTickets(tickets), "窗口2");
        Thread t3 = new Thread(new BTickets(tickets), "窗口3");
        Thread t4 = new Thread(new BTickets(tickets), "窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }


}

class BTickets implements Runnable {
    private Tickets tickets;

    public BTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run() {
        while (tickets.num > 0) {
            synchronized (tickets) {
                if (tickets.num > 0) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖出的第" + tickets.num + "张票");
                    tickets.num--;
                }

            }
        }
    }
}

class Tickets {
    public int num;

    public Tickets(int num) {
        this.num = num;
    }
}
