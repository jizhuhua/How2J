package how2j.CreatItem;

//商品类
class Item {
    private String name;
    private int price;
    protected float hp;

    //父类未提供无参构造，子类必须先super有参构造
    public Item(String s){}
//    饿汉式单例
//    构造器被private不能被继承，除非有其他构造器
//    private Item() {
//    }
//
//    饿汉式论用不用getInstance方法都会创建一个实例
//    private static Item i = new Item();
//
//    public static Item getInstance() {
//        return i;
//    }

//    懒汉式单例
//    private Item() {
//    }
//
//    懒汉式论不用getInstance方法没有指向实例
//    private static Item i ;
//
//    public static Item getInstance() {
//    if(i==null){
//    private构造器可以自己访问
//        i=new Item();
//    }
//        return i;
//    }
    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("父类清理");
    }
}
