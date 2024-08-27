public class Crownpattern {
    static void pattern12(int N)
    {
        
         int spaces = 2*(N-1);
         
        
          for(int i=1;i<=N;i++){
              
              
              for(int j=1;j<=i;j++){
              System.out.print(j);
              }
              
            
              for(int j = 1;j<=spaces;j++){
              System.out.print(" ");
              }
              
              
              for(int j=i;j>=1;j--){
               System.out.print(j);
              }
              
              
              System.out.println();
              
              spaces-=2;
          }
    }
    
        public static void main(String[] args) {
            
            int N = 5;
            pattern12(N);
        }
    }
