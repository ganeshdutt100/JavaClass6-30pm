package Collection;

import java.util.Calendar;

public class Class2 {
    public static void main(String[] args) {



Calendar calendar = Calendar.getInstance();
// Retrieve individual components
int year = calendar.get(Calendar.YEAR);
int month = calendar.get(Calendar.MONTH) + 1; // Adding 1 because

int day = calendar.get(Calendar.DAY_OF_MONTH);
int hour = calendar.get(Calendar.HOUR_OF_DAY);
int minute = calendar.get(Calendar.MINUTE);
int second = calendar.get(Calendar.SECOND);
// Print the current date and time
 System.out.println("Current Date and Time: " + year + "-" + month + "-" +
        day + " " + hour + ":" + minute + ":" + second);
 }
         }
