import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionDemo {
    public static void main(String[] args){
        CollectionDemo obj = new CollectionDemo();
        List<String> list = new ArrayList<>();
        list.add("Serah");
        list.add("Mereena");
        list.add("Robin");
        ConcurrentHashMap <Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"Hello");
        map.put(2,"Hello world");
        map.put(3,"Hello earth");


        Collections.sort(list);
        System.out.println(map);

        for(String s:list){
            System.out.println(s);
        }
    }
}
