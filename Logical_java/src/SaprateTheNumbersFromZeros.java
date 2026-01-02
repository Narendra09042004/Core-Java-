import java.util.*;
import java.util.stream.*;

public class SaprateTheNumbersFromZeros
{
    public static void main()
    {
//        List<Integer> list = List.of(1,5,2,0,3,0,6,0);
//
//        // this is the best and sortest way to convert the list using stream api.
//        List<Integer> moveZeros = Stream.concat(list.stream().filter(n->n==0),
//                list.stream().filter(n->n!=0)).toList();
//
//        System.out.println(moveZeros);
//
//        // now we convert using for loop.
//
//        List<Integer> zeroList = new ArrayList<>();
//        List<Integer> nonZeroList = new ArrayList<>();
//
//        for(Integer convert:list)
//        {
//            if(convert==0)
//            {
//                zeroList.add(convert);
//            }
//            if(convert!=0)
//            {
//                nonZeroList.add(convert);
//            }
//        }
//        System.out.println(zeroList);
//        System.out.println(nonZeroList);
//
//        List<Integer> murgeList = new ArrayList<>();
//
//        murgeList.addAll(zeroList);
//        murgeList.addAll(nonZeroList);
//
//        System.out.println(murgeList);

        //---------------------------------------------------------------------------------------------------------
        // using arrays->

        int[] arr = {0,1,3,1,0};

        int[] zeros = new int[arr.length];
        int[] NonZeros = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr[i] = zeros[i];
                break;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                NonZeros[i] = arr[i];
            }
        }

        for(int i=0;i< zeros.length;i++)
        {
            System.out.println(zeros[i]);
        }
    }
}
