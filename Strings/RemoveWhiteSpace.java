// Java Program to remove all the white spaces from a string
/*STEP 1: START
STEP 2: DEFINE string str1 = "Remove white spaces".
STEP 3: REPLACE all space characters with blank using replaceAll().
STEP 4: PRINT str1.
STEP 5: END */

public class RemoveWhiteSpace {
    public static void main(String[] args) {    
            
        String str1="Remove white spaces";    
            
        //Removes the white spaces using regex    
        str1 = str1.replaceAll("\\s+", "");    // str1 = str1.replaceAll("\\s+", "");
            
        System.out.println("String after removing all the white spaces : " + str1);    
    }    
}    