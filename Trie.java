public class Trie {
    private static class Node {
        private final Node[] children = new Node[26];
        private boolean isEndOfWord;
    }

    private final Node root = new Node();


    public void insert(String word) {
        Node current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null)
                current.children[index] = new Node();

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }


    public boolean contains(String word) {
        Node current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null)
                return false;

            current = current.children[index];
        }

        return current.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        Node current = root;

        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null)
                return false;

            current = current.children[index];
        }

        return true;
    }
}
