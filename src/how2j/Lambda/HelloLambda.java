package how2j.Lambda;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Hero implements Comparable<Hero> {
    public String name;
    public float hp;
    public float damage;
    public final int _MULTIPLE = 100;

    public Hero() {
    }//重写了构造方法，要补上默认构造方法

    public Hero(String name, float hp, float damage) {
        this.name = name;
        this.hp = _MULTIPLE * hp;
        this.damage = _MULTIPLE * damage;
    }

    @Override
    public int compareTo(Hero o) {
        if (this.hp == o.hp) {
            return (int) (this.damage - o.damage);
        }
        return (int) (this.hp - o.hp);
    }

    @Override
    public String toString() {
        return this.name + " " + this.hp + " " + this.damage;
    }
    /**引用list容器中Hero对象的方法
     public boolean test() {
     return this.hp>50&&this.damage>50;
     }
     */
}

interface HeroChecker {
    public boolean test(Hero hero);
}

//返回一个对象的接口
interface Supplier<T> {
    T get();
}
//

public class HelloLambda {
    @Test
    public  void testLambda() {
        Random random = new Random();
        List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero" + i, random.nextFloat(), random.nextFloat()));
        }

        /**
         HeroChecker heroChecker = new HeroChecker() {
        @Override public boolean test(Hero hero) {
        return hero.hp > 50 && hero.damage > 50;
        }
        };
         filter(heros,heroChecker);
         */

        filter(heros, hero -> hero.hp > 50 && hero.damage > 50);
        /**应用静态方法
         filter(heros,HelloLambda::test);
         */

        /**引用对象方法
         HelloLambda itself = new HelloLambda();
         filter(heros,itself::test);
         */

        /**引用list容器中对象的方法
         filter(heros,Hero::test);
         */

        /**引用构造方法
         //Hero getHero = getHero(() -> new Hero());
         Hero getHero = getHero(Hero::new );

         */

    }

    public  void filter(List<Hero> heros, HeroChecker heroChecker) {
        for (Hero hero : heros) {
            if (heroChecker.test(hero)) {
                System.out.println(hero);
            }
        }
    }

    //返回对象接口做参数，来返回一个Hero
    public  Hero getHero(Supplier<Hero> s) {
        return s.get();
    }

    /**引用静态方法
     public static boolean test(Hero hero) {
     return hero.hp > 50 && hero.damage > 50;
     }
     */
    /**引用对象方法
     public boolean test(Hero hero) {
     return hero.hp > 50 && hero.damage > 50;
     }
     */
}
