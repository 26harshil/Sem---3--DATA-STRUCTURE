import java.util.LinkedList;

public class CustomHashTable<K, V> {
    // Bucket Array for separate chaining
    private LinkedList<Entry<K, V>>[] bucketArray;
    private int numBuckets;  // Capacity of the hash table
    private int size;        // Number of key-value pairs in the hash table

    // Entry class to represent key-value pairs
    static class Entry<K, V> {
        K key;
        V value;
        
        // Constructor
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the hash table
    public CustomHashTable() {
        numBuckets = 10;  // Initial number of buckets
        bucketArray = new LinkedList[numBuckets];
        size = 0;
        
        // Initialize each bucket with an empty LinkedList
        for (int i = 0; i < numBuckets; i++) {
            bucketArray[i] = new LinkedList<>();
        }
    }

    // Hash function to get the index for a key
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % numBuckets);
    }

    // Method to insert a key-value pair into the hash table
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = bucketArray[bucketIndex];
        
        // Check if the key already exists, and update its value if so
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;  // Update the value
                return;
            }
        }
        
        // If key does not exist, add a new entry to the bucket
        bucket.add(new Entry<>(key, value));
        size++;
    }

    // Method to retrieve the value for a given key
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = bucketArray[bucketIndex];
        
        // Search for the key in the bucket
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;  // Return the value if found
            }
        }
        
        // Return null if the key is not found
        return null;
    }

    // Method to remove a key-value pair from the hash table
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = bucketArray[bucketIndex];
        
        // Search for the key in the bucket
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                V value = entry.value;
                bucket.remove(entry);  // Remove the entry from the bucket
                size--;
                return value;  // Return the removed value
            }
        }
        
        // Return null if the key is not found
        return null;
    }

    // Method to get the size of the hash table
    public int size() {
        return size;
    }

    // Method to check if the hash table is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Main method for testing the hash table
    public static void main(String[] args) {
        CustomHashTable<String, Integer> hashTable = new CustomHashTable<>();
        
        // Inserting key-value pairs
        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("grape", 30);
        hashTable.put("orange", 40);
        
        // Retrieving values
        System.out.println("Value for 'apple': " + hashTable.get("apple"));
        System.out.println("Value for 'banana': " + hashTable.get("banana"));
        
        // Removing a key
        System.out.println("Removed value for 'grape': " + hashTable.remove("grape"));
        
        // Size of hash table
        System.out.println("Size of hash table: " + hashTable.size());
        
        // Check if the hash table is empty
        System.out.println("Is hash table empty? " + hashTable.isEmpty());
    }
}
