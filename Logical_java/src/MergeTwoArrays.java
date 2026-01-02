import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays
{
    static void main() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] merge = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();

        for(int i=0;i<merge.length;i++)
        {
            System.out.println(merge[i]);
        }
    }
}
