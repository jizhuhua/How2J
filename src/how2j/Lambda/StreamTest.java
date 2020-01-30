package how2j.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamTest {
    @Test
    public void testStream() {

        Random random = new Random();
        List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero" + i, random.nextFloat(), random.nextFloat()));
        }
        heros.stream().
                filter(h -> h.hp > 100 && h.damage < 50).
                forEach(h -> System.out.print(h));

        System.out.println("去除重复的数据，去除标准是看equals");
        heros.stream().
                distinct().
                forEach(h -> System.out.println(h));
        System.out.println("按照血量排序");
        heros.stream().
                sorted((h1, h2) -> h1.hp >= h2.hp ? 1 : -1).
                forEach(h -> System.out.println(h));

        System.out.println("保留3个");
        heros.stream().
                limit(3).
                forEach(h -> System.out.println(h));

        System.out.println("忽略前3个");
        heros.stream().
                skip(3).
                forEach(h -> System.out.println(h));


        System.out.println("转换任意类型的Stream");
        heros.stream().
                map((h) -> h.name.toUpperCase() + " - " + h.hp + " - " + h.damage).
                forEach(h -> System.out.println(h));
    }
}