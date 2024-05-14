class Trie {
    private class TrieNode {
        private TrieNode[] children;
        private boolean isEndOfWord;

        public TrieNode() {
            this.children = new TrieNode[26]; // Assuming only lowercase English letters
            this.isEndOfWord = false;
        }
    }
    private TrieNode root;

    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current=root;
        for(char c:word.toCharArray()){
            int index=c-'a';
            if(current.children[index]==null){
                current.children[index]=new TrieNode();
            }
            current=current.children[index];
        }
        current.isEndOfWord=true;
    }
    
    public boolean search(String word) {
        TrieNode current=root;
        for(char c:word.toCharArray()){
             int index=c-'a';
            if(current.children[index]==null){
                return false;
            }
            current=current.children[index];
        }
        return current.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
                TrieNode current=root;
        for(char c:prefix.toCharArray()){
             int index=c-'a';
            if(current.children[index]==null){
                return false;
            }
            current=current.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */