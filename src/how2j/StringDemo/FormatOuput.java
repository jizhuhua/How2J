package how2j.StringDemo;

import java.util.Scanner;

public class FormatOuput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String please = "请输入%s名字;";
        String name = "公司";
        String boss = "老板";
        String money = "金额";
        System.out.printf(please, name);
        String bs = scanner.next();
        System.out.println();
        System.out.printf(please, boss);
        String ns = scanner.next();
        System.out.println();
        System.out.printf(please, money);
        String ms = scanner.next();
        System.out.println();
        String str = "%s倒闭了，\t王八蛋老板%s吃喝嫖赌，%n欠下了%s个亿";
        System.out.printf(str, ns, bs, ms);
        System.out.println();
        char[] cs = new char[5];
        String[] ss = new String[5];
        char start = 'A';
        char end = 'z';
        char tmp;
        for (int j = 0; j < ss.length; j++) {
            for (int i = 0; i < cs.length; i++) {
                tmp = (char) ((Math.random() * ('z' - 'A')) + 'A');
                if (Character.isLetter(tmp)) {
                    cs[i] = tmp;
                }
            }
            ss[j] = new String(cs);
        }
        String stmp;
        for (int i = 0; i < ss.length-1; i++) {
            for (int j = i+1; j < ss.length; j++) {
                if (ss[i].toLowerCase().charAt(0) > ss[j].toLowerCase().charAt(0)) {
                    stmp = ss[i];
                    ss[i] = ss[j];
                    ss[j]=stmp;
                }
            }
        }
        for (String i : ss) {
            System.out.println(i.toLowerCase());
        }
    }
}
