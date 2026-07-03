class MyHashSet {
public:
    unordered_set<int> set;

    MyHashSet() {
        return;
    }
    
    void add(int key) {
        set.insert(key);
        return;
    }
    
    void remove(int key) {
        set.erase(key);
        return;
    }
    
    bool contains(int key) {
        if(set.find(key) != set.end()) return true;
        else return false;
    }
};

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet* obj = new MyHashSet();
 * obj->add(key);
 * obj->remove(key);
 * bool param_3 = obj->contains(key);
 */