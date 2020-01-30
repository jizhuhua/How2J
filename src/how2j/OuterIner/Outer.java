package how2j.OuterIner;

public class Outer {
    private String privateS="我是内部类方法";

    class Inner {
        public void say() {
            //但静态内部类不能访问外部类非静态方法
            System.out.println(privateS);
        }
    }
}
