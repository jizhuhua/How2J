package how2j.CreatItem;

public class Weapon extends Item {
    private int ac;

    //通过this访问另一个构造器
    public Weapon() {
        this("ssss");
    }

    public Weapon(String s) {
        super("s");
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("子类清理");
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Weapon;
    }
}
