package how2j.ThreadDemo;

import java.util.LinkedList;

public class Password {

    public static void main(String[] args) {
        String password = random();
        System.out.println("password：" + password);
        LinkedList<String> linkedList = new LinkedList<>();
        Thread thread = new Thread() {
            @Override
            public void run() {
                char[] chars = new char[3];
                for (int i = '0'; i < 'z'; i++)
                    for (int j = '0'; j < 'z'; j++)
                        for (int k = '0'; j < 'z'; j++) {
                            if (!isLetterOrDigit(i, j, k)) {
                                continue;
                            }
                            chars[0] = (char) i;
                            chars[1] = (char) j;
                            chars[2] = (char) k;
                            //破解线程，把穷举法生成的可能密码都放在一个list容器中
                            //offer与add的区别：offer与add在LinkedList中都是添加的意思
                            // offer 是如果为空，则会出现false，但是add 就会出现异常
                            linkedList.offer(new String(chars));
                        }
            }
        };
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    //如果查看list数组中密码为空，则休息一秒
                    if (linkedList.isEmpty()) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //如果list集合中有数据，则取出来，打印，并判断是否与之前密码相同，如果相同则break退出找到密码
                        String str = linkedList.removeFirst();//线程访问越界NoSuchElementException()
                        System.out.println("尝试密码：" + str);
                        if (str.equals(password))
                            // System.out.println("破解密码成功："+str);
                            break;
                    }
                }
            }
        };
        //第二个日志线程为守护线程，如果找到，就会自动结束
        thread1.setDaemon(true);
        thread.start();
        thread1.start();
        try {
            Thread.sleep(3000);//main
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("找到密码:" + password);

    }

    //来判断不是数字和字母
    public static boolean isLetterOrDigit(int i, int j, int k) {
        return Character.isLetterOrDigit(i) && Character.isLetterOrDigit(j) && Character.isLetterOrDigit(k);

    }

    public static String random() {
        char[] chars = new char[3];
        int start = '0';
        int end = 'z' + 1;
        for (int i = 0; i < chars.length; i++) {
            while (true) {
                char c = (char) (Math.random() * (end - start) + start);
                //排除掉不是数字和字母的
                if (Character.isDigit(c) || Character.isLetter(c)) {
                    chars[i] = c;
                    break;
                }
            }
        }
        String result = String.valueOf(chars);
        return result;
    }
}