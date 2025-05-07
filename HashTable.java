import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

    }


    private LinkedList<Entry>[] enteries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (enteries[index] == null)
            enteries[index] = new LinkedList<>();
        var bucket = enteries[index];
        for (var entry : bucket){
            if (entry.key == key){
                entry.value = value;
                return;
            }
        }
        bucket.addLast(new Entry(key,value));

    }
    public String get(int key){
        var index = hash(key);
        var bucket = enteries[index];
        if (bucket != null){
            for (var entry : bucket){
                if (entry.key == key)
                    return entry.value;
            }
        }
        return null;
    }

    private int hash(int key) {
        return key % enteries.length;
    }
}
