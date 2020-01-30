package how2j.IODemo;

import java.io.*;

public class RemoveAnatation {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\jzh\\Desktop\\xxx.java");
        File tmp = new File("C:\\Users\\jzh\\Desktop\\aaa.java");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            PrintWriter fw = new PrintWriter(tmp);
            String s;
            while ((s = bf.readLine()) != null) {
                if (s.trim().startsWith("//")) {
                } else {
                    fw.println(s);
                    fw.flush();
                }
            }
            fw.close();
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
