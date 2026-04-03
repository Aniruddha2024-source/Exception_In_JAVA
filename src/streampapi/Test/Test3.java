package streampapi.Test;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {

        System.out.println("List to stream");

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.stream().forEach(System.out::println);

        System.out.println("set to stream");
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(40);
        set.stream().forEach(System.out::println);

        System.out.println("Map to stream");
        Map<Integer, String> map = new HashMap<>();
        map.put(20, "Roni");
        map.put(30, "Ishani");
        map.put(40, "Pontu");
//        map.entrySet().stream().forEach(System.out::println);
        map.entrySet().stream().forEach(entry ->
                System.out.println(entry.getKey() + "->" + entry.getValue())
        );
    }
}
