import java.util.*;
class MyTestingClass{
    private int id;
    public MyTestingClass(int id){
        this.id = id;
    }
    // custom hashcode implementation
    @Override 
    public int hascode(){
        int hash = 17;
        hash = 31*hash+id;
        return hash;
    }
        // equals method to be used for testing purposes
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyTestingClass other = (MyTestingClass) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
        


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
