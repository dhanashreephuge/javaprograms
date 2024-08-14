public class InvertedStar {
    static void pattern(int N)
{
   
    for (int i = 0; i < N; i++)
    {
        for (int j = N; j > i; j--)
        {
            System.out.print("* ");
        }

        System.out.println();
    }
}

    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}
