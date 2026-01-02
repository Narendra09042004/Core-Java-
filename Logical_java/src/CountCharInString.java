public class CountCharInString
{
    static void main() {

        String name = "raju";
        int count = 0;

        for(int i=0;i<10;i++)
        {
            if(name.charAt(i)>0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
