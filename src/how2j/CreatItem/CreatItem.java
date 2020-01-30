package how2j.CreatItem;

public class CreatItem {
    //static类方法调用普通方法，必须先实例化对象
    public static void main(String[] args) {
        Item i1=new Item("s");
//        Item i1 = Item.getInstance();
        i1.setName("血瓶");
        i1.setPrice(50);
        Weapon i2 = new Weapon();
        i2.setName("护甲");
        i2.setPrice(100);
        //不同包的protected子类可访问
        i2.setHp(500);
        i2.setAc(3);
        System.out.println(i2.equals(i1));
        Weapon h;
        for (int i = 0; i < 100; i++) {
            //不断生成新的对象
            //每创建一个对象，前一个对象，就没有引用指向了
            //那些对象，就满足垃圾回收的条件
            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
            //一旦这个对象被回收，它的finalize()方法就会被调用
            h = new Weapon();
        }
    }
}

