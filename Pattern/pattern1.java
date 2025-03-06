public class pattern1 {
    public static void main(String []args){  
        int i,j,lines=5;  
   for(i=1;i<=lines;i++){// this loop is used to print the lines  
      for(j=lines;j>=1;j--){// this loop is used to print numbers in a line  
          if(j!=i)  
           System.out.print(j);  
           else  
            System.out.print("*");  
   }  
   System.out.println("");  
   }  
    }}   
    

// =======================================================================
// Java program to print the following pattern
// 5432*
// 543*1
// 54*21
// 5*321
// *4321

// Algorithm:
// STEP 1: START
// STEP 2: DEFINE i, j.
// STEP 3: SET lines=5
// STEP 4: SET i=1. REPEAT STEP 5 to STEP 10 UNTIL i <= lines
// STEP 5: SET j=lines
// STEP 6: REPEAT STEP 7 and 8 UNTIL j >= 1
// STEP 7: IF j!=i then PRINT j
//                 else PRINT *
// STEP 8: j=j-1
// STEP 9: PRINT new line.
// STEP 10: i=i+1
// STEP 11: END
