import java.util.*;
import java.util.stream.Collectors;

public class DuplicatestFromCollections
{
    static void main() {
        List<Integer> list = new ArrayList<Integer>(List.of(1,2,1,4,2));

        Set<Integer> NonDuplicates = new HashSet<>();
        Set<Integer> Duplicates = new HashSet<>();

        for(Integer data : list)
        {
            if(!NonDuplicates.add(data))
            {
                Duplicates.add(data);
            }
        }
        System.out.println(Duplicates);

        //using Stream api

//        Set<Integer> duplicates = list.stream()
//                .filter(e-> Collections.frequency(list,e)>1)
//                .collect(Collectors.toSet());
//
//        System.out.println(duplicates);

    }
}
