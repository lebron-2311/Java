package MapSet;

import java.util.*;

public class Test {
    public static void main1(String[] args) {
       HashBuck hashBuck=new HashBuck();
       hashBuck.push(1,1);
       hashBuck.push(2,2);
       hashBuck.push(3,3);
       hashBuck.push(9,9);
       System.out.println(hashBuck.get(3));
       hashBuck.push(11,11);
    }

    public static void main2(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        map.put("美国队长",1);
        map.put("钢铁侠",3);
        map.put("黑寡妇",5);
        map.put("雷神",7);
        map.put("浩克",9);
        map.put("鹰眼",11);
       for(Map.Entry<String,Integer> entry:map.entrySet()){
           String key=entry.getKey();
           Integer val=entry.getValue();
           System.out.println(key+"=>"+val);
       }
       Integer val=map.getOrDefault("旺达与幻视",99);
       System.out.println(val);

        Set<String> set=map.keySet();
        System.out.println("set: "+set);
    }

    public static void main3(String[] args) {
    Set<String> set =new TreeSet<>();
    set.add("hello");
    set.add("world");
    set.add("Java");
    set.add("Python");
        for(String x:set){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        Integer value= map.getOrDefault("c",4);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String key=entry.getKey();
            Integer val=entry.getValue();
            System.out.println(key+"=>"+val);
        }
        System.out.println("Value of key 'c': " + value);
    }

}
