public class RightPyramid2 {
    static void pattern(int N)
{
   
    for (int i = 1; i <= N; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print(i+" ");
        }

        System.out.println();
    }
}

    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}
