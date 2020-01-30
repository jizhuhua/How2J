
package how2j.MathPro;

public class MathPro {
    public static void main(String[] args) {
        //复利
        int p = 10000;
        double r = 0.05;
        int n = 2;
        System.out.println(p * Math.pow(1 + r, n));
        //黄金分割点
        int i, j;
        int x = 1, y = 1;
        double min = Double.MAX_VALUE;
        double res;
        for (i = 1; i <= 20; i++) {
            for (j = 1; j <= 20; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    continue;
                }
                //避免在循环体中创建重复分配内存
                res = Math.abs((double) i / j - 0.618);
                if (res < min) {
                    x = i;
                    y = j;
                    min = res;
                }
            }
        }
        //might not have been initialized,因为for中的赋值可能未发生
        System.out.println("x:" + x + " y:" + y);
        //水仙花
        int thousand;
        int tmp;
        int hundred;
        int ten;
        int bits;
        for (thousand = 100; thousand < 1000; thousand++) {
            tmp = thousand;
            hundred = tmp / 100;
            tmp %= 100;
            ten = tmp / 10;
            tmp %= 10;
            bits = tmp;
            if (Math.pow(hundred, 3) + Math.pow(ten, 3) + Math.pow(bits, 3) == thousand) {
                System.out.println(thousand);
            }
        }
        //四元一次等式
        int x1,x2,x3,x4;
        for (int i1 = 1; i1 <= 8; i1++) {
            x1=i1;
            x2=8-x1;
            x3 = 14 - x1;
            x4 = 10 - x3;
            if (x3 - x4 == 6) {
                System.out.println(x1+","+x2+","+x3+","+x4);
            }
        }
    }
}
