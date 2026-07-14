class MyHashMap {
public:
    map<int , int> map;
    MyHashMap() {
        return;
    }
    
    void put(int key, int value) {
        map[key] = value;
        return;
    }
    
    int get(int key) {
        if(map.find(key) != map.end()){
            return map[key];
        }
        else return -1;
    }
    
    void remove(int key) {
        map.erase(key);
        return;
    }
};

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap* obj = new MyHashMap();
 * obj->put(key,value);
 * int param_2 = obj->get(key);
 * obj->remove(key);
 */