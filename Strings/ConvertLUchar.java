//Java Program to replace lower-case characters with upper-case and vice-versa
public class ConvertLUchar {
    public static void main(String[] args) {    
            
        String str1="Great Power";    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
            //Checks for lower case character    
            if(Character.isLowerCase(str1.charAt(i))) {    
                //Convert it into upper case using toUpperCase() function    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(str1.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    }    
}     


/*STEP 1: START
STEP 2: DEFINE string str = "Great Power".
STEP 3: DEFINE newstr as StringBuffer object .
STEP 4: SET i=0. REPEAT STEP 5 to STEP 6 UNTIL i<str.length().
STEP 5: IF lower-case character encountered then CONVERT them in upper-case using built-in function
else
IF upper-case character encountered then CONVERT them in lower-case characters using built-in function.
STEP 6: i=i+1
STEP 7: PRINT newstr.
STEP 8: END */