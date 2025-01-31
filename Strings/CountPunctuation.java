public class CountPunctuation {    
    public static void main(String args[]) {    
        // Stores the count of punctuation marks    
        int count = 0;    
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";    

        for (int i = 0; i < str.length(); i++) {    
            // Checks whether given character is a punctuation mark    
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  
                str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '"' || str.charAt(i) == ':') {    
                count++;    
            }    
        }    

        // Corrected output message  
        System.out.println("The number of punctuation marks in the string is: " + count);    
    }    
}    
