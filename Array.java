public class Array {
    private int count = 0;
    private int[] items;

    public Array(int lenght) {
        items = new int[lenght];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int value) {
        if (count != items.length) {
            items[count] = value;
            count++;
        } else {
            int[] newItems = new int[items.length * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
            items[count] = value;
            count++;
        }
    }

    public void removeAt(int index) {
        if (index > count || index < 0) {
            System.out.println("not valid index");
        } else {
            for (int i = index; i <= count; i++) {
                items[i - 1] = items[i];
            }
            count--;
        }
    }
    public int indexOf(int number){
        for (int i = 0 ; i < count; i++){
            if (items[i] == number){
                return i;
            }
        }
        return -1;
    }

}
















