package how2j.MultThread;


import org.junit.Test;

public class Mytest {
    public static <T extends Comparable> T getMinT(T[] ts) {
        if (ts == null || ts.length == 0) {
            return null;
        }
        T min = ts[0];
        for (int i = 1; i < ts.length; i++) {
            if (ts[i].compareTo(min) < 0) {
                min = ts[i];
            }
        }

        return min;
    }

    @Test
    public void test() throws InterruptedException {
        Thread t1 = new Thread(new newThred() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                        Thread.currentThread().sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "TA");
        t1.start();
        Thread t2 = new Thread(new newThred() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                        Thread.currentThread().sleep(500);
                        if (i == 5) {
                            t1.join();
                        }
                    }

                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }, "TB");
        t2.start();
        Thread.sleep(10000);
    }
}

class newThred extends Thread implements Runnable {
}
