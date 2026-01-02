import java.util.HashMap;
import java.util.Map;

public class RepeatedStringCountProgram
{
    static void main() {

        String line = "narendra";
        String[] words = line.split("");

        Map<String, Integer> map = new HashMap<>();

        for(String word : words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
    }
}
