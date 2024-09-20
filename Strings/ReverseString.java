public class ReverseString {
    public static void main(String[] args) {    
        String string = "Dream big";    
        //Stores the reverse of given string    
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
           
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
}    

/*STEP 1: START
STEP 2: DEFINE String string = "Dream big"
STEP 3: DEFINE reversedStr = " "
STEP 4: SET i =string.length()-1. REPEAT STEP 5 to STEP 6 UNTIL i>=0
STEP 5: reversedStr = reversedStr + string.charAt(i)
STEP 6: i = i - 1
STEP 7: PRINT string.
STEP 8: PRINT reversedStr.
STEP 9: END */