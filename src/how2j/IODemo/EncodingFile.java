package how2j.IODemo;

import java.io.*;

public class EncodingFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\jzh\\Desktop\\加密解密\\加密文档.txt");
        char[] cs1 = new char[(int) file.length()];
        try (FileReader fr = new FileReader(file)) {
            fr.read(cs1);
            for (int i = 0; i < (int) cs1.length; i++) {
                if (Character.isDigit(cs1[i])) {
                    cs1[i]++;
                } else if (Character.isLetter(cs1[i])) {
                    cs1[i] = (char) (cs1[i] - 25);
                } else {
                    cs1[i]++;
                }
                System.out.printf("" + cs1[i]);
            }
            FileWriter fw = new FileWriter(file);
            fw.write(cs1);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bn = {(byte) 0xE5, (byte) 0xB1, (byte) 0x8C};
        try {
            String en = new String(bn, "UTF-8");
            System.out.println(en);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
