public class Alpha_RampPatteren {
    static void pattern16(int N)
{
     
      for(int i=0;i<N;i++){
          
          
          for(int j=0;j<=i;j++){
              
              System.out.print((char)((int)('A'+i)) + " ");
              
          }
         
          System.out.println();
         
      }
}

    public static void main(String[] args) {
        
        int N = 5;
        pattern16(N);
    }
}
