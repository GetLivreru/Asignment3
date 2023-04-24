public class MyHashTable<K, V> {
    private int size;
    private int capacity;
    private LinkedList<Entry<K, V>>[] table;

    public MyHashTable() {
        this.capacity = 16;
        this.table = new LinkedList[capacity];
    }
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        // getters and setters omitted for brevity
 }
