import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortHashMapByValue
{
    static void main() {
        Map<String,Integer> map = new HashMap<>();
        map.put("narendra",20);
        map.put("raju",25);
        map.put("satish",18);
        map.put("rajan",18);

        // using Stream api
//        map.entrySet()
//                .stream().sorted(Map.Entry.comparingByValue())
//                .forEach(e-> System.out.println(e.getKey()+ " " + e.getValue()));

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        // here i'm convert it into a list and print.
//        System.out.println(list);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> convertedData : list)
        {
            sortedMap.put(convertedData.getKey(),convertedData.getValue());
        }
        System.out.println(sortedMap);

    }
}
