package how2j.IODemo;

import java.io.*;

public class IODemo {
    public static void main(String[] args) {
        File f = new File("D:/迅雷下载");
//遍历子文件
//     File[] files=f.listFiles();
//        readFile(files);
//    }
//    public static void readFile(File[] f){
//        if (f == null) {
//            return;
//        }
//        for (File i : f) {
//            if (i.isFile()) {
//                System.out.println(i.getName());
//            }
//            if (i.isDirectory()) {
//                readFile(i.listFiles());
//            }
//        }
//        拆分
//        FileInputStream fileInputStream = new FileInputStream(f);
//        try {
//            FileInputStream fi = new FileInputStream(f);
//            byte[] bytes = new byte[(int) f.length()];
//            int cnt= (int) (f.length()/10);
//            fi.read(bytes);
//            for (int i = 0; i < cnt+1; i++) {
//                File fe = new File(f.getParentFile(), "分组"+i);
//                FileOutputStream fo = new FileOutputStream(fe);
//                if (i == cnt) {
//                    fo.write(bytes, i * 10, (int) (f.length() % 10));
//                } else {
//                    fo.write(bytes,i*10,10);
//                }
//                fo.close();
//            }
//            fi.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
// 合并
//        File fw = new File("D:/迅雷下载/合并");
//        File[] files = f.listFiles();
//        int cnt = files.length;
//        try {
//            for (int i = 0; i < cnt; i++) {
//                FileInputStream fi = new FileInputStream(files[i]);
//                byte[] bytes = new byte[(int) files[i].length()];
//                fi.read(bytes);
//                FileOutputStream fo = new FileOutputStream(fw, true);
//                fo.write(bytes);
//                fo.close();
//                fi.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
