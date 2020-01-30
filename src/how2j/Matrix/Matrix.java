package how2j.Matrix;

public class Matrix {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        //增强for用于访问
        for (int i : a) {
            System.out.print(i + " ");
        }
        int tmp = 0;
        int len = a.length;
        for (int i = 0; i < len / 2; i++) {
            tmp = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] = tmp;
        }
        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
        //二维数组
        int[][] b = new int[5][5];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        int[] c = new int[25];
        for (int i = 0; i < b.length; i++) {
            System.arraycopy(b[i], 0, c, b[i].length * i, b[0].length);
        }
        for (int i : c) {
            System.out.print(i+" ");
        }
    }
}