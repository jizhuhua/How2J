package how2j.InterfaceDemo;

public class InterfaceDemo {
    public static void main(String[] args){
        ADHero h = new ADHero();
        h.say();
        //引用也可以调用static方法
        ADHero.hide();
        h.hide();
        //接口向上转型(不需强转）
        AD ad =  h;
        ad.say();
        //接口向下转型（需强转,需ad接口有向下类的功能)
        ADHero h2 = (ADHero)ad;
        h2.say();
        //多态
        BDHero h3=new BDHero();
        //基类接口指向实现类
        ad=h3;
        ad.say();
        //子类重写了父类static方法
        ADHeroSon adHeroSon = new ADHeroSon();
        adHeroSon.hide();
        ADHeroSon.hide();
    }
}
