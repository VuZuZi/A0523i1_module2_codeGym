package ss11_dsa_stack_queue.bai_tap.dem_tu;

import java.util.Map;
import java.util.TreeMap;

public class demTuTreeMap {
    public String str;
    public Map<String, Integer> map;
    public demTuTreeMap() {
        map = new TreeMap();
    }
    public void add(String str){
        str = str.toLowerCase();
        if(map.containsKey(str)){
            int num = map.get(str)+1;
            map.put(str,num);
        }else {
            map.put(str, 1);
        }
    }
    public void print(){
        System.out.println(map);
    }
}
