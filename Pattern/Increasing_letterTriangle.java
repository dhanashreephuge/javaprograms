public class Increasing_letterTriangle {
    static void pattern14(int N)
{
     
      for(int i=0;i<N;i++){
          
          for(char ch = 'A'; ch<='A'+i;ch++){
              System.out.print(ch + " ");
              
          }
         
          System.out.println();
         
      }
}

    public static void main(String[] args) {
        
        int N = 5;
        pattern14(N);
    }
}