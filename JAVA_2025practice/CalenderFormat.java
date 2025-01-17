import java.io.*;
//Importing Date and time specific Classes
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CalenderFormat {
	 public static void main(String[] args)
	    {
	        // Create date time object and store current time in
	        // default format yy-mm-dd
	        LocalDateTime date = LocalDateTime.now();
	 
	        // Specify the date format
	        // Note: more than 3 characters result in full name
	        DateTimeFormatter myDateFormat
	            = DateTimeFormatter.ofPattern(
	                "EEEE, dd MMM yyyy");
	        // e.g- MMM = Oct and MMMM = October
	 
	        // Change date into req format and store it in
	        // string object
	        String formattedDate = date.format(myDateFormat);
	 
	        // Printing formatted date
	        System.out.println(formattedDate);
	    }
	}