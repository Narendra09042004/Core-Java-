import java.util.Arrays;

public class FindWordFromStringWithChar
{
    static void main()
    {
        String line = "apple banana mango box been fox bike";
        String[] words = line.split(" ");

//        for(String word : words)
//        {
//            if(word.contains("b"))
//            {
//                System.out.println(word);
//            }
//        }

        // using Stream
        Arrays.stream(words).filter(e->e.contains("b"))
                .forEach(sot-> System.out.println(sot));
    }
}
