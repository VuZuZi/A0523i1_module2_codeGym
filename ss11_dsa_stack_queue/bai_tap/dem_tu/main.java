package ss11_dsa_stack_queue.bai_tap.dem_tu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        demTuTreeMap map = new demTuTreeMap();
        Map<String,Integer> map1 = new TreeMap();
        map.add("a");
        map.add("a");
        map.add("a");
        map.add("b");
        map1.put("s",3);
//        System.out.println(map1);
        map.print();
    }
}
