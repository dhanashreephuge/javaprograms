package usingenum;

public class EnumExample {
	// Define an enum called DayOfWeek
	enum DayOfWeek {
	    SUNDAY,
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY
	}

	    public static void main(String[] args) {
	        // Using the enum values
	        DayOfWeek day1 = DayOfWeek.MONDAY;
	        DayOfWeek day2 = DayOfWeek.FRIDAY;

	        // Printing enum values
	        System.out.println("First day of the week: " + day1);
	        System.out.println("Second day of the week: " + day2);

	        // Comparing enum values
	        if (day1 == DayOfWeek.MONDAY) {
	            System.out.println("It's Monday!");
	        }

	        // Switch statement with enum
	        switch (day2) {
	            case FRIDAY:
	                System.out.println("It's Friday!");
	                break;
	            case SATURDAY:
	            case SUNDAY:
	                System.out.println("It's the weekend!");
	                break;
	            default:
	                System.out.println("It's a weekday.");
	        }

	        // Iterating over enum values
	        System.out.println("All days of the week:");
	        for (DayOfWeek day : DayOfWeek.values()) {
	            System.out.println(day);
	        }
	    }


}
