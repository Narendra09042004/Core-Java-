public class FindTheMissingNumberArray
{
    static void main()
    {
        int[] arr = {1,2,3,4,5,6,8,9,10};

        int numbers = arr.length + 1;
        int TotalSum = numbers * (numbers+1) / 2;

        int sumOfArray = 0;
        int missingNum;

        for(int i=0; i< arr.length; i++)
        {
            sumOfArray = arr[i] + sumOfArray;
        }
        missingNum = TotalSum - sumOfArray;
        System.out.println(missingNum);
    }
}
