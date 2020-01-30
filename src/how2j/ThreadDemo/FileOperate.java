package how2j.ThreadDemo;

import java.io.*;

public class FileOperate {
    public static void main(String[] args) {
        search(new File("D:\\aaaa"), "s");

    }

    public static void copyFile(String srcFile, String destFile) {
        File sf = new File(srcFile);
        File df = new File(destFile);
        System.out.println("*********正在复制*********");
        System.out.println(sf);
        System.out.println(df);
        //判断源文件路径是否指向文件，而目标文件可以是文件夹，作为存放目标文件的位置
        if (!sf.isFile()) {
            System.out.println("该路径不是文件");
            return;
        }
        //copy
        try (FileInputStream fis = new FileInputStream(sf); FileOutputStream fos = new FileOutputStream(df)) {
            byte[] b = new byte[(int) sf.length()];
            fis.read(b);
            fos.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFolder(String srcFolder, String destFolder) {
        File sf = new File(srcFolder);
        File df = new File(destFolder);
        //判断路径是否分别指向两个文件夹
        if (!sf.isDirectory() || !df.isDirectory()) {
            System.out.println("该路径不是文件夹");
            return;
        }
        if (sf.isDirectory()) {
            File[] f = sf.listFiles();
            for (File f1 : f) {
                if (null == f1)
                    continue;
                if (f1.isDirectory())
                    //递归一波
                    copyFolder(f1.getAbsolutePath(), destFolder);
                else {
                    //这里把复制文件的路径搞好
                    String[] s = f1.getAbsolutePath().split(":");
                    String scp = destFolder + s[1];//这是准备的存放路径
                    File fp = new File(scp);
                    File fp1 = fp.getParentFile();
                    fp1.mkdirs();//文件夹创好
                    //直接调用文件复制方法
                    copyFile(f1.getAbsolutePath(), scp);
                }
            }
        }

    }

    public static void search(File folder, String search) {
        if (folder.isDirectory()) {
            File[] f = folder.listFiles();
            for (File f1 : f) {
                if (f1.isDirectory())
                    search(f1, search);
                else {
                    //判断是java文件
                    String s = f1.getName();
                    if (s.contains(".java")) {
                        new Thread() {
                            @Override
                            public void run() {
                                try (FileReader fr = new FileReader(f1); BufferedReader br = new BufferedReader(fr)) {
                                    //BufferedReader(FileReader("filename"))将FileReader包装后，再使用read(char[] chbf)读取，
                                    // 可以将文件内容装入缓存。而FileReader则会频繁使用底层IO，造成阻塞其他需要访问IO的操作，
                                    // 所以读取文件BufferedReader比FileReader更高效。
                                    while (true) {
                                        String sl = br.readLine();
                                        if (sl == null) {
                                            break;
                                        }
                                        if (sl.contains(search))
                                            System.out.println("找到了找到了，在文件" + f1);
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }.start();
                    }
                }
            }
        }

    }
}
