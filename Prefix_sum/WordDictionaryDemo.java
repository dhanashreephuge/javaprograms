public class WordDictionaryDemo {

    // Inner class WordDictionary with Trie implementation
    static class WordDictionary {

        private class TrieNode {
            TrieNode[] children = new TrieNode[26];
            boolean isWord = false;
        }

        private TrieNode root;

        public WordDictionary() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                int idx = ch - 'a';
                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }
                node = node.children[idx];
            }
            node.isWord = true;
        }

        public boolean search(String word) {
            return searchInNode(word, 0, root);
        }

        private boolean searchInNode(String word, int index, TrieNode node) {
            if (node == null) return false;
            if (index == word.length()) return node.isWord;

            char ch = word.charAt(index);
            if (ch == '.') {
                for (TrieNode child : node.children) {
                    if (child != null && searchInNode(word, index + 1, child)) {
                        return true;
                    }
                }
                return false;
            } else {
                int idx = ch - 'a';
                return searchInNode(word, index + 1, node.children[idx]);
            }
        }
    }

    // Main method to run the test cases
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");

        System.out.println(wordDictionary.search("pad")); // false
        System.out.println(wordDictionary.search("bad")); // true
        System.out.println(wordDictionary.search(".ad")); // true
        System.out.println(wordDictionary.search("b..")); // true
    }
}
