public class MyHashTable<K, V> {
    private int size;
    private int capacity;
    private LinkedList<Entry<K, V>>[] table;

    public MyHashTable() {
        this.capacity = 16;
        this.table = new LinkedList[capacity];
    }
}
