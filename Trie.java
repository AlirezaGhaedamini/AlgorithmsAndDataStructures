public class Trie {
    private static class Node {
        private final Node[] children = new Node[26]; // 26 letters
        private boolean isEndOfWord;
    }

    private final Node root = new Node();

    // Insert a word into the trie
    public void insert(String word) {
        Node current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a'; // convert 'a' to 0, 'b' to 1, etc.

            if (current.children[index] == null)
                current.children[index] = new Node();

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }

    // Check if word exists in the trie
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

    // Check if any word in the trie starts with the given prefix
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
