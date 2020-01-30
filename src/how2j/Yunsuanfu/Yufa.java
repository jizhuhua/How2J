package how2j.Yunsuanfu;

import java.util.Scanner;



public class Yufa {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        //自增
        int j = ++i + i++ + ++i + i++;
        //逻辑运算
        boolean b = !(i++ == 3) ^ (i++ == 2) && (i++ == 3);
        System.out.println("i:" + i + " j:" + j + " b:" + b);
        int a = 1;
        //赋值运算
        a += ++a;
        //三目
        System.out.println(a < 5 ? "weekday" : "weekend");
        //for循环
        int sum=0;
        for (int day=0;day<10;day++) {
            sum += Math.pow(2,day);
            if(sum%5==0||sum%3==0){
                continue;
            }
            System.out.println(sum);
        }
    }

    public static void divide(int x, int y) throws Exception {
        if (y < 0) {
            throw new Exception("throws用于声明");
        }
    }
}
