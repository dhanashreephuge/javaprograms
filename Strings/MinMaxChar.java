// Java Program to find maximum and minimum occurring character in a string.
/*STEP 1: START
STEP 2: DEFINE String str = "grass is greener on the other side"
STEP 3: INITIALIZE minChar, maxChar.
STEP 4: DEFINE i, j, min, max.
STEP 5: CONVERT str into char string[].
STEP 6: SET i =0. REPEAT STEP 7 to STEP 11 UNTIL i
STEP 7: SET array freq[i] =1
STEP 8: SET j =i+1. REPEAT STEP 9 to STEP 10 UNTIL j
STEP 9: IF (string[i] == string[j] && string[i] != ' ' && string[i] != '0')
              then
              freq[i] = freq[i] + 1
              SET string[j] = 0
STEP 10: j = j +1
STEP 11: i = i + 1
STEP 12: SET min = max = freq[0]
STEP 13: SET i =0. REPEAT STEP 14 to STEP 16 UNTIL i
STEP 14: IF(min>freq[i] && freq[i]!=0) then
              min = freq[i]
              minChar[] = string[i]
STEP 15: IF max is lesser than freq[i]then
              max = freq[i]
              maxChar[] = string[i]
STEP 16: i =i +1
STEP 17: PRINT minChar
STEP 18: PRINT maxChar
STEP 19: END */


public class MinMaxChar {
    public static void main(String[] args) {    
        String str = "grass is greener on the other side";    
        int[] freq = new int[str.length()];    
        char minChar = str.charAt(0), maxChar = str.charAt(0);    
        int i, j, min, max;            
            
        //Converts given string into character array    
        char string[] = str.toCharArray();    
            
        //Count each word in given string and store in array freq    
        for(i = 0; i < string.length; i++) {    
            freq[i] = 1;    
            for(j = i+1; j < string.length; j++) {    
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {    
                    freq[i]++;    
                        
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
        }    
            
        //Determine minimum and maximum occurring characters    
        min = max = freq[0];    
        for(i = 0; i <freq.length; i++) {    
                
            //If min is greater than frequency of a character     
            //then, store frequency in min and corresponding character in minChar    
            if(min > freq[i] && freq[i] != '0') {    
                min = freq[i];    
                minChar = string[i];    
            }    
            //If max is less than frequency of a character     
            //then, store frequency in max and corresponding character in maxChar    
            if(max < freq[i]) {    
                max = freq[i];    
                maxChar = string[i];    
            }    
        }    
         
        System.out.println("Print string: " + str);  
        System.out.println("Minimum occurring character: " + minChar);    
        System.out.println("Maximum occurring character: " + maxChar);    
    }    
}    
