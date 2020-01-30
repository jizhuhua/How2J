package how2j.InterfaceDemo;

//一个源文件只能有一个public class，但一个包可以有多个
public class ADHero implements AD {

    @Override
    public void say() {
        System.out.println("我是ADHero");
    }

    public static void hide() {
        System.out.println("我是父类hide");
    }
}
