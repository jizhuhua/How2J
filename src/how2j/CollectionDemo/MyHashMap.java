package how2j.CollectionDemo;

import java.util.LinkedList;
import java.util.List;

public class MyHashMap implements iHashMap {
    private Object[] table = new Object[2000];
    @Override
    public void put(String key, Object obj) {
        MyEntry myEntry = new MyEntry(key, obj);
        int index = key.hashCode() % table.length;
        LinkedList<MyEntry> list = null;
        if (table[index] == null) {
            list = new LinkedList<>();
            list.add(myEntry);
            table[index] = list;
        } else {
            list.add(myEntry);
        }
    }

    @Override
    public Object get(String key) {
        Object value = null;
        int index = key.hashCode() / table.length;
        if (table[index] == null) {
            return value;
        } else {
            for (MyEntry i:(List<MyEntry>)table[index]) {
                if (i.key.equals(key)) {
                    return i.value;
                }
            }
        }
        return null;
    }
}
