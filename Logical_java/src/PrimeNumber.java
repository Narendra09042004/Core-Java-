public class PrimeNumber
{
    static void main() {

        for(int i=2;i<=100;i++)
        {
            boolean prime = true;

            if(i>0)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        prime = false;
                    }
                }
            }
            else
            {
                prime = false;
            }

            if(prime)
            {
                System.out.println(i);
            }
        }

    }
}
