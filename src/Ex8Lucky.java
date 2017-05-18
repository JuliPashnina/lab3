public class Ex8Lucky {
    static volatile int x = 0;
    static volatile int count = 0;
    static Object o=new Object();
    static class LuckyThread extends Thread {
        @Override
        public void run() {
          
            while (x < 999999) {
                int y;
                int cnt;
                synchronized (o){
                    y=x;
                    cnt=count;
                }
                y++;
                if ((y % 10) + (y / 10) % 10 + (y / 100) % 10 == (y / 1000)
                        % 10 + (y / 10000) % 10 + (y / 100000) % 10) {
                    System.out.println(y);
                    cnt++;
                }
                synchronized (o){
                    x=y;
                    count=cnt;
                }
            
          }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new LuckyThread();
        Thread t2 = new LuckyThread();
        Thread t3 = new LuckyThread();
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Total: " + count);
    }

}
