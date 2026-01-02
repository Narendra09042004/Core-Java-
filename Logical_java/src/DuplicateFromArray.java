import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFromArray
{
    static void main()
    {
        // Using collections
        int[] arr = {1,2,4,2,3,1};

        Set<Integer> NonDuplicates = new HashSet<>();
        Set<Integer> Duplicates = new HashSet<>();

        for(Integer data : arr)
        {
            if(!NonDuplicates.add(data))
            {
                Duplicates.add(data);
            }
        }

        System.out.println(Duplicates);

        // using array
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
