package how2j.OuterIner;

public class OuterInnerDemo {
    public static void main(String[] args) {
        new Outer().new Inner().say();
        (new AbstractClass() {
            public void way() {
                //在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final
                System.out.println("我是匿名内部类");
            }
        }).way();
        class newOuterInnerDemo extends OuterInnerDemo {
            public void newWay() {
                System.out.println("我是本地类新方法");
            }
        }
        new newOuterInnerDemo().newWay();
    }
}
