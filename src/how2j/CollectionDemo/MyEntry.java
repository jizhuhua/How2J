package how2j.CollectionDemo;

//键值对
public class MyEntry {
    public Object key;//key
    public Object value;

    public MyEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[key=" + key + ", value=" + value + "]";
    }

}
