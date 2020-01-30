package how2j.IODemo;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileUpload {
    public static void main(String[] args) {
        File path = getPath();
        System.out.println(path);
        if (isExist(path)) {
            System.out.println("已存在");
        } else {
            try {
                upLoadFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 上传图片到目标目录
     *
     * @param src
     */
    private static void upLoadFile(File src) throws IOException {
        File dest = new File("libs/" + src.getName());
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(dest));
        int len;
        while ((len = bi.read()) != -1) {
            bo.write(len);
        }
        bo.close();
        bi.close();
        System.out.println("上传成功");
    }

    /**
     * 获取文件路径
     *
     * @return 文件
     */
    private static File getPath() {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        if (!path.endsWith(".jpg") && !path.endsWith(".png") && !path.endsWith(".bmp")) {
            System.out.println("不是图片");
        }
        File file = new File(path);
        if (file.isFile() && file.exists()) {
            return file;
        } else {
            System.out.println("文件路径有误");
        }
        return null;
    }

    /**
     * 文件是否在libs已存在
     *
     * @param path
     * @return 是否存在
     */
    private static boolean isExist(File path) {
        File file = new File("libs");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.getName().equals(path.getName())) {
                return true;
            }
        }
        return false;
    }
}

