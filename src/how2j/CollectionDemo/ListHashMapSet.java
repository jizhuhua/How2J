package how2j.CollectionDemo;

import java.util.*;

public class ListHashMapSet {
    public static void main(String[] args){
//        名字作为key，名字相同的list作为value
//        List<Object> list = new ArrayList<>();
//        HashMap<String, List<Object>> heroHashMap = new HashMap();
//        for (Object obj : list){
//            List<Object> values = heroHashMap.get(obj.key);
//            if (values == null){
//                values = new ArrayList<>();
//                heroHashMap.put(obj.key,values);
//            }
//            values.add(obj);
//        }
        //生成50个不重复的数
//        HashSet<Integer> ts = new HashSet<>();
//        while(ts.size() != 50){
//            int a = (int)(Math.random()*10000);
//            ts.add(a);
//        }
        Comparator c=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
//        Collections.sort(list,c);
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {//Comparator接口
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1<o2)
                    return 1;
                else
                    return -1;
            }
        });
    }
}
