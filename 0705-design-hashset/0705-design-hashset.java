class MyHashSet {
    HashSet<Integer> set = new HashSet<>();


    public MyHashSet() {
        return;
    }
    
    public void add(int key) {
        set.add(key);
        return;
    }
    
    public void remove(int key) {
        set.remove(key);
        return;
    }
    
    public boolean contains(int key) {
        if(set.contains(key)) return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */