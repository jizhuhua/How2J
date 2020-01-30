package how2j.MyString;

public class MyString {
    private String s;
    public void setS(String string) {
        this.s = string;
    }
    public String append(String string) {
        char[] c = s.toCharArray();
        char[] tmp = string.toCharArray();
        char[] res = new char[c.length + tmp.length];
        for (int i = 0; i < c.length; i++) {
            res[i] = c[i];
        }
        for (int i = c.length; i < c.length + tmp.length; i++) {
            res[i] = tmp[i - c.length];
        }
        return new String(res);
    }

    public String insert(int pos, String b) {
        char[] c=s.toCharArray();
        char[] bc=b.toCharArray();
        char[] res = new char[c.length + bc.length];
        for (int i = 0; i < pos; i++) {
            res[i]=c[i];
        }
        for (int i = pos, j = 0; j < b.length(); i++, j++) {
            res[i] = bc[j];
        }
        for (int i = pos + b.length(),j=pos; i < res.length; i++,j++) {
            res[i] = c[j];
        }
        return new String(res);
    }

}
