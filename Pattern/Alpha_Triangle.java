public class Alpha_Triangle {
    static void pattern18(int N)
    {
           for(int i=0;i<N;i++){
              
              for(char ch =(char)(int)('A'+N-1-i);ch<=(char)(int)('A'+N-1);ch++){
                  
                  System.out.print(ch + " ");
              }
              
              System.out.println();
          }
    }
    
        public static void main(String[] args) {
            
            int N = 5;
            pattern18(N);
        }
    }
