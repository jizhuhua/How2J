package how2j.ThreadDemo;

public class WaveDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new WaveRunnable());
        t.start();
    }
}

class WaveRunnable implements Runnable {
    int count = 1;

    @Override
    public void run() {
        while (true) {
            if ((count++) % 3 != 0) {
                System.out.println("wave了" + count + "次");
            } else {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
