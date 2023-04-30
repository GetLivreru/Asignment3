import java.util.Random;
public class Main {
    public static void main(String[] args) {
       
    }
}
// Class Student
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // Class MyTestingClass
    public class MyTestingClass {
    private int x;
    private int y;

    public MyTestingClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        // implement your own hashCode() method
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
    //class MyHashTable
   public class MyHashTable<K,V>{
       private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private Entry<K, V>[] table;
    private int size;

    public MyHashTable() {
        this(DEFAULT_CAPACITY);
    }

    public MyHashTable(int capacity) {
        this.table = new Entry[capacity];
        this.size = 0;
    }
       public void put(K key, V value) {
        int index = hash(key);
        Entry<K, V> entry = table[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
            entry = entry.next;
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
        size++;
        if (size >= table.length * LOAD_FACTOR) {
            resize();
        }
    }
       
       
       
       
   }
   
}
