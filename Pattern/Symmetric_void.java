public class Symmetric_void {
    static void pattern19(int N)
{
      int iniS = 0;
      for(int i=0;i< N;i++){
          
          for(int j=1;j<=N-i;j++){
              System.out.print("*");
          }
          
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          
          for(int j=1;j<=N-i;j++){
              System.out.print("*");
          }
          
          iniS+=2;
          
          System.out.println();
      }
      
      iniS = 2*N -2;
      for(int i=1;i<=N;i++){
          
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          
          iniS-=2;
          
          System.out.println();
      }
}

    public static void main(String[] args) {
        
        int N = 5;
        pattern19(N);
    }
}