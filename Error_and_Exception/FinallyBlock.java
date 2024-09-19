// Case 1: When an exception does not occur

public class FinallyBlock {
    public static void main(String args[]){    
        try{    
      //below code do not throw any exception  
         int data=25/5;    
         System.out.println(data);    
        }    
      //catch won't be executed  
        catch(NullPointerException e){  
      System.out.println(e);  
      }    
      //executed regardless of exception occurred or not  
       finally {  
      System.out.println("finally block is always executed");  
      }    
          
      System.out.println("rest of phe code...");    
        }    
        
}

//==================================================================================

//Case 2: When an exception occurr but not handled by the catch block
/* 
 * public class TestFinallyBlock1{    
      public static void main(String args[]){   
  
      try {    
  
        System.out.println("Inside the try block");  
          
        //below code throws divide by zero exception  
       int data=25/0;    
       System.out.println(data);    
      }    
      //cannot handle Arithmetic type exception  
      //can only accept Null Pointer type exception  
      catch(NullPointerException e){  
        System.out.println(e);  
      }   
  
      //executes regardless of exception occured or not   
      finally {  
        System.out.println("finally block is always executed");  
      }    
  
      System.out.println("rest of the code...");    
      }    
    }    
*/
//===================================================================================

// Case 3: When an exception occurs and is handled by the catch block
/* public class TestFinallyBlock2{    
      public static void main(String args[]){   
  
      try {    
  
        System.out.println("Inside try block");  
  
        //below code throws divide by zero exception  
       int data=25/0;    
       System.out.println(data);    
      }   
  
      //handles the Arithmetic Exception / Divide by zero exception  
      catch(ArithmeticException e){  
        System.out.println("Exception handled");  
        System.out.println(e);  
      }   
  
      //executes regardless of exception occured or not   
      finally {  
        System.out.println("finally block is always executed");  
      }    
  
      System.out.println("rest of the code...");    
      }    
    }  */